package controlstructures;

public class BreakAndContinue {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            if (i == 5)
                break; // exit the loop at this line
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = 1; i < 11; i++) {
            if (i == 5)
                continue; // skips the execution for current iteration from this line
            System.out.print(i + " ");
        }
    }
}
