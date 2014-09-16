Hello teammate,

Follow these steps to integrate Gradle and Git into netbeans:

1. Download the latest version of Netbeans: https://netbeans.org/downloads/. Get the "All" version, to be safe.

2. Download the Gradle plugin for Netbeans:
	a. Go to Tools > Plugins
	b. Look for "Gradle Support" under the "Available Plugins" tab and download it.
	c. If you want to make sure it downloaded successfully, look under "User Installed Plugins" in the "Installed" tab

3. Set up a SpaceTrader Gradle project:
	a. Go to File > New Project > Gradle > Gradle Root project, click next.
	b. Enter "SpaceTrader" in Project Name, and "SpaceTrader" for the Maven Group Id. You must enter EXACTLY those strings or else you'll probably get a build failure. Click finish.

4. Move your local repo over to the SpaceTrader project folder:
	a. All you need to do is move the hidden file .git from your local repo over to the project root directory. 
	b. Execute "git pull" from that folder.

5. Get down with yo bad self