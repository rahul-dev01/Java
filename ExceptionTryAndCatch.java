// import java.util.Scanner;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionTryAndCatch {

    static void checkAge(int age) throws IllegalArgumentException {
        if (age < 18) {
            throw new IllegalArgumentException("Not eligible to vote");
        }
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the num 1 : " );
        // int num1 = sc.nextInt();
        // System.out.print("Enter the num 2 : ");
        // int num2 = sc.nextInt();

        int num1 = 10;
        int num2 = 0;

        // Arithmetic Exception
        try {
            int result = num1 / num2;
            System.out.println("Result : " + result);
        } catch (ArithmeticException e) {
            System.out.println(e);
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Exception Run Successfully  ");
        }

        // Explict Exception
        // checkAge(12);

        try {
            int[] arr = new int[5];
            arr[10] = 100;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: " + e.getMessage());
        }


        try (BufferedReader br = new BufferedReader(new FileReader("raj.txt"))) {
            System.out.println(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
