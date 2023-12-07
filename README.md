#Amazon Shopping Selenium Test
Overview
This repository contains Java code for automated testing of the Amazon Shopping website using Selenium WebDriver with the Chrome browser. The main code can be found in src/Main.java. The test script performs the following actions:

Opens the Chrome browser.
Maximizes the browser window.
Navigates to amazon.com.
Searches for mobile phones.
Applies a filter for products with 4 or more customer reviews.
Sets a price range filter from $10,000 to $20,000.
Selects the first mobile phone from the search results.
Adds the selected mobile phone to the shopping cart.
Goes to the cart window.
Waits for 5 seconds.
Quits the Chrome browser.
Prerequisites
Ensure you have the following software installed on your machine:

Java Development Kit (JDK)
Maven
Chrome browser
Selenium WebDriver
ChromeDriver (Selenium WebDriver Chrome driver)
Setup
Clone the repository:

bash
Copy code
git clone https://github.com/harshkumar07/AmazonShopping_Testing.git
Navigate to the project directory:

bash
Copy code
cd AmazonShopping_Testing
Build the project using Maven:

bash
Copy code
mvn clean install
Running the Test
Execute the test script:

bash
Copy code
mvn test
Configuration
You can customize the test parameters and configurations in src/test/resources/config.properties.

Dependencies
The project uses the following dependencies:

Selenium WebDriver
TestNG
These dependencies are managed by Maven and will be automatically downloaded during the build process.

Selenium WebDriver and ChromeDriver
Download the latest version of Selenium WebDriver and ChromeDriver. Update the paths to the WebDriver executables in src/test/resources/config.properties.

Selenium WebDriver: Selenium WebDriver Downloads
ChromeDriver: ChromeDriver - WebDriver for Chrome
Notes
Make sure to update the ChromeDriver version in the pom.xml file to match your installed Chrome browser version.

The test script assumes a stable internet connection and the availability of the Amazon Shopping website. If the website structure changes, the script may need to be updated accordingly.

The waiting time for 5 seconds in the cart window is included to simulate user interaction. Adjust the waiting time as needed.

License
This project is licensed under the MIT License - see the LICENSE file for details.
