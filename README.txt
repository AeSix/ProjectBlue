ProjectBlue
===========

A multi-facited general use audio redistribution platform

Project ProjectBlue (Previously XENIUM) overview and missions statement:
Specifically, this document refers to the project hosted in the repository at Http://github.com/AeSix/ProjectBlue (refered to as AeSix/ProjectBlue and ProjectBlue in this document) as well as any forks and derivatives of AeSix/ProjectBlue and must be included in all forks and derivatives of AeSix/ProjectBlue. This document has a copyright notice at the bottom.

ProjectBlue (Previously XENIUM) ((For historical purposes) XENIUM of Excellent Node Information for Uni-cast Media) Has ambitious goals:
To become the single most powerfully useful yet easy turn-key based system for SJ/DJs and AM/FM stations' online presence.


The project will be broken down into stages with a milestone mark at the completion of each. These stages will be outlined here.  Each stage will have a name and colon-separated description, followed by a list of tasks and task details when needed.  The last line in each stage's task list will be the Final Product, which describes exactly when this stage is complete.  At this time, the stage should be (re-)reviewed for completeness and the project moved to the next stage. 

NOTE: This document refers to an API. This is currently an idea place holder and will be fleshed out with the project.

 -Project creation (the current stage): includes several pre-project tasks as well as the initial software creation.
  *This overview, with generalities and basic indoctrination for the project.
  *Documented project outline specifying each stage's requirements for completion
  *Document hosting and community building
  *code repositories set up properly with backup repositories with limited access
  *web page describing the project for general consumption for end users and developer recruitment
  *A donation system in place to pay for hosting costs with leftovers being divided amongst developers at milestone marks
   ~A bucket and token based system designed to fairly reward developers based on activity 
  *Initial code creation aiming towards a very basic server that can easily be extended with direct code modifications and plugins / modules
   ~This pre-alpha stage server will more than likely be completely recoded at a later date, and is intended only as a starting point
   ~This pre-alpha stage server will have all known-needed network and intra-OS connections available
   ~Connections will host no-data and static test data only (ping and response abilities)
   ~This pre-alpha stage server will not be security focused, though security will not be actively avoided
   ~This pre-alpha stage server will be the basis for an API layer that will evolve as the server and project grow.
 #Final Product: A community and repository holding the basic server able to open and accept and close connections reliably
   
 -Project reorganization: This stage is used for correcting anything in the project which did not need immediate attention
  *Complete code audit, to ensure licensing compliance (to avoid copyright and potential dmca issues)
  *website design and information updates
  *Pre-alpha server stress testing
  *financial planning (review of funds, donations, obligations)
  *Developer reviews (promotions, demotions, etc)
  *Project goal and outline changes
  *Updates and re-execution of "Project creation" tasks as needed (non coding)
 #Final Product: On-purpose staff and compliant code with an energy towards growing the project
  
 -Project stabilization: Continued code creation and testing
  *Adherence to reorganization policies previously set during this stage
  *pre-alpha server will be expanded to handle test data streams in a just-work basis
   ~technical and code errors will be corrected immediately, functionality focused only
  *implementation of project goal and outline changes
  *API layer update to coincide with new server code 
 #Final Product: a stable server that can be reliably extended through the API
 
 -Project expansion: Core coding expansions for specific data types
  *Implement basic HTTP server for hosting plaintext documents
   ~This should be able to host html5 and css3 documents which use clients for processing
   ~server needs to be sandboxed for time being, removal from sandbox later will be discussed
  *Implement basic audio streaming server compliant with html5-audio
   ~this will be expanded later to include other encoding options
   ~use of compatible file currently
  *Implement data push server for broadcast text data
   ~Station, show, band/song, etc
   ~data will be auto populated later, static for testing
  *Basic control panel server created
   ~will allow for basic controls of stream (start, stop)
  *API updates with needed functions from this stage
  *Alpha server and API stress testing
 #Final Product: Software able to host and control an audio stream on it's own website
  
 -Project steering: non-critical corrections and project goal updates
  *Code review, to ensure licensing compliance (to avoid copyright and potential dmca issues)
  *Project goal and outline changes, prep for next stage
  *code changes and testing as needed
  *Developer reviews (promotions, demotions, etc)
  *continued project dissemination and growth 
  *financial planning (review of funds, donations, obligations)
  *website updates as needed (includes project website as well as any community portals)
 #Final Product: An energized and focused project group and code base ready to expand
 
 -Project growth: fleshing out the primary parts of the server and components
  *Preliminary database creation and implementation for security policies, music, etc
  *Policy based security system creation
  *basic server will be expanded to allow for security and policy based accesses
  *HTTP server component will be expanded to allow for extensibility & security
   ~Able to be integrated into larger environments (Apache/IIS)
   ~Ability to extend with PHP software 
   ~Security / policy based access
  *Streaming server component expanded to decode/encode stream data
  *Streaming server expanded to accept file, stream or raw audio input source
  *streaming server expanded to parse file, stream or manual meta data
  *PUSH server integrated with or controlled by streaming server component
  *Creation of Administrative controls
   ~Admin panel able to control top level functions
   ~DJ panel able to control streams
   ~User panel for registered user / account mechanisms
   ~policy based security controls for Admins and DJs
   *API on hold for time being, will be updated after security has been proven
 #Final Product: A basic working and extendible streaming system with server access security
 
 -Project review: More review for code and goals
  *Review code for licensing compliance
  *System stress testing
  *Planning to continue project and next stage goal requirements and expectations
  *Developer reviews (promotions, demotions, etc)
  *continued project dissemination and growth 
  *financial planning (review of funds, donations, obligations)
  *website updates as needed (includes project website as well as any community portals)
 #Final Product: An on-purpose, target oriented staff with a growing project
 
 -Project streamlining: Feature freeze, code updates to make project easier to maintain and expand
  *Implement any code changes needed from project review to make project compliant
  *better integration of components with each other as needed
  *Policy Based Security system upgrades as needed
  *Database changes as needed
  *Administrative panel updates as needed
  *API updates with Policy Based Security (API keys for Admins and DJs, no keys needed for public API access)
  *extensive testing by developers and select others, As many features tested and broken as possible
  *config file reorganization (combinging and seperating out various options)
  *Bug fixes from testing as needed
 #Final Product: BETA! A stable and secure system with all basic and major and some minor functions working properly
 
 -Project disection:
  *Complete code audit to ensure licensing compliance
  *Developer reviews
  *Financial Planning
  *website updates
  *Prepare for Beta release
  *Dissemination of project to major outlets
  *CrowdFunding (if not started by now)
 #Final Product: Beta-testing release software and resources to bring project to maturity
 
 -Project testing: Go forth and break this thing! Also, next version creation.
  *System will be put in non-production testing environments
  *Community feedback, feature requests and bug reports taken in and prioritized
  *Additional features being created (per-project and per-request)
   ~IRC Control and Information bot server component
   ~web chat system (based on IRC?)
  *Encourage plugins and bridge connectors to be written for the system and other software
   ~Minecraft Forge integration (Stream to server, server streams to clients)???
   ~Professional audio equipment integration???
  *Continual code reviews
 #Final Product: Beta-2 software ready to be polished
 
 -Project advancement: Add minor functions, extended on proven base system
  *Better API support as needed
  *Create nice webpage themes
  *Live Update system (notifications, auto-updating)
  *Make control panels more human usable
  *Create DJ Library component
   ~database interface webpage
   ~method for populating databases manually (web page)
   ~database format and protocol
  *Create request system
   ~show request on DJ panel
   ~DJ controlled on/off
  *Create DJ Client
   ~DJ panel integration
   ~request list
   ~local library parsing
   ~server database updating (careful to avoid dupes)
   ~chat component
  *Policy Based Security system updates as needed
  *Code changes to components as needed
  *API updates as needed
 #Final Product: Release candidate software for version 1.0 
 
 -Project preparation: Pre-release reviews and testing
  *Code audit new code for licensing compliance
  *bug fixes and code changes as needed
  *developer peer code review for 0-days, backdoors, etc
  *Policy Based Security system auditing
   ~ensure 'Rank'/'level' permissions are secure
   ~ensure ease of use for all users at all levels
  *Prettify project graphics and interfaces as needed
  *Ensure ease of installation and configuration
  *Financial planning
   ~Ensure developers have been paid to milestones they have contributed in
   ~Ensure project feasibility 
  *Review of project by developers
  *Review of developers by developers
  *Final code changes needed for successful release
 #Final Product: ProjectBlue (Previously XENIUM) 1.0 successful release
 
