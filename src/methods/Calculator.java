package methods;

public class Calculator {
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public int dif(int i, int j) {
        return i - j;
    }

    public int prod(int i, int j) {
        return i * j;
    }

    public int div(int i, int j) {
        return i / j;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(10, 20));
        System.out.println(calculator.dif(10, 20));
        System.out.println(calculator.prod(10, 20));
        System.out.println(calculator.div(10, 20));
    }
}
