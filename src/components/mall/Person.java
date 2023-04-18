package components.mall;

public class Person{

    private int ID;
    private Contact info;

    public Person(int ID, Contact info) {
        this.ID = ID;
        this.info = info;
    }

    public Person() {

    }

    public int getID() {
        return ID;
    }

    public Contact getInfo() {
        return info;
    }

    public void setInfo(Contact info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Person{" +
                "ID=" + ID +
                ", info=" + info.toString() +
                '}';
    }
}

