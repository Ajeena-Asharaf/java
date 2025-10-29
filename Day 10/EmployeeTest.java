package Day10;

class Employee {

    private String name;
    private int idNumber;
    private String department;
    private double salary;


    public void setName(String name) {
        this.name = name;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }
}
public class EmployeeTest {
    public static void main(String[] args) {
        
        Employee e1 = new Employee();
        Employee e2 = new Employee();

        
        e1.setName("Aji");
        e1.setIdNumber(1);
        e1.setDepartment("Java");
        e1.setSalary(30000);

        e2.setName("Haritha");
        e2.setIdNumber(2);
        e2.setDepartment("Python");
        e2.setSalary(40000);

        /
        System.out.println("Employee 1 Details:");
        System.out.println("Name: " + e1.getName());
        System.out.println("ID: " + e1.getIdNumber());
        System.out.println("Department: " + e1.getDepartment());
        System.out.println("Salary: " + e1.getSalary());

        System.out.println("\nEmployee 2 Details:");
        System.out.println("Name: " + e2.getName());
        System.out.println("ID: " + e2.getIdNumber());
        System.out.println("Department: " + e2.getDepartment());
        System.out.println("Salary: " + e2.getSalary());
    }
}
