package Main.java;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Interview {
    public ArrayList<Main.Question> questionSet;
    //here we've display the user some questions and we take the input again with Scanner
    //we're using arraylist and strings so we can manipulate the parameters from main.question
    //so we can take input and display to the user.


    public Interview() {
        questionSet = new ArrayList<>();
        String q = "Who Invented the computer";
        String[] a = {"charles babbage", "elon mask", "mark zucherberg", "christiano ronaldo"};
        questionSet.add(new Main.Question(q, a, "charles babbage"));
        q = "who invented the telephone?";
        a = new String[]{"Thomas Edison", "Michael Faraday", "James Watt", "Alex Bell"};
        questionSet.add(new Main.Question(q, a, "Alexander Bell"));
        q = "what was the first code ever written";
        a = new String[]{"plankalkul", "c#", "c++", "java"};
        questionSet.add(new Main.Question(q, a, "plankalkul"));
        Collections.shuffle(questionSet, new Random());
    }

    public void start() {
        Scanner scan = new Scanner(System.in);
        int NumCorrect = 0;

        int numCorrect = 0;
        for (int question = 0; question < questionSet.size(); question++) {
            System.out.println(questionSet.get(question).getQuestion());
            int numChoices = questionSet.get(question).getChoices().size();

            for (int choice = 0; choice < numChoices; choice++) {
                System.out.println((choice + 1) + " :" +
                        questionSet.get(question).getChoices().get(choice));
            }

            int playerAnswer = scan.nextInt();
            ArrayList<String> ChoiceSet =
                    questionSet.get(question).getChoices();
            String correctAnswer = questionSet.get(question).getAnswer();
            int CorrectAnswerIndex = ChoiceSet.indexOf(correctAnswer);
            int correctAnswerIndex = 0;
            if (playerAnswer == correctAnswerIndex + 1) {
                numCorrect++;
            }

        }//this is the end of the test and we inform the user that is done and we thank him
        System.out.println("Thank you for your time !! After 24-48 hours an email will be sent to you with"+
                " the outcome of the interview :) ");
    }


}









