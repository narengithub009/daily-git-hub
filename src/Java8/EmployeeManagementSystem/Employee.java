package Java8.EmployeeManagementSystem;

public class Employee {
    private int id;
    private String name;
    private int age;
    private String gender;
    private String deppartment;
    private int yearOfJoining;
    private double salary;

    public Employee(int id, String name, int age, String gender, String deppartment, int yearOfJoining, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.deppartment = deppartment;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getDeppartment() {
        return deppartment;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", deppartment="
                + deppartment + ", yearOfJoining=" + yearOfJoining + ", salary=" + salary + "]";
    }

}
