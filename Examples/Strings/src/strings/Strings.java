package strings;

public class Strings {
    public static void main(String[] args) throws Exception {
        //Declare a String
        String str;
        String name;
        String helloWorld;

        //Initialize a String
        str = ""; //This is the empty String
        name = "Josh";
        helloWorld = "Hello World!"; //Notice that all Strings are surrounded by double quotes ""
        
        //Print Strings
        System.out.println(str);
        System.out.println(name);
        System.out.println(helloWorld);

        //Reassign Strings
        str = "abcdEFG123!@#";
        name = "Kyle";
        helloWorld = "Goodbye World?";

        //Print Strings
        System.out.println(str);
        System.out.println(name);
        System.out.println(helloWorld);
        //Notice the output changed

        //Set Strings to Each Other
        str = name;
        helloWorld = str;

        //Print Strings
        System.out.println(str);
        System.out.println(name);
        System.out.println(helloWorld);
    }
}