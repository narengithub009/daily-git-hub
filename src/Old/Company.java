public class Company {
    public static void main(String[] args) {

        Manager manager = new Manager("Narender", 123, 200000, "IT");
        manager.dispalyDetails();
        manager.conductMeeting();
        System.out.println("Anaual Salary $ :" + manager.calAnualSalary());

        Developer developer = new Developer("Aswitha", 12345, 122020, "Java");

        developer.dispalyDetails();
        developer.writeCode();
        System.out.println("Developer anual salary $ : " + developer.calAnualSalary());
    }
}
