package TestPackage;

public class Book extends LoanItem {
    public Book(String type, String name) {
        super(type, name);
        this.type = type;
        this.name = name;
    }

    //Konstruktør
    public Book(String name){
        super(name);
        this.type = "Book";
    }

    //Getter
    public String getType() {
        return type;
    }

    //Setter
    public void setType(String type) {
        this.type = type;
    }

    //Getter
    public String getName() {
        return name;
    }

    //Setter
    public void setName(String name) {
        this.name = name;
    }

    // Override og toString
    @Override
    public String toString() {
        return "Book{" + "type=" + type + ", name=" + name + '}';
    }
}
