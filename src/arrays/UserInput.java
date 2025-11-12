package arrays;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        String[] names = new String[3];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter a name: ");
            names[i] = scan.nextLine();
        }

        for (String name : names) {
            System.out.println(name);
        }
        scan.close();
    }
}
