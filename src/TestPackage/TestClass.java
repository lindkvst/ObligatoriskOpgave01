package TestPackage;

public class TestClass {
    public static void main(String[] args) {

        char loanType;

        String loanName;

        ScannerHelper Sc = new ScannerHelper();
        Sc.welcomeMessage();

        int numOfLoans;
        numOfLoans = Sc.numOfLoans();


        LoanItem[] loanCollection = new LoanItem[numOfLoans];

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

        // Loan registration
        for (int i = 0; i < loanCollection.length; i++) {
            System.out.println(loanCollection[i]);
        }

        /*
        for (int i = 0; i < loanCollection[i]) {
            loanCollection[i].printList();
        }
        System.out.println("LIST\tOF\tLOAN\tITEMS:");
        System.out.println("ID\tTYPE\tTITLE");
        System.out.println(loanCollection[i] + 1 "\t" );
*/

    }
}
