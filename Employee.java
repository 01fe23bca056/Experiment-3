public class Employee extends Person {
    private String empId;
    private double salary;

    // Constructor
    public Employee(String name, String dobString, String empId, double salary) {
        // Call the superclass constructor (Person)
        super(name, dobString);
        this.empId = empId;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        // First, display the person's basic info
        displayPersonInfo();
        System.out.println("Employee ID: " + empId);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        // Example usage
        Employee employee = new Employee("Alice Smith", "15-04-1990", "E12345", 55000.00);
        employee.displayEmployeeDetails();
    }
}
