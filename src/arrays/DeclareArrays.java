package arrays;

public class DeclareArrays {
    public static void main(String[] args) {
        // Notes about Arrays
        // Array is a collection of data of similar type (Homogenous data)
        // Arrays are of fixed size (Once declared the size cannot be changed)
        // Arrays cannot be declared without a size
        // Arrays can be of primitive or Object type
        // Arrays are indexed (zero based index)
        // Three Ways of declaring an array

        // Method 1
        // declare an array without initialization
        int[] sal = new int[5];
        // adding elements to the empty array
        System.out.println("There are " + sal.length + " elements in the array");
        sal[0] = 100;
        sal[1] = 200;
        sal[2] = 300;
        sal[3] = 400;
        sal[4] = 500;

        // display elements in an array
        // using the traditional for loop
        for (int i = 0; i < sal.length; i++) {
            System.out.println(sal[i]);
        }

        // specific loop for arrays called for each loop
        for (int i : sal) {
            System.out.println(i);
        }

        // Method 2
        // Declare an initialize
        int[] age = { 10, 20, 30, 40 };

        // Method 3
        // Declare an initialize
        int[] x = new int[] { 10, 20, 30, 40 };
        String fruits[] = new String[] { "Apple", "Mango", "Grapes" };
        for (String str : fruits) {
            System.out.println(str);
        }

    }
}
