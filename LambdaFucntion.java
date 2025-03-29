@FunctionalInterface
interface MyFunctionalInterface {
    void printMessage(String message);  
}
public class LambdaFucntion {
    public static void main(String[] args) {
        
        MyFunctionalInterface messagePrinter = (message) -> System.out.println(message);
        
        
        messagePrinter.printMessage("Hello, Rahul !");
    }
}
