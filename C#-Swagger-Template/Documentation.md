https://medium.com/danielpadua/creating-a-net-core-webapi-with-swagger-documentation-69e52936d1cc
https://github.com/danielpadua/dotnet-webapi-swagger-example/tree/master/src/WebApiSwagger

https://code-maze.com/swagger-ui-asp-net-core-web-api/


Create the directories first: 

dotnet-webapi-swagger-project
    - src
        - WebApiSwagger
            - Controllers 
            - obj
            - Properties
    - tests 
        - WebApiSwagger.tests
            - obj

Open a new terminal in the project and create the solution file:
    dotnet new sln --name WebApiSwagger

Then create the rest of the set up files: 
    dotnet new webapi -o src/WebApiSwagger

    dotnet new xunit -o tests/WebApiSwagger.Tests

Run the below two commands to setup the project files:
    dotnet sln add src/WebApiSwagger/WebApiSwagger.csproj

    dotnet sln add tests/WebApiSwagger.Tests/WebApiSwagger.Tests.csproj

And now you have a loaded project Template to work from.

Next we want to add the Swashbuckle middleware. Navigate to the following directory: 
    cd src/WebApiSwagger

Then run the following command to add Swashbuckle:
    dotnet add package Swashbuckle.AspNetCore

Now we just need to configure SwashBuckle in the ConfigureServices method via the startup.cs file. This adds the Swagger generator to the services collection.
    see below snippet 

Then we need to edit the same startup.cs file with the other configure method. This is for serving the generated JSON document and the Swagger UI:
    code snipper

Once those are done we can run the application via dotnet run.

Once running you can go to the below URL to see the swagger.json file that has been generated. 
https://localhost:<port>/swagger/v1/swagger.json

And once you've seen that, you can go to the full web page
https://localhost:<port>/swagger

Which will show you the full UI.

Once both are done then we hav successfully created a Swagger API.

To go further, we can start creating some more endpoints to interact with.
And beyond that, we can make a frontend to feed the API into.
A database could also assist matters here, but mocking the returned results instead is viable for the beginning. 
