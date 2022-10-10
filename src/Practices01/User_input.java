package Practices01;

import java.util.Scanner;

public class User_input {
    public static void main(String[] args) {
        //instead of setting up an int variable or
        // string we are setting up a sccaner variable and the system.in represent for
        //the user input
        Scanner user_input = new Scanner(System.in);
        String name;
        System.out.println("enter your name: ");
        name = user_input.next();

        String last_name;
        System.out.println("enter your Last_name: ");
        last_name = user_input.next();

       String full_name;
       full_name = name + "" + last_name;
        System.out.println("What is your name?");
        // Print name
        System.out.println("Hello " + name + "!");

    }
}
