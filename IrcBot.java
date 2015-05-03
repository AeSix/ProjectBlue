/*
 * Copyright (c) 2014 AeSix.com. 
 * Based on archive.oreilly.com/pub/h/1966 with unknown license, sufficient changes made to base.
 * This code is free to use, modify in regards to my corrections and extensions. O'Reilly does not
 * have a license specified for the original code - am assuming it is public / open. 
 * Gratitude to https://gist.github.com/chrisgward for assistance in overcoming ping-timeouts.
 */ 


import java.io.*;
import java.net.*;

public class IrcBot {
    public static void main(String[] args) throws Exception {

        // The server to connect to and our details.
        String server = "irc.your.server.local";
        int port = 6667;
        String nick = "Xenia";
        String ident = "Xenia";
        String rname = "Xenium IRC Bot";
        String channel = "#Xenia";
        //TODO: implement ctcp handlers
        //String ctcpver = "Xenia IRC Bot v.002";
        //String ctcpfin = "By the wrath of the goats!";
        
        // Connect directly to the IRC server.
        @SuppressWarnings("resource")
        Socket socket = new Socket(server,port);
        System.out.println("INFO: Connecting to server: Created socket");
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(socket.getInputStream( )));
        System.out.println("INFO: Connecting to server: Created reader");
        BufferedWriter writer = new BufferedWriter(
                new OutputStreamWriter(socket.getOutputStream( )));
        System.out.println("INFO: Connecting to server: Created writer");
        
        // Log on to the server.
        writer.write("NICK " + nick + "\r\n");
        writer.write("USER " + ident + " 8 * :" + rname + " - Part of Xenium Interactive \r\n");
        writer.flush( );
        
        // Read lines from the server until it tells us we have connected.
        String line = null;
        while ((line = reader.readLine( )) != null) {
            if (line.toLowerCase( ).startsWith("ping ")) {
            	System.out.println("INFO: Connecting to server: Received PING!");
            	// We must respond to PINGs to avoid being disconnected.
            	writer.write("PONG " + line.substring(5) + "\r\n");
            	System.out.println("INFO: Connecting to server: Sent PONG!");
            	writer.flush( );
            	System.out.println("INFO: Connecting to server: Flushed Writer");
            }
            else if (line.indexOf("004") >= 0) {
                // We are now logged in.
                break;
            }
            else if (line.indexOf("433") >= 0) {
                System.out.println("Nickname is already in use.");
                return;
                //TODO: retry with new nick
            }
            else if (line.indexOf("") >= 0) {
            	System.out.println(line.indexOf(""));
            }
        }
        
        // Join the channel.
        writer.write("JOIN " + channel + "\r\n");
        writer.flush( );
        
        // Keep reading lines from the server.
        while ((line = reader.readLine( )) != null) {
            if (line.toLowerCase( ).startsWith("ping ")) {
            	System.out.println("received PING");
                // We must respond to PINGs to avoid being disconnected.
                writer.write("PONG " + line.substring(5) + "\r\n");
                System.out.println("sent PONG");
                writer.flush( );
                System.out.println("flushed writer");
            }
			else if (line.toLowerCase().contains("moo")) {
				System.out.println("received moo");
				writer.write("PRIVMSG " + channel + " :moooo \r\n");
				System.out.println("sent mooooo");
				writer.flush();
				System.out.println("flushed moo writer");
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
