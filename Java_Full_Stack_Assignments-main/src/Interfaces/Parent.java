package Interfaces;

public interface Parent {
    void display();
    static void utility(){

    }
    default  void defaultMethod(){
        System.out.println("default method");
    }
}
