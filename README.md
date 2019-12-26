# SkyScanner Test Automation

## Problem Statement
As a Sky Scanner Existing User, I should be able to select one way fastest flight with 0 stops between Singapore & Cape Town

## Libraries/Tools Used:
- Java
- Android SDK Manager
- Android Studio
- Node JS (NPM)
- Appium
- Cucumber
- TestNG
- UIAutomatorViewer
- Adb drivers

## Prerequisites Installations:
- Java 1.8 - Install Java and set the JAVA_HOME path on your machine.
- Android - Install Android Studio and set the ANDROID_HOME path.
  - Download the Android SDK tools such as
    - Build tools
    - Platform tools
    - Android Emulator
    - Create an emulator device from AVD manager
- Node & NPM - Download & install node 
- Maven - Install Maven for downloading dependencies.
- Appium - Install Appium and run Appium doctor to check the fitness to run and use the Appium
  - Download the Appium and Appium Doctor using command line 
    - npm install -g appium
    - npm install appium-doctor -g
    - appium-doctor

- Cucumber and TestNG - Add the dependencies in pom.xml
- Download apk for skyscanner
###### Guidelines: (1) Downloading the Android SDK Manager is sufficient if you want to use only Eclipse IDE. The support for Android SDK Manager Plugin in Eclipse are no longer supported by the community, so we can use Android Emulator from Android Studio. (2) Version 5.3 apk of SkyScanner was found online, so please make sure higher/latest version of SkyScanner application is not installed on the running device. It can cause conflict of version (3) Ensure that Appium Server and Physical Android device or Android emulator for virtual device are running state in order to run the automation script.
 
## Reference For Installations:
- JAVA_HOME: https://docs.oracle.com/cd/E19182-01/820-7851/inst_cli_jdk_javahome_t/
- ANDROID_HOME: https://developer.android.com/studio/command-line/variables
- Maven Install: https://maven.apache.org/install.html
- NodeJS and NPM Install: https://nodejs.org/en/download/
- Appium Install: http://appium.io/docs/en/about-appium/getting-started/
- Cucumber:
  - https://cucumber.io/docs/installation/java/
  - https://marketplace.eclipse.org/content/cucumber-eclipse-plugin
- Cucumber (parallel execution):
  - https://cucumber.io/docs/guides/parallel-execution/ 
- TestNG:
  - https://testng.org/doc/maven.html
  - https://marketplace.eclipse.org/content/testng-eclipse
 
## How This Project Works:
- Objective : As a Sky Scanner Existing User, I should be able to select one way fastest flight with 0 stops between Singapore & Cape Town
- Below Points to be considered on creating scripts:
  - Selenium Test on Mobile App & NOT Web
  - Language - any one out of Java/Python/Javascript
  - BDD Tool-any one out of Cucumber/Gauge
  - Data to be Parameterized either as Scenario Outline or csv(From/To/Date/Number of Members)
  - Page Object Model Design Pattern to be used
  - Provision to perform Parallel Execution  and cross Browser Execution
  - Reusable functions to be developed for actions
 
- Work Flow: 
  - The Automation script is developed using Java in BDD and Cucumber, which allows an existing skyscanner user to launch/install the SkyScanner App in Android Mobile or Emulator
  - Step 1: Login to the app using username and password(created a dummy login for testing purpose credentials configured in scenario outline) 
  - Step 2: Search a direct flight Starting From = Singapore and Travelling to =  Capetown/Hyderabad for date ”” and number of travel passengers by sorting the flight list by shortest duration 
  - Step 3: Selects the first flight in the list.
  - Please note that <Starting from, Travelling to, Travel date, Number of passengers, Sort the data by duration and direct flight> details are parameterised by scenario outline(please refer .feature)
 
## How To Run Test:
- Step 1: Considering the availability of all the above mentioned setup/prerequisites
- Step 2: Connect a mobile device via cable or via simulator
- Step 3: Check the device name and android version
	- Device name - can be checked in cmd(Command Prompt)/terminal by typing “adb devices”
	- Android Version - Can be checked in Mobile Settings -> About Phone -> Version. In case of simulator version is selected at the start of device setup
- Step 4: Check Appium Version
	Command prompt/terminal type “appium --version” or “appium -v”
- Step 5: Configuration of Android version, device name and appium version  in file src/main/java/com.skyscanner.util.HookBase.java
- Step 6: Run the project (Use TestNG or Junit to run the application)
 
# How To View TestNG Report:
- After executing the test cases using TestNG, in the output file, reports will be generated.
- Navigate to output folder and use the following methods to view the result
  - emailable-report.html
  - Reporter Class
  - index.html

 
 
 

