package inheritance;

public class Client {




    public static void main(String[] args) {
        Child child= new Child();
     child.display();
     Parent parent ;
     parent = new Parent();
     parent.display();
     parent=child;
     parent.display();
    }
}
