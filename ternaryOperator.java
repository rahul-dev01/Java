import java.util.Scanner;

public class ternaryOperator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        String result = (x > 0) ? "Positive Number " : "Negative Number" ;

        System.out.println(result);

        sc.close();
    }
}