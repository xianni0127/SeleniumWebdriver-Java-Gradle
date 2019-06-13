
To Run a Test In IntelliJ IDEA
==============================

Add the following to the defaults for Cucumber Java tests:

* VM Arguments: -Dspring.profiles.active=env1 

Now you can run feature files from the right-button popup menu.


To Run with a Different Browser
===============================

Add the option -Dbrowser={browser} to the JVM options of the JUnit defaults (or to the run config of an individual test) -Dbrowser=chrome

Valid browsers are:

* `firefox` 
* `chrome` (default)

