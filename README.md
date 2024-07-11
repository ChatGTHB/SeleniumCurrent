# SeleniumCurrent

## Introduction
SeleniumCurrent is a project designed to provide current training and tutorials on Selenium, a powerful tool for web automation. This repository includes code samples, exercises, and documentation to help users get started with Selenium and improve their automation skills.

## Table of Contents
- [Installation](#installation)
- [Usage](#usage)
- [Features](#features)
- [Dependencies](#dependencies)
- [Configuration](#configuration)
- [Examples](#examples)
- [Troubleshooting](#troubleshooting)
- [Contributors](#contributors)
- [License](#license)

## Installation
1. Open IntelliJ IDEA.
2. Select **File > New > Project from Version Control**.
3. Enter the repository URL: `https://github.com/ChatGTHB/SeleniumCurrent.git` and click **Clone**.
4. Ensure you have JDK installed on your system:
   - Go to **File > Project Structure > Project** and ensure the Project SDK is set to the correct JDK version.
5. Add the required dependencies using Maven:
   - Go to **File > Project Structure > Libraries**.
   - Click the **+** icon, select **From Maven**.
   - Add the following Maven artifacts:
     - `org.seleniumhq.selenium:selenium-java:latest`
     - `commons-io:commons-io:latest`
     - `org.slf4j:slf4j-nop:latest`

## Usage
1. Open the project in IntelliJ IDEA.
2. Locate the test cases in the appropriate directory provided.
3. Run the test cases.
4. Customize the test cases as needed to suit your testing requirements.

## Features
- Comprehensive Selenium training material.
- Sample test cases and examples.
- Basic HTML tutorials.
- 14-day structured learning plan.

## Dependencies
- Java
- Selenium WebDriver
- JUnit (comes with Java, no additional installation needed)
- Commons IO
- SLF4J NOP

## Configuration
Since there is no `pom.xml` file, ensure you manually add all the necessary dependencies using Maven as described above.

## Examples
Example test cases are located in the provided test directory. These examples demonstrate how to use Selenium WebDriver for various web automation tasks.

## Troubleshooting
If you encounter any issues, please open an issue on the GitHub repository.

## Contributors
- [ChatGTHB](https://github.com/ChatGTHB)

## License
This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for more details.

For more information, visit the [SeleniumCurrent GitHub repository](https://github.com/ChatGTHB/SeleniumCurrent).
