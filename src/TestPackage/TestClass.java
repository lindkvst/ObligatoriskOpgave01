package TestPackage;

public class TestClass {
    public static void main(String[] args) {
        createLoans();
    }

    static void createLoans() {
        // Lokale variabler.
        char loanType;

        String loanName;

        ScannerHelper Sc = new ScannerHelper();
        Sc.welcomeMessage();

        int numOfLoans;
        numOfLoans = Sc.numOfLoans();


        LoanItem[] loanCollection = new LoanItem[numOfLoans];

        // Opdatere array- loanCollection ved brug af forLoop.
        for (int i = 0; i < loanCollection.length; i++) {
            int regCount = i + 1;
            System.out.println("\nRegister loan: " + regCount);
            loanType = Sc.askType();
            loanName = Sc.askName();

            if (loanType == 'v' || loanType == 'V') {
                //video
                loanCollection[i] = new Video(loanName);
            } else if (loanType == 'b' || loanType == 'B') {
                //book
                loanCollection[i] = new Book(loanName);
            }
        }

        // Loan registration.
        System.out.println("\n");
        for (int i = 0; i < loanCollection.length; i++) {
            System.out.println(loanCollection[i]);
        }
        // Vi printer et output
        System.out.println("\n\nLIST OF LOAN ITEMS:");
        System.out.println("-------------------");
        System.out.println("ID\tTYPE\tTITLE");



        for (int i = 0; i < loanCollection.length; i++) {
            int bookIndex = i + 1;
            System.out.print(bookIndex + "\t" );
            loanCollection[i].printList();
            System.out.println("");

        }
    }
}
