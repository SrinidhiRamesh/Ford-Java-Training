package ExceptionHandling;

public class ExceptionHandling
{
    public static void main(String[] args) {
        Integer [] number= {1,2,3,4,5};

       try{ // write business logic here
//
//           System.out.println(number[15]);
           String name=null;
           name.toLowerCase();
       }
       catch (NullPointerException e){ //write exception handling logic
           System.out.println(e.getMessage());

       }
       finally {
           System.out.println("From finally");
       }

        System.out.println("Normal termination of app");
    }
}
