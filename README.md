# ContractorCheckinSurvey
Base for Springboot+Angular

use https://start.spring.io to create main Springboot project with the below dependencies
Web
DevTools
Actuators

# Create Modules for Angular and a Service Module
right-click on the parent module, i.e MainSpringbootApp, and click 'New Module' 

It's recommended that you create a module with the project name suffixed
Example = AppName-UI or AppName-Service

# AppName-Service
This module is used for generating the final deployment jar, which, in turn, has core logic, REST controllers, models, repository classes, etc.

It would also have all the HTML, CSS, and JS files needed for the application.

# AppName-UI
This module will contain the Angular project along with the pom.xml
You have to remove the build configuration from the Parent pom.xml and place it the AppName-Service's pom.xml.
Also, it's important to add packaging in the AppName-Service's pom.xml.

<packaging>Jar</packaging>

You have to delete the src folder created in the AppName-UI module/folder.

Copy the pom.xml from the AppName-UI module and place it in your Desktop.

## Navigate to AppName from the terminal and run the following commands:
cd ~/AppName
rm -rf AppName-UI
Create an Angular 6 Project Using Angular-CLI
ng new AppName-UI

Replace the pom.xml file from the Desktop which we copied in the previous step.

As you already know, when use ng serve or ng build, Angular CLI generates all the HTML, CSS, and JS files in the dist folder.

## Now we need to move that dist folder to AppName-Service's resources directory.
The easiest way to do that is to open the angular.json file of our Angular application and modify the outDir property as shown below

# Run the Application

Run below command from the project root directory. This will generate a jar file in the AppName-Service/target directory. It can be deployed to the Tomcat Server and the application can be viewed.
### mvn clean install

To run the Spring Boot application using Maven, run the following command from the AppName-Servicedirectory:
### mvn spring-boot:run

navigate to http://localhost:8080 to see the welcome page.
