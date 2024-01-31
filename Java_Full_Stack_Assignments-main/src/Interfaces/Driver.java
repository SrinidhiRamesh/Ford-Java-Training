package Interfaces;

public class Driver {
    public static void main(String[] args) {
       Parent parent = new ParentImpl();
       parent.display();
       parent.defaultMethod();

    }
}
