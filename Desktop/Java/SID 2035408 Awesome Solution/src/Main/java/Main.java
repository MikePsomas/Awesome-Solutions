package Main.java;//This is the main program that we call the methods
//Course: Software Principles
//       Module Code: MOD003484 TRI2 F01CAM
//        Element 010
//        2021/2022
//        Student ID: 2035408
 //       Team Name: Awesome Solution


import org.jetbrains.annotations.NotNull;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        Login log = new Login();
        log.log();
    }






    // when we call the method this string gives the parameters
    // I've used shuffled so we can change the order of the answer every time
    public static class Question {
        String question;
        ArrayList<String> choices;
        String answer;

        public Question(String question, String @NotNull [] choices, String answer) {
            this.question = question;
            this.choices = new ArrayList<String>();
            for (int i = 0; i < choices.length; i++) {
                this.choices.add(choices[i]);
            }


            Collections.shuffle(this.choices);
        }


        public String getQuestion() {
            return question;
        }


        public ArrayList<String> getChoices() {
            return choices;
        }

        public String getAnswer() {
            return answer;

        }
    }
}


















