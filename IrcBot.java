/*
 * Copyright (c) 2014 AeSix.com. 
 * Based on archive.oreilly.com/pub/h/1966 with unknown license, sufficient changes made to base.
 * This code is free to use, modify in regards to my corrections and extensions. O'Reilly does not
 * have a license specified for the original code - am assuming it is public / open. 
 * Gratitude to https://gist.github.com/chrisgward for assistance in overcoming ping-timeouts.
 */ 

import java.io.*;
import java.net.*;

public class XeniaBot {
	public static void main(String[] args) throws Exception {
		// The server to connect to and our details.
		String server = "ipv6.local.host";
		int port = 6667;
		String nick = "Xenia";
		String ident = "Xenia";
		String rname = "Xenium IRC Bot";
		String channel = "#AeSix";
		String outip = "todoClientConnectedHost";
		String altnick = "XeniaAlt";
		String botmstr = "AeSix";
		//TODO: implement ctcp handlers
		//String ctcpver = "Xenia IRC Bot v.003";
		//String ctcpfin = "By the wrath of the goats!";
		
		// Connect directly to the IRC server.
		//@SuppressWarnings("resource")
		Socket socket = new Socket(server,port);
		System.out.println("INFO: Connecting to server: " + server + ":" + port);
		BufferedReader reader = new BufferedReader(
				new InputStreamReader(socket.getInputStream( )));
		System.out.println("INFO: Connecting to server: ESTABLISHED!");
		BufferedWriter writer = new BufferedWriter(
				new OutputStreamWriter(socket.getOutputStream( )));
		System.out.println("INFO: Logging into IRC as: " + nick + "!" + ident + "@" + outip + ": " + rname );
		
		// Log on to the server.
		writer.write("NICK " + nick + "\r\n");
		writer.write("USER " + ident + " 8 * :" + rname + " - Part of Xenium Interactive \r\n");
		writer.flush( );
		
		// Read lines from the server until it tells us we have connected.
		String line = null;
		int altnickc = 0;
		while ((line = reader.readLine( )) != null) {
			if (line.toLowerCase( ).startsWith("ping ")) {
				// We must respond to PINGs to avoid being disconnected.
				writer.write("PONG " + line.substring(5) + "\r\n");
				writer.flush( );
			}
			else if (line.indexOf("004") >= 0) {
				// We are now logged in.
				System.out.println("INFO: Now logged into IRC: Joining " + channel);
				break;
			}
			else if ((line.indexOf("433") >= 0) && (altnickc == 0)) {
				System.out.println("Nickname is already in use. Trying alternate nick");
				altnickc = 1;
				writer.write("NICK " + altnick + " \r\n");
				writer.flush();
			}
			else if ((line.indexOf("433") >= 0) && (altnickc == 1)) {
				System.out.println("ERROR: Connection Not Possible!");
				return;
			}
			else {
				System.out.println(line);
			}
		}
		
		// Join the channel.
		writer.write("JOIN " + channel + "\r\n");
		writer.flush( );
		
		// Keep reading lines from the server.
		while ((line = reader.readLine( )) != null) {
			if (line.toLowerCase( ).startsWith("ping ")) {
				// We must respond to PINGs to avoid being disconnected.
				writer.write("PONG " + line.substring(5) + "\r\n");
				writer.flush( );
			}
			else if (line.toLowerCase().contains("moo")) {
				writer.write("PRIVMSG " + channel + " :moooo \r\n");
				writer.flush();
			}
			else if (line.toLowerCase( ).contains(" :!")) {
				if (line.substring(1).toLowerCase( ).contains("!snarf")) {
					writer.write("PRIVMSG " + channel + " :THUNDERCATS HO! \r\n");
					writer.flush();
				}
				else if (line.substring(1).toLowerCase( ).contains("!help")) {
					writer.write("PRIVMSG " + channel + " :There is no help for the wicked! \r\n");
					writer.flush();
				}
				else if (line.substring(1).toLowerCase( ).contains("!shit") && line.substring(1).startsWith(botmstr)) {
					System.out.println(line);
					writer.write("PRIVMSG " + channel + " :HELP ME! I'm meeeeeeeeelting...\r\n");
					writer.flush();
					return;
				}
				else {
					writer.write("PRIVMSG " + channel + " :Unrecognized Command! \r\n");
					writer.flush();
				}
			}
			else {
				// Print the raw line received by the bot.
				System.out.println(line);
			}
		}
	}
}
