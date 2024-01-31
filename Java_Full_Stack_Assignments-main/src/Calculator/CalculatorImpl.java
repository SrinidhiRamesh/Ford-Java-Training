package Calculator;

public class CalculatorImpl implements Calculator {


    @Override
    public void add(int number1, int number2) {
        System.out.println("Addition of given two number is : "+ (number1+number2));
    }

    @Override
    public void subtract(int number1, int number2) {
        System.out.println("Subtraction of given two number is : "+ (number1-number2));
    }

    @Override
    public void multiplication(int number1, int number2) {
        System.out.println("Multiplication of given two number is : "+ (number1*number2));
    }

    @Override
    public void division(int number1, int number2) {
        System.out.println("Division of given two number is : "+ (number1/number2));
    }
}
