abstract class Animal {
    abstract void sound();  

    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Abstractclass {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.sound();  // Dog barks
        myDog.sleep();  // Animal is sleeping
    }
}