The Final Product of Project ProjectBlue (Previously XENIUM) will be a system which is continually updated and maintained to provide up to date features, a paid support system, paid hosting and a commercial product based on the open source product to support the staff and development.  Our goal is to get ProjectBlue (Previously XENIUM) into the hands of as many amateur and professional audio hosting companies, and to replace cumbersome and difficult to use audio systems in places where music is played and to open the door to market to gaming servers and other,
currently unsuspected sources of listeners, users and income.
 
 	This document is subject to changes and should be refereed to often by active and new developers before starting work.  Changes to this document are to be made exclusive by and with the agreement of the Project ProjectBlue (Previously XENIUM) Executive staff only.

 Please contact AeSix via github or sourceforge regarding participation in this project.  Further questions, comments and request for discussion can be obtained by contacting AeSix at aesix@aesix.com
 
Though this document contains many familiar ideas, this document nor the ideas contained within are to be used for any other purposes than for Project ProjectBlue (Previously XENIUM) or it's direct successor.  Use of this document or it's ideas, changed or unchanged, will be seen as a violation of "ALL RIGHTS RESERVED" and will be pursued legally where available. 
 


This document is copyright 2014 AeSix.com ALL RIGHTS RESERVED (Permission is hereby given to contributors to ProjectBlue to use this file in a manner conductive of assisting ProjectBlue in completing fruition and for no other purposes) This copyright is not intended to supersede the policies of Github, nor to act in any way to limit the rights of any contributor, but is intended only to protect the integrity of ProjectBlue.
 
 

