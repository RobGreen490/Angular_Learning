Folder src/main/java{
    created package "rest"
}

Folder src/main/java/rest{
    created class "FunRestController.java"
}

File FunRestController.java{
    line 8: Added @RestController which marks a class as a controller where every method returns a domain object or a string as a response, instead of a view.

    line 12-15: added a "/" mapping for the landing page and returning "Hello world!" to the users screen.
    line 17-20: added a "/workout" mapping for a new page to display to the user.
}

File pom.xml{
    Line 38-41: added "spring-boot-devtools" so the website will automatically refresh every time coded is added or changed in the project.
}