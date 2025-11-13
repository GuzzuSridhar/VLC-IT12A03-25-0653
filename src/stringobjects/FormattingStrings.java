package stringobjects;

public class FormattingStrings {
    public static void main(String[] args) {
        // %s -- String
        // %d -- integers
        // %f -- float
        // %b -- boolean

        String name = "John";
        int age = 45;
        System.out.printf("I am \u001B[32m %s \u001B[0m and i am %d age years old", name, age);

        System.out.println("-----------------");

        System.out.printf("%-10s %-5s %-10s %-10s%n", "Name", "Age", "Salary", "Active");
        System.out.println("----------------------------------------");

        System.out.printf("%-10s %-5d $%,.2f %-10b%n", "Alice", 25, 55000.0, true);
        System.out.printf("%-10s %-5d $%,.2f %-10b%n", "Bob", 30, 72000.5, false);
        System.out.printf("%-10s %-5d $%,.2f %-10b%n", "Charlie", 28, 61500.75, true);
    }
}
