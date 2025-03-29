interface Animal {
    void sound();
    void eat();
}

class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }

    @Override
    public void eat() {
        System.out.println("Dog eats");
    }
}

class Cat1 implements Animal {
    @Override
    public void sound(){
        System.out.println("Cat Eats");
    }

    @Override
    public void eat(){
        System.out.println("Cat Eats");
    }
}

public class InterFaceClass {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.sound();  
        myDog.eat(); 
        
        Cat1 mycat = new Cat1();
        mycat.sound();  
        mycat.eat();
    }
}
