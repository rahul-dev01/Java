import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();

        if(a < 0 ){
            System.out.println( a + " is Negative Number");
        }
        else if(a == 0 ){
            System.out.println( a + " is Zero");
        }
        
        else {
            System.out.println( a + " is Positive Number ");
        }

        sc.close();
    }
}
