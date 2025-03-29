class Animal1 {
    
    // final void Eat() {    // if i used final in this then i am not able to override it 
    void Eat1() {
        System.out.println("Animal is Eating");
    }

}

class Dog extends Animal1 {
    void sound1() {
        System.out.println("Dog is Barking");
    }

    @Override
    void Eat1(){
        System.out.println("Dog is Eating");
    }
}

public class InheritanceAndPolymorphism {
    public static void main(String[] args) {
        Animal1 a1 = new Animal1();
        Dog d1 = new Dog();
        
        a1.Eat1();

        d1.Eat1();
        // d1.sound();


        if (d1 instanceof Animal) {
            System.out.println("This is a Dog!");
        }
        else{
            System.out.println("Some Thing Error");
        }

        
    }
}
