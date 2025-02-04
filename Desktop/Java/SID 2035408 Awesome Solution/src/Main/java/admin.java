package Main.java;



import java.util.Scanner;

public class admin {
    void adm() {
        // this is a simple login for the user's credentials ps the username is admin and the password is admin
        //one more time we are using Scanner to take input and validate
        System.out.println("Welcome Boss Please enter your credential so we can be sure it is you :)");


        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Please enter username => ");
            String userName = scanner.nextLine();

            System.out.println("Enter password => ");
            String password = scanner.nextLine();

            if ("admin".matches(userName) && "admin".matches(password)) {
                System.out.println("Welcome back Boss :) ");

            } else {
                System.out.println("In valid userName or password is this really you boss :{} ?");
                scanner.close();
            }


            Scanner adminOption = new Scanner(System.in);
            System.out.println("choose where to got : Interviews, calendar ");
            String adminOption1 = " ";

            // we take input from the user with the Scanner with the choices job or exit from the program
            while (!adminOption1.matches("Interviews") || !adminOption1.matches("calendar")) {
                adminOption1 = adminOption.nextLine();
                if (adminOption1.matches("Interviews") || adminOption1.matches("calendar")) {
                    System.out.println("Taking you to : " + adminOption1);
                    break;

                }
            }


            //this is the first case for the admin we display a previous candidate his info and his score

            if (adminOption1.matches("Interviews")) {
                System.out.println("Name: john");
                System.out.println("Surname: johny");
                System.out.println("Date of birth: 21/09/1999");
                System.out.println("Interview for IT Specialist");
                System.out.println("E-mail: IThacker@gmail.com");
                System.out.println("Phone number: +4423324343434");
                System.out.println("He Scored 88%");

            }
            //it is the same here input with Scanner and if he want to arrange a new time and day yes/no
            //with if statement
            if (adminOption1.matches("calendar"))
                System.out.println("type the day you wanna add the interview and the time (example monday 12 - 1");

            Scanner choice = new Scanner(System.in);
            String decision = choice.nextLine();
            System.out.println("your calendar was updated to : " + decision);


            //and here  we are giving him the choice if the wants to arrange an interview with and if else statement
            //and ofc the Scanner for input
            Scanner userInput = new Scanner(System.in);
            System.out.println("If you want to Arrange an Interview press 'yes' or  'no' ");
            String userChoice = userInput.nextLine();

            if (userChoice.equals("yes")) {
                System.out.println("An email was send to user that he is eligible for an Interview :)");

            } else if (userChoice.equals("no")){

                System.out.println("An email was send to the user that we appreciate his time spend with as  " +
                        "but we cannot offer him a job :( ");
            }






        }
    }
}







































































































































