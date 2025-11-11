package controlstructures;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Day of the week: ");
        int dow = scan.nextInt();
        switch (dow) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid");
                break;
        }

        switch (dow) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Working day");
                break;
            case 6:
            case 7:
                System.out.println("week End");

                break;

            default:
                break;
        }

    }
}
