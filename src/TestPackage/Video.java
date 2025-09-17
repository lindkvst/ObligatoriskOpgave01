package TestPackage;

public class Video extends LoanItem{

    public Video(String type, String name) {
        super(type, name);
        this.type = type;
        this.name = name;

    }
    //getter
    public String getType() {
        return type;
    }
    //setter
    public void setType(String type) {
        this.type = type;
    }
    //getter
    public String getName() {
        return name;
    }
    //setter
    public void setName(String name) {
        this.name = name;
    }


    //Vi overrider toString metoden
    @Override
    public String toString() {
        return "Video{" + "type=" + type + ", name=" + name + '}';
    }
    public void
}
