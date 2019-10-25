package primitives;

public class Primitives {
    public static void main(String[] args) 
    {
        //Declaration
        //Type Tag;
        int numberInt;
        float numberFloat;
        double numberDouble;
        char character;
        boolean bool;

        //Initialization
        //Tag = value;
        numberInt = 20;
        numberFloat = 1.25f; //The f differentiates floats from doubles
        numberDouble = 36.24;
        character = 'A'; //Notice the single quotes '' around A
        bool = true; //Notice that true is in blue, this means its a reserved word

        //Print the Variables
        System.out.println(numberInt);
        System.out.println(numberFloat);
        System.out.println(numberDouble);
        System.out.println(character);
        System.out.println(bool);

        //Reassign the Variables
        numberInt = 254;
        numberFloat = 740.0f;
        numberDouble = 6.0;
        character = '$';
        bool = false;

        //Print the Variables
        System.out.println(numberInt);
        System.out.println(numberFloat);
        System.out.println(numberDouble);
        System.out.println(character);
        System.out.println(bool);
        //Notice that the values printed are different now

        //More Variables
        int moreInts = 2;
        double moreDoubles = 44.81;

        //Reassign Variable to another Variable
        numberInt = moreInts;
        numberDouble = moreDoubles;

        //You can also sometimes assign different types to one another
        numberDouble = numberInt;

        System.out.println(numberDouble); //Notice that it added a decimal
    }
}