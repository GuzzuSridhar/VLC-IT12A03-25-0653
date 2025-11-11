package exercies;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int input = scan.nextInt(), temp = 0;
        for (int i = 2; i < input; i++) {
            if (input % i == 0) {
                temp++;
            }
        }

        if (temp == 0) {
            System.out.println(input + " is a prime number");
        } else {
            System.out.println(input + " is not a prime number");
        }

        scan.close();

    }
}
