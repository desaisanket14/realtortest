# Realtortest
Test aim to search realtor.com for a location with houses showing greater than zero and select second house and compare the house prices if they are a match or not

### Pre-Conditions:
1. Test is written for Chrome Browser in Java using Seleniun WebDriver, Maven, TestNG in Windows Enviornment
2. Download all the files in a Single Local Folder with same Structure

### Files
1. BasePage.java
2. BaseTest.java
3. SeleniumDriver.java
4. HomeSearchPage.java
## Test
HomeSearchTest.java

### Steps to follow before running the program (Enviornment Setup)
1. Delete previous history in Chrome Browser for better functionality
2. Java 8 or above is installed in the system Check using 'java -version' command in command prompt in Windows
3. Java System Varibale
4. Seleniun WebDriver is installed in the system with chromedriver (Other browsers can be used based on webdriver and updating file path in code)
5. Maven is installed in the system check using 'mvn -version' command in command prompt in Windows
6. Define Maven System variable that helps it to run anywhere from the system
7. TestNG plugin is installed 

### Running the program through IDE // I have used Eclipse but other IDE's should work fine
1. Download the repository to a local folder in your local system
2. Import the project from the folder following steps (Eclipse)
Import>Existing Maven Projects>Select the folder where files are stored>POM File>Next>Finish
3. Update the driverpath for SeleniumDriver.java file:- location (Local Folder):src->DriverCalss->SeleniumDriver.java based on your local path for Chrome Driver
```
Example:-
String driverPath = "C:\\Users\\Sanket\\Desktop\\chromedriver.exe";
```
4. Right Click TestNG File-> Run testng.xml->TestNG Suite
Located in Local Folder>test-output>testng.xml

### Running the program through cmd prompt
1. Enviornment are setup and working intune
2. Update the driverpath for SeleniumDriver.java file:- location (Local Folder):src->DriverCalss->SeleniumDriver.java based on your local path for Chrome Driver
3. Check Maven is installed in the system check using 'mvn -version' command in command prompt in Windows
```
mvn -version
```
4. Go to the directory using 'cd' on command prompt on Windows to the folder where all file are stored
```
cd Folder
```
5. Run the File in command PROMPT USING THE COMMAND
 ```
 mvn clean install
 ```
or
```
mvn test
```

### Output (If file runs Successfully)
Test Case Shows 3 test results since Scenario 3 & Scenario 4 are Combined into one test
```
[RemoteTestNG] detected TestNG version 6.14.2
Starting ChromeDriver 2.42.591088 (7b2b2dca23cca0862f674758c9a3933e685c27d5) on port 2503
Only local connections are allowed.
Oct 22, 2018 9:08:42 PM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: OSS
https://www.realtor.com/
Search Results is Greater than 0
The first string is $169,900 (Price can differ based on second search result from that instance)
The second string is $169,900 (Price can differ based on second search result from that instance)
The prices match

===============================================
Suite
Total tests run: 3, Failures: 0, Skips: 0
===============================================
```
