class Car{
    String Name ;
    int Size ;
    String Color ;

    {
        System.out.println("Car Class is Called ! ");
        Color = "White" ;
    }

    Car(String  Name , int Size , String Color){
        this.Name = Name ; 
        this.Size = Size ;
        this.Color = Color; 
    }

    void display() {
        System.out.println("Name is " +  Name + " Size is " + Size + " And Color is " + Color);
    }

    void changeColor(String newColor){
        this. Color = newColor ;
    }

}


public class classConstructor {
    public static void main(String[] args) {


        Car c1 = new Car("Rahul", 4, "BLack") ;
        c1.display();
        c1.changeColor("Green");
        c1.display();
        
    }
    
}
