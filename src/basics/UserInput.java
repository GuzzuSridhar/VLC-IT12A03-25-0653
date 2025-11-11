package basics;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name, city;
        int age;
        // scan.next();

        System.out.print("Enter your city: ");
        city = scan.nextLine(); // scan the text input from user

        System.out.print("Enter your name: ");
        name = scan.next(); // scan the single word input from user
        System.out.println("Welcome " + name + " From " + city);

        System.out.print("Enter your age: ");
        age = scan.nextInt(); // scan the numeric input from user
        System.out.println(" You are " + age + " years old");

        scan.close();

    }
}
