import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday ");
                break;

            case 2:
                System.out.println("Tuesday");
                break ; 

            default:
                System.out.println("Day is out of range");
        }

        sc.close();
    }
}
