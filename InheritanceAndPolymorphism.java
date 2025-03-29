class Animal {
    
    // final void Eat() {    // if i used final in this then i am not able to override it 
    void Eat() {
        System.out.println("Animal is Eating");
    }

}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog is Barking");
    }

    @Override
    void Eat(){
        System.out.println("Dog is Eating");
    }
}

public class InheritanceAndPolymorphism {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Dog d1 = new Dog();
        
        a1.Eat();

        d1.Eat();
        // d1.sound();


        if (d1 instanceof Animal) {
            System.out.println("This is a Dog!");
        }
        else{
            System.out.println("Some Thing Error");
        }

        
    }
}
