// primitive data types --> boolean, int, double, char
    // boolean: TRUE or FALSE value
    // int: whole number
    // double: decimal number
    // char: character 

import java.util.Scanner; 
// Scanner to look for input


// Example of boolean, int, double, and char data types
public class Main {
    public static void main(String[] args) {
        boolean hasPerfectAttendance = true;
        int studentAge = 15;
        double GPA = 3.45;
        char studentFirstInitial = 'E';
        char studentLastInitial = 'J';

        // creating string variable: --> a reference data type
        String studentName = "Eric Jiang";
        // combine 2 strings:
        String firstName = "Eric";
        String lastName = "Jiang";

        // using charAt:
        char studentFirstInitialIndex = firstName.charAt(0);

        System.out.println(hasPerfectAttendance);
        System.out.println(studentAge);
        System.out.println(GPA);
        System.out.println(studentFirstInitial);
        System.out.println(studentLastInitial);
        System.out.println(studentName);

        // combining two strings together
        System.out.println(firstName + " " + lastName);

        // charAt:
        System.out.println(studentFirstInitialIndex);

        // using input:(Scanner data type) --> looking for an input
        Scanner input = new Scanner(System.in);
        GPA = input.nextDouble();
        // to see that the GPA has been updated:
        System.out.println(studentName + " has a GPA of: " + GPA);
    }
}

// charAt --> method that allows us to access a character at an index within a string