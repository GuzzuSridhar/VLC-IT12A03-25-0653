package exercies;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.print("Enter a Number: ");
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(m + " x " + i + " = " + (m * i));
        }
        scan.close();
    }
}
