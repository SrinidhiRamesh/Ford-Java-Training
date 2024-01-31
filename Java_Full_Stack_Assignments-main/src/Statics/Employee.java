package Statics;

public class Employee {
    private String name; //instance data member
  private static   String companyName; //belongs to class name i.e. Employee

    public static String getCompanyName() {
        return companyName;
    }

    public static void setCompanyName(String companyName) {
        Employee.companyName = companyName;
    }
}
