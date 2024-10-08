package Old;

public class Employee1 {
    private String name;
    private int id;
    private int salary;

    public Employee1(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void dispalyDetails() {
        System.out.println("EMployee Name " + name);
        System.out.println("EMployee Id " + id);
        System.out.println("EMployee Salary " + salary);
    }

    public double calAnualSalary() {
        return salary * 12;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

}

/**
 * InnerEmployee1
 */
class Manager extends Employee1 {

    private String department;

    public Manager(String name, int id, int salary, String department) {
        super(name, id, salary);
        this.department = department;
    }

    @Override
    public void dispalyDetails() {

        super.dispalyDetails();

    }

    public void conductMeeting() {
        System.out.println("conducting meeting for " + department);
    }

}

class Developer extends Employee1 {
    private String proLanguage;

    public Developer(String name, int id, int salary, String proLanguage) {
        super(name, id, salary);
        this.proLanguage = proLanguage;
    }

    @Override
    public void dispalyDetails() {

        super.dispalyDetails();
        System.out.println("Programming Language: " + proLanguage);
    }

    public void writeCode() {
        System.out.println("Writing code in " + proLanguage + ".");
    }
}