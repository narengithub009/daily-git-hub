package Old;

public class PolymorphismExample {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal cat = new Cat();
        Animal dog = new Dog();
        cat.sound();
    }
}

class Animal {
    void sound() {
        System.out.println("Animal makes sounds");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat sounds like meow");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("The dog barks");
    }
}