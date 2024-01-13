 class MethodOverridingEx {

    public static void main(String[] args) {
        Animal animal=new Cat();
        animal.eat();
    }
    
} 
class Cat extends Animal{

    void eat(){
        System.out.println("eat method of derived class");
    }
}

class Animal{
    void eat(){
        System.out.println("Eat method of base class");
    }

}