package Main.java;


import java.util.Scanner;

public class user {
    void user1() {
        // this is a simple login for the user's credentials ps the username is dave and the password is alex
        //using Scanner and we ofc validate
        System.out.println("Welcome to intergence please enter your credentials ");

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Please enter username => ");
            String userName = scanner.nextLine();

            System.out.println("Enter password => ");
            String password = scanner.nextLine();

            if ("dave".matches(userName) && "alex".matches(password)) {
                System.out.println("Welcome :) ");

            } else {
                System.out.println("In valid userName or password  :{} ");

            }



            // we take input from the user with the Scanner with the choices job or exit from the program

            Scanner useroption1 = new Scanner(System.in);
            System.out.println("Choose where to go: For job opportunities press 'job'\n to exit just press 'exit'  ");
            System.out.println("Type your choice Please ");
            String useroption = " ";
            while (!useroption.matches("job") || !useroption.matches("exit")) {
                useroption = useroption1.nextLine();

                if (useroption.matches("job") || useroption.matches("exit")) {
                    System.out.println("Taking you to : " +useroption);

                }


                //here if the user chose job we print him 2 option he can choose between two different jobs to interview
                if (useroption.equals("job")) {

                    System.out.println("Welcome to Job opportunities");
                    System.out.println("1.IT Specialist job if wanna Interview for this position please press '1'");
                    System.out.println("2.Software developer job if you wanna Interview for this position please press '2'");
                    Scanner useroption2 = new Scanner(System.in);
                    String answer = useroption2.nextLine();

                    // here we take input with Scanner and we use a while if statement  with two choices
                    boolean correctInput = true;
                    while (correctInput) {
                        if (answer.matches("1") || answer.matches("2")) {
                            System.out.println("you have 15 minutes to answer all the questions :) good luck!");
                            correctInput = false;
                        } else {
                            System.out.println("you have 15 minutes to answer all the questions :) good luck!");
                            break;

                        }

                    }Interview Interview = new Interview();
                    Interview.start();
                }
            }
        }
    }
}



























