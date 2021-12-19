import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner ScannerObject = new Scanner(System.in);

        int ProblemSolution;

        int[] Numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int CorrectSolutions = 0;
        int InvalidSolutions = 0;

        int FirstNumber = Numbers[0];
        int SecondNumber = Numbers[0];

        String WelcomeText = "Welcome to multiply table learning!\nHere you can learn a multiply table, after passing, app shows your correct and invalid solution of problem.\nRemember, if you write not number, app close, so, be careful!\nGood luck!\n";
        System.out.println(WelcomeText);

        while(true) {
            String Placeholder = String.format("%d * %d = ",  FirstNumber, SecondNumber);
            System.out.print(Placeholder);

            try {
                ProblemSolution = ScannerObject.nextInt();
            }

            catch(InputMismatchException Error) {
                System.out.println("Please write number.");

                break;
            }

            if(ProblemSolution == FirstNumber * SecondNumber) {
                CorrectSolutions++;
            }

            else {
                InvalidSolutions++;
            }

            if(FirstNumber == Numbers[9] && SecondNumber == Numbers[9]) {
                System.out.println(String.format("\nCorrect solutions: %d,\nInvalid solutions: %d.", CorrectSolutions, InvalidSolutions));

                break;
            }

            else {
                if(SecondNumber == Numbers[9]) {
                    SecondNumber = Numbers[0];

                    FirstNumber++;
                }

                else {
                    SecondNumber++;
                }
            }
        }
    }
}
