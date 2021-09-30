// Control Flow: the order at which the program executes
// CAN ONLY HAVE ONE MAIN PUBLIC CLASS. COMMENT OUT OTHER FUNCTIONS TO TEST

import java.util.Scanner; // for user input


// Using scanner and if-else statement:
public class Main {
    public static void main(String[] args) {
        System.out.println("Pick a number between 1 and 10");
        Scanner choice = new Scanner(System.in);

        int inputtedNum = choice.nextInt();
        if(inputtedNum < 5) {
            System.out.println("Enjoy the good luck a friend brings you");
        } else {
            System.out.println("Your shoe selection will make you very happy today");
        }
    }
}

// Using while loops with user input:
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean isOnRepeat = true;
        while(isOnRepeat) {
            System.out.println("Plyaing current song");
            System.out.println("Would you like to take this song off of repeat? If so, answer yes");

            String userInput = input.next();
            if(userInput.equals("yes")) { // .equals compares two strings and returns true or false
                isOnRepeat = false;
            }
        }
        System.out.println("Playing next song");
    }
}

// Code Challenge:
// Implement a Multiple-Choice Question --> one question, three answers
// Ask the user a question
// Output the answer choices to user
// Collect user's input
// Print out an appropriate message to the user based on if its correct or not

public class Main {
    public static void main(String[] args) {
        // Question:
        String Question = "How much money do I have?";

        // Answer Choices:
        String ChoiceA = "$1";
        String ChoiceB = "$10";
        String ChoiceC = "$100";

        // Correct Answer: 
        String CorrectChoice = ChoiceA;

        // Asking for questions and input:
        System.out.println(Question);
        Scanner input = new Scanner(System.in);

        // Loop to repeat question if incorrect plus check for correct answer: 
        boolean wrongChoice = true;
        while(wrongChoice) {
            System.out.println("Please select A for ChoiceA, B for ChoiceB, C for choiceC");
            String userInput = input.next();
            if(userInput.equals("A")) {
                System.out.println("Congradulations on selecting the correct answer!");
                wrongChoice = false;
            } else {
                System.out.println("Wrong answer, please try again");
            }
        }
    }
}