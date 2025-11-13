package mathclass;

public class MathClass {
    public static void main(String[] args) {
        double d = 0.4;
        System.out.println(Math.floor(d));
        System.out.println(Math.ceil(d));
        System.out.println(Math.round(d));

        int x = 10, y = 20, z = 30;
        System.out.println(Math.abs(x - y));
        System.out.println(Math.max(x, y));
        System.out.println(Math.min(x, y));
        System.out.println(Math.max(Math.max(x, y), z));

        System.out.println(Math.pow(10, 10));

    }
}
