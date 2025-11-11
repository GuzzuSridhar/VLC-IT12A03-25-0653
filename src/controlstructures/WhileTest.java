package controlstructures;

import java.util.Scanner;

public class WhileTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String pass;
        do {
            System.out.print("Enter your password: ");
            pass = scan.next();
        } while (!(pass.equalsIgnoreCase("test")));
        scan.close();
    }
}
