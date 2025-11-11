package controlstructures;

public class StringsWithLoops {
    public static void main(String[] args) {
        String test = "Hello";
        for (int i = 0; i < test.length(); i++) {
            System.out.print(test.charAt(i));
        }

        System.out.println();

        for (int i = test.length() - 1; i >= 0; i--) {
            System.out.print(test.charAt(i));
        }
    }
}
