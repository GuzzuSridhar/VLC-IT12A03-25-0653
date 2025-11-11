package stringobjects;

public class stringobject {
    public static void main(String[] args) {
        // declare Strings
        // String literals always created in the heap memory ina string pool
        String a = "Hello";
        String b = "Hello";

        // String Object is createed in a new memory for each string
        String c = new String("hello");

        // comparision of Strings
        System.out.println(a == b); // checks memory address
        System.out.println(a == c); // checks memory address

        System.out.println(a.equals(c)); // uses the case sensitive check
        System.out.println(a.equals(b));

        System.out.println(a.equalsIgnoreCase(c)); // uses the case insensitive check

        // other String Methods
        // Length()
        System.out.println(a.length());
        // charAt()
        System.out.println(a.charAt(0));
        System.out.println(a.charAt(1));
        System.out.println(a.charAt(2));
        System.out.println(a.charAt(3));
        System.out.println(a.charAt(4));
        // System.out.println(a.charAt(5)); // runtime error (Exception) , code exists

        // from this line
        // concat method
        System.out.println("Not run");
        System.out.println(a.concat(" World"));

        // case conversion
        System.out.println(a.toLowerCase());
        System.out.println(a.toUpperCase());

    }
}
