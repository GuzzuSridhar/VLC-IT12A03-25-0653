package stringbuilder;

public class SbDemo {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java");

        // append
        sb.append(" Programming");
        System.out.println(sb);

        // insert
        sb.insert(5, "OOP ");
        System.out.println(sb);

        // delete
        sb.delete(5, 9);
        System.out.println(sb);

        // replace
        sb.replace(0, 4, "Python");
        System.out.println(sb);

        // reverse
        sb.reverse();
        System.out.println(sb);

        sb.reverse();
        // substring
        System.out.println(sb.substring(0, 6));

        // length
        System.out.println(sb.length());

        // current capacity
        System.out.println(sb.capacity());

        // endure capacity
        sb.ensureCapacity(100);
        System.out.println(sb.capacity());

        // trim to size
        sb.trimToSize();
        System.out.println(sb.capacity());

        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder("hello");

        System.out.println(sb1 == sb2);

        System.out.println(sb1.toString());
        System.out.println(sb2.toString());

        System.out.println(sb1.toString().equalsIgnoreCase(sb2.toString()));
    }
}
