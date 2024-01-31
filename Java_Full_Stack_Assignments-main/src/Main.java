//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
Employee emp = new Employee();
Calculator calculator = new Calculator();
calculator.display();
        System.out.println(emp);
       System.out.println("Hello Ford !!");
    }
}

class Employee{
 private Integer id;
 private String company;
    private String name;
    private Double salary;

    public Employee() {
        this.company="Ford";
    }

    public Employee(Integer id, String name, Double salary,String company) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.company=company;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", company='" + company + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}