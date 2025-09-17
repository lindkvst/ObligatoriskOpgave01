package TestPackage;

public class Book extends LoanItem {
    public Book(String type, String name) {
        super(type, name);
        this.type = type;
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Override og toString
    @Override
    public String toString() {
        return "Book{" + "type=" + type + ", name=" + name + '}';
    }
    public void
}
