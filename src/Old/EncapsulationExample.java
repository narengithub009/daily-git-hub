package Old;

public class EncapsulationExample {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {

        EncapsulationExample person = new EncapsulationExample();
        person.setAge(12);
        person.setName("Narender");

        System.out.println(person.name + " " + person.getAge());
    }
}
