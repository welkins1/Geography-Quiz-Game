package geographyquizgame;

//Programmer Name: Austin
//GitHub Username: welkins1


//Used for user input
import java.util.Scanner;

//Used for Array Lists
import java.util.ArrayList;

//Used for randomization of questions
import java.util.Collections;

public class GeographyQuizGame {

    public static void main(String[] args) {

        //This boolean is used for the PlayAgain while loop
        boolean PlayAgain = true;
        
        
        //Program descrption
        
        //This while loop is used later to let the user continue playing / restart the program
        while (PlayAgain) {
            System.out.println("Hello!\n");

            System.out.println("Welcome to the World Geography Quiz game.\n");
            System.out.println("This game tests your knowlege on various World Geography facts"
                    + " such as capitals, continents, flags, and populations.\n");

            //Creates aray list for EasyQA
            ArrayList<QuestionAnswerPair> EasyQA = new ArrayList<>();

            //Add questions to EasyQA
            EasyQA.add(new QuestionAnswerPair("What is the capital of the United States of America? ", "washington dc"));

            EasyQA.add(new QuestionAnswerPair("What is the capital of Germany? ", "berlin"));

            EasyQA.add(new QuestionAnswerPair("What country has the largest population? ", "china"));

            EasyQA.add(new QuestionAnswerPair("Which of the following colors is NOT on the flag of France?\n\nRed, Purple, White, or Blue? ", "purple"));

            EasyQA.add(new QuestionAnswerPair("What continent is Canada in? ", "north america"));

            //Create array list for MediumQA
            ArrayList<QuestionAnswerPair> MediumQA = new ArrayList<>();

            //Adds questions to MediumQA 
            MediumQA.add(new QuestionAnswerPair("What continent is Egypt in? ", "africa"));

            MediumQA.add(new QuestionAnswerPair("What country has the 3rd largest population? ", "united states of america"));

            MediumQA.add(new QuestionAnswerPair("What is the capital of Sweden? ", "stockholm"));

            MediumQA.add(new QuestionAnswerPair("Which of the following countries do not have red, white, or blue on their flag?\n \nRussia, Japan, Indonesia, or Jamaica ", "jamaica"));

            //Creates array list for HardQA
            ArrayList<QuestionAnswerPair> HardQA = new ArrayList<>();

            //Adds Questiosn to HardQA
            HardQA.add(new QuestionAnswerPair("What is the capital of Burkina Faso? ", "ouagadougou"));

            HardQA.add(new QuestionAnswerPair("What is the smallest country in the world? ", "vatican city"));

            HardQA.add(new QuestionAnswerPair("What continent is Palau located in? ", "oceania"));

            HardQA.add(new QuestionAnswerPair("What country has the most natural lakes? ", "canada"));

            //Array place holder for Difficulty + corresponding answers, a value of null is used to ensure the Array has no questions, but questions can be added
            ArrayList<QuestionAnswerPair> selectedQA = null;

            //Creates Scanner input
            Scanner input = new Scanner(System.in);
            System.out.print("Please select your difficutly (Easy, Medium or Hard): ");

            //Converts difficulty string to lowercase for less percise input
            String Difficulty = input.nextLine().toLowerCase();

            //Spacer 
            System.out.println("");

            //Loop for invalid input
            while (true) {

                //If else statement for choosing questions and assinging them to selectedQA array
                if (Difficulty.equals("easy")) {
                    selectedQA = EasyQA;
                    break;
                } else if (Difficulty.equals("medium")) {
                    selectedQA = MediumQA;
                    break;
                } else if (Difficulty.equals("hard")) {
                    selectedQA = HardQA;

                    break;
                } else {
                    //Invalid input else
                    System.out.print("Invalid difficutly, please select again: ");
                    Difficulty = input.nextLine().toLowerCase();
                    System.out.println("");

                }

            }

            //Displays selected difficutly. 
            System.out.println("You selected " + Difficulty + " difficulty.\n");

            System.out.print("Loading questions");
            //For loop to simulate loading questions
            for (int i = 0; i < 5; i++) {

                //the try-catch is required to use Thread.sleep
                try {
                    //Loading time in miliseconds
                    Thread.sleep(500);
                    //printed to the console based on i < 5
                    System.out.print(".");

                } catch (InterruptedException error) {

                }
            }

            //Spacer
            System.out.println("\n");

            //Variable for calculating score
            double score = 0;

            //Shuffles the questions 
            Collections.shuffle(selectedQA);

            //Displays the first question
            QuestionAnswerPair firstQA = selectedQA.get(0);
            System.out.print(firstQA.getQuestion());

            //Declaring user input/Answer
            String QuestionAnswer = input.nextLine().toLowerCase();

            if (QuestionAnswer.equals(firstQA.getAnswer().toLowerCase())) {
                System.out.println("\nCorrect!");
                //If correct, score increases by 1
                score++;
            } else {
                System.out.println("\nIncorrect! " + "The correct answer was " + firstQA.getAnswer() + ".");

            }

            //Spacer
            System.out.println("");

            //Displays the second question
            QuestionAnswerPair SecondQA = selectedQA.get(1);
            System.out.print(SecondQA.getQuestion());

            //Converts QuestionAnswer input to lowercase for less percise input
            QuestionAnswer = input.nextLine().toLowerCase();

            if (QuestionAnswer.equals(SecondQA.getAnswer().toLowerCase())) {
                System.out.println("\nCorrect!\n");
                //If correct, score increases by 1
                score++;
            } else {
                System.out.println("\nIncorrect! " + "The correct answer was " + SecondQA.getAnswer() + ".\n");

            }

            //Displays the third question
            QuestionAnswerPair ThirdQA = selectedQA.get(2);
            System.out.print(ThirdQA.getQuestion());

            QuestionAnswer = input.nextLine().toLowerCase();

            if (QuestionAnswer.equals(ThirdQA.getAnswer().toLowerCase())) {
                System.out.println("\nCorrect!");
                //If correct, score increases by 1
                score++;
            } else {
                System.out.println("\nIncorrect! " + "The correct answer was " + ThirdQA.getAnswer() + ".");
            }

            //Spacer
            System.out.println("");

            ////Displays the fourth question
            QuestionAnswerPair FourthQA = selectedQA.get(3);
            System.out.print(FourthQA.getQuestion());

            QuestionAnswer = input.nextLine().toLowerCase();

            if (QuestionAnswer.equals(FourthQA.getAnswer().toLowerCase())) {
                System.out.println("\nCorrect!");
                //If correct, score increases by 1
                score++;
            } else {
                System.out.println("\nIncorrect! " + "The correct answer was " + FourthQA.getAnswer() + ".");
            }

            //Spacer 
            System.out.println("");

            System.out.println("You've answered all the questions.\n");

            System.out.print("Calculating Score");
            
            //For loop to simulate loading questions
            for (int i = 0; i < 5; i++) {

                //The try-catch is required to use Thread.sleep
                try {
                    //Loading time in miliseconds
                    Thread.sleep(500);
                    //printed to the console based on i < 5
                    System.out.print(".");

                } catch (InterruptedException error) {

                }

            }

            
            //Displays the score based on the score++
            double percentage = (score / 4) * 100;
            System.out.println("\n\nYou got " + (int) score + " out of 4 answers correct!" + "(" + (int) percentage + "%)");

            
            //Asks the user if they want to play again 
            System.out.print("\nPlay Again? (Yes/No) ");
            
            //User input for continuing
            String PlayAgainInput = input.next().toLowerCase();
            
            //This while loops is use for invalid input 
            while (!PlayAgainInput.equals("yes") && !PlayAgainInput.equals("no")) {
                System.out.print("\nInvalid input, please type yes or no: ");
                PlayAgainInput = input.next().toLowerCase();
            }
            
            
            
            if (PlayAgainInput.equals("no")) {
                //Ending output!
                System.out.println("\nThanks for playing! " + "(:");
                
                //If PlayAgain is false, the while loop doesn't run, therefore the program terminates naturally
                PlayAgain = false;
            } else if (PlayAgainInput.equals("yes")) 
                
                //If PlayAgain is true, the while loop loops
                PlayAgain = true;
               
                

            } 
            
            
            //end of while loop
        }
    }

