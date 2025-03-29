class OuterClass {
    int outerVar = 3;

    class InnerClass {
        void display() {
            System.out.println("Outer variable: " + outerVar);
        }
    }
}

public class NeastedClass {
    public static void main(String[] args) {
        OuterClass outclass = new OuterClass();
        OuterClass.InnerClass outinnerClass = outclass.new InnerClass();

        outinnerClass.display();
    }
}
