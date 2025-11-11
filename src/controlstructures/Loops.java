package controlstructures;

public class Loops {
    public static void main(String[] args) {
        // 3 types loops
        // while loop
        // do while loop
        // for loop

        // print numbers 1 to 10 with while loop
        int l = 0;
        while (l < 10) {
            System.out.print((l + 1) + " ");
            l += 1;
        }

        System.out.println();

        l = 0;
        do {
            System.out.print((l + 1) + " ");
            l += 1;
        } while (l < 10);

        System.out.println();

        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + " ");
        }

    }
}
