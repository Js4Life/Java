public class EmployeeInstance {

    public String name;
    private double salary;

    public EmployeeInstance(String empName) {
        name = empName;
    }

    public void setSalary(double empSal) {
        salary = empSal;
    }

    public void PrintEmp() {
        System.out.println("Name :" + name);
        System.out.println("salary :" + salary);
    }

    public static void main(String args[]) {
        EmployeeInstance empOne = new EmployeeInstance("Ashwin Basavanna");
        empOne.setSalary(1000);
        empOne.PrintEmp();
    }

}

