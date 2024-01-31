package ExceptionHandling;

public class CustomExceptionDriver {
    public static void main(String[] args) {
      try{
          FunctionA(-9);
      }
      catch (CustomException e){
          System.out.println(e.getMessage());

      }
    }
    static void FunctionA(int number ) throws CustomException {
        if(number<0){
            throw new CustomException("Number is Negative");
        }

    }
}
