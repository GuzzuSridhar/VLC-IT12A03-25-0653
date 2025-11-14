package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean isInputValid = false;
        int age = 0;
        System.out.print("Enter your age: ");
        while (!isInputValid) {
            try {
                age = scan.nextInt();
                isInputValid = true;
            } catch (InputMismatchException ip) {
                System.out.print("Enter a Valid Number: ");
                scan.nextLine();
            }
        }
        System.out.println(age);
        scan.close();
    }
}
