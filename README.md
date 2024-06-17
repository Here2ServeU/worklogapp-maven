# Build an App Using Maven

This repository contains scripts to help you build a Work Log App using Maven.

## Prerequisites

- Install Maven on your local Machine: https://maven.apache.org/.
- Install Java on your local Machine: https://www.oracle.com/java/technologies/downloads/.
- Install Visual Studio Code if you want since that's what I use in this demo: https://code.visualstudio.com/download. 

## Steps

**1. Clone the repository**

   -> git clone https://github.com/Here2ServeU/worklogapp-maven.git
   
   -> cd worklogapp-maven

***2. Edit the pom.xml file as desired**


**3. Build, Test, and Package Your Application**

    -> mvn compile

    -> mvn test 

    -> mvn package


**4. Run the JAR File**

    -> java -jar target/worklog-1.0-SNAPSHOT.jar


## Troubleshooting
If you encounter any issues, please check the following:

- Ensure your AWS CLI is configured correctly and you have the necessary permissions.
- Verify that your Terraform configurations are correct and all required variables are set.
- Check the AWS Management Console for any errors related to the resources being created.


## Contributing
Feel free to customize this `README.md` file according to your specific requirements and project details.




