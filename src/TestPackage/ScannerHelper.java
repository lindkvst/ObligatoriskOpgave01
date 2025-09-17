package TestPackage;

//importerer Scanner library
import java.util.Scanner;


public class ScannerHelper {
    private Scanner sc;

    //Konstruktør til initialisering af scanneren
    public ScannerHelper() {
        this.sc = new Scanner(System.in);
    }

    //En hilsen til brugeren, der fortæller hvad der skal ske.
    public void welcomeMessage() {
        System.out.println("Welcome to the Loan Store. We're thrilled to have you here");
        System.out.println("Let's get ready to register some loans! \n");
    }

    //Metode til input validering af antal lån. Man kan kun indtaste en integer, som er et positivt tal
    //mellem 0 og 10
    public int  numOfLoans() {
        boolean numCorrect = false;
        int numOfLoans = 0;
        int maxLoans = 10;

        while (!numCorrect) {

            System.out.print("How many loans do you want to register today?");
            //nedenstående er input validering, der sikrer at vi registrerer en int inden for et
            //accepteret range, som ikke er et negativt tal.
            if (sc.hasNextInt()) { //scanner
                numOfLoans = sc.nextInt();
                sc.nextLine(); // rydder enter fra input bufferen, da dette kan give problemer

                if (numOfLoans < 0) {
                    System.out.println("You have entered a negative number. Try again");
                } else if (numOfLoans == 0) {
                    System.out.println("Are you sure you don't have any loans to register?");
                } else if (numOfLoans > maxLoans) {
                    System.out.println("That's to much to handle for us. We can max process " + maxLoans + " in one go.");
                } else {
                    if (numOfLoans == 1) {
                        System.out.println("Looks like we're having an easy day today. Let's register your loan");
                    } else {
                        System.out.println("Let's register your " + numOfLoans + " loans.\n");
                    }
                    numCorrect = true; // vi har et gyldigt input, så vi bryder ud af loopet.
                }
            }else { //hvis hasNextInt() fejler
                System.out.println("That's not a number. Try again!");
                sc.nextLine(); //rydder forkert input fra bufferen.
            }
        }
        return numOfLoans; // antal lån returneres
    }

    //metode til input validering af type, kan kun være b, B, v eller V.
    public char askType() {
        char loanType = '0';
        boolean correctAnswer = false;

        while (!correctAnswer) {
            System.out.print("Please input the loan type (B for Book, V for Video): ");
            loanType  = sc.next().charAt(0);
            sc.nextLine(); //rydder input bufferen

            if (loanType == 'b' || loanType == 'B' ||
                loanType == 'v' || loanType == 'V') {
                correctAnswer = true;
                return loanType;
            } else {
                System.out.println("Sorry, I didn't quite get that. Please enter a valid type.");
            }
        }
        return loanType;
    }

    //metode til at indtaste loan name
    public String askName() {
        System.out.print("Please input the loan title: ");
        String loanName = sc.nextLine();

        return loanName;
    }
}
