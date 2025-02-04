Step-02{
    File pom.xml{
        Lines 39-42: Added devtools to enable hot reload of website after changing code.
    }

    File FunRestController.java{
        lines 17-20: Added another end-point accessor for "/workout".
        lines 23-26: Added another end-point accessor for "/fortune".
    }
}


Step-01{
    Folder java\com\myFirstSpringApp\myCoolApp: Created java package "rest"
    Folder java\com\myFirstSpringApp\myCoolApp\rest: Created file "FunRestController.java"

    File FunRestController.java{
        Line 7: Added RestController
        Line 11: Added GetMapping for exposing "/" end-point.
        Line 12-13: Declared function to return String "Hello World!"
    }
}