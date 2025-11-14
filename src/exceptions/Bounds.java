package exceptions;

public class Bounds {
    public static void main(String[] args) {
        int[] nums = { 10, 20, 30 };

        try {
            System.out.println(nums[0]);
            System.out.println(nums[1]);
            System.out.println(nums[2]);
            System.out.println(nums[3]); // exception raised and should be handled.
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Other line of code");
        System.out.println("Other line of code");
        System.out.println("Other line of code");
        System.out.println("Other line of code");
        System.out.println("Other line of code");
        System.out.println("Other line of code");
        System.out.println("Other line of code");
    }
}
