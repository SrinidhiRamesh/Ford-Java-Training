package Calculator;

public class Driver {
    public static void main(String[] args) {
        Calculator calculator=new CalculatorImpl();
        calculator.add(5,6);
        calculator.subtract(5,6);
        calculator.multiplication(5,6);
        calculator.division(5,6);
    }
}
