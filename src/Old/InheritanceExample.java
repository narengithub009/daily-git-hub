package Old;

public class InheritanceExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark();
        dog.eat();

        System.out.println(dog.hashCode());
        System.out.println(dog.getClass());
    }
}

class Animal {
    void eat() {
        System.out.println("Animal eats the food");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("The dog braks");
    }
}