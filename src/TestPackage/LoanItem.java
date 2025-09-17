package TestPackage;

public class LoanItem {
    protected String type;
    protected String name;

    public LoanItem(String type, String name) {
        this.type = type;
        this.name = name;
    }
    public LoanItem(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "LoanItem{" + "type=" + type + ", name=" + name + '}';
    }

    public String getType(){
        return type;
    }

    public String getName(){
        return name;
    }
    public void setType(String type){
        this.type = type;
    }
    public void setName(String name){
        this.name = name;
    }
    public void printList(){
        System.out.print(type + "\t" + name);
    }
}
