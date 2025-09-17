package TestPackage;

public class TestClass {
    public static void main(String[] args){

        String loanType;

        String loanName;

        ScannerHelper Sc = new ScannerHelper();
        Sc.welcomeMessage();


        int loanCollection = Sc.numOfLoans();

        LoanItem[] loanCollection = new LoanItem[];

        for (int i = 0); i < loanCollection.length; i++){
            int regCount = i + 1;
            System.out.println("\nRegister loan: " + regCount);
            loanType = Sc.askType();
            loanName = Sc.askName();

            if (loanType.equalsIgnoreCase("video")) ;
            //video
            loanCollection[i] = new Video(loanName);

        }else if (loanType.equalsIgnoreCase("book")){
         //book
        }
    }
    // Loan registration
    for (int i = 0; i < loanCollection.lenght; i++){
        System.out.println(loanCollection[i]);
    }



}
