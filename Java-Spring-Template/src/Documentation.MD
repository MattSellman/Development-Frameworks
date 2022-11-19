Setup: 

Can either use Spring Initializer via https://start.spring.io/. Or you can create your own spring classes, depending, but generally speaking it'll look very much the same 

https://medium.com/danielpadua/java-spring-boot-intellij-idea-17badd22f0b7

If using the above you can create the spring initializer with the following fields: 
    Maven project
    Java
    2.7.3
    br.com.example
    java-spring-example
    web dependency 

Once done you press the generate button to download a zip file of what you have created 
Unzip the file in location of your choice 
Go onto intellij and import the project from existing sources, and go to the unzipped file

If doing manually you'll need to set the test doc, application doc and pom.xml as per the examples given in this project template 

Once the above is done you can create the controller, for this example it will just be a simple hello world get controller. 

You can run by running the application class inside java_spring_idea_example

From there you can go onto http://localhost:8080/api/example/hello-world to see your hello world endpoint.

Notes: 
    If your controllers are in a different package structure, then @ComponentScan needs to be added to the Spring Boot application class, see the code example and the below line:
        @ComponentScan(basePackages={"br.com.example.controllers"})

    The default page is the white error page, bear this in mind and maybe replace with your own error page instead 
    
    To change the port number, you'll need to set it inside application.properties