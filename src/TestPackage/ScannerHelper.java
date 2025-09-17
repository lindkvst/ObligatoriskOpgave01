package TestPackage;

import java.util.Scanner;

public class ScannerHelper {
    private Scanner sc;

    public ScannerHelper() {
        this.sc = new Scanner(System.in);
    }

    //En hilsen til brugeren, der fortæller hvad der skal ske.
    public void welcomeMessage() {
        System.out.println("Welcome to the Loan Store. We're thrilled to have you here");
        System.out.println("Let's get ready to register some loans! \n");
    }

    public int  numOfLoans() {
        boolean numCorrect = false;
        int numOfLoans = 0;

        while (!numCorrect) {

            System.out.println("How many loans do you want to register today?");
            //nedenstående er input validering, der sikrer at vi registrerer en int inden for et
            //accepteret range, som ikke er et negativt tal.
            if (sc.hasNextInt()) { //scanner
                numOfLoans = sc.nextInt();
                sc.nextLine(); // rydder enter fra input bufferen, da dette kan give problemer
            }
        }
    }
}
