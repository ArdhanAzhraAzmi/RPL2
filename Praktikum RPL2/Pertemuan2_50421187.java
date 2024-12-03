// Superclass Employee
class Employee {
    private String name;
    private int id;
    private double salary;

    // Constructor
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    // Polymorphic method
    public void displayInfo() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: $" + salary);
    }
}

// Subclass Manager
class Manager extends Employee {
    private int teamSize;

    public Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary); // Inheritance
        this.teamSize = teamSize;
    }

    public int getTeamSize() {
        return teamSize;
    }

    // Override displayInfo method
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call superclass method
        System.out.println("Position: Manager, Team Size: " + teamSize);
    }
}

// Subclass Developer
class Developer extends Employee {
    private String projectName;

    public Developer(String name, int id, double salary, String projectName) {
        super(name, id, salary);
        this.projectName = projectName;
    }

    public String getProjectName() {
        return projectName;
    }

    // Override displayInfo method
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Position: Developer, Project: " + projectName);
    }
}

// Main Class to demonstrate OOP concepts
public class Main {
    public static void main(String[] args) {
        // Create objects of each class
        Employee emp1 = new Employee("Alice
