package Main.java;

import java.util.Scanner;

public class Login {


    void log() {
        // we welcome the user and we take input once again with scanner with two choices admin or user
        //if they chose admin we will send them to the admin section but they need a username and a password so they can
        //get in and see the choices that the admin have
        //the same goes for the user
        System.out.println("Welcome to Intergence");
        System.out.println("Hello Are you an 'admin' or a 'user' choose Accordingly");
        Scanner log = new Scanner(System.in);
        String choice = " ";

        //we take input from the user with scanner
        while (!choice.matches("admin") || !choice.matches("user")) {

            choice = log.nextLine();
            if (choice.matches("admin") || choice.matches("user")) {
                System.out.println("You chose : " + choice);
                break;
            }
        }

        //validation with if statement
        if (choice.matches("admin")) {

            admin admin = new admin();
            admin.adm();
        }


        if (choice.matches("user")) {
            user user = new user();
            user.user1();
        }
    }
}






















