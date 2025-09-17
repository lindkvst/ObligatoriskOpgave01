package TestPackage;

//konstruktør
public class LoanItem {
    protected String type;
    protected String name;

    //konstruktør
    public LoanItem(String type, String name) {
        this.type = type;
        this.name = name;
    }
    //konstruktør
    public LoanItem(String name){
        this.name = name;
    }
    //Vi overrider toString metoden
    @Override
    public String toString() {
        return "LoanItem{" + "type=" + type + ", name=" + name + '}';
    }
    //getter
    public String getType(){
        return type;
    }
    //getter
    public String getName(){
        return name;
    }
    //setter
    public void setType(String type){
        this.type = type;
    }
    //setter
    public void setName(String name){
        this.name = name;
    }
    //den printede liste med de registrerede lån
    public void printList(){
        System.out.print(type + "\t" + name);
    }
}
