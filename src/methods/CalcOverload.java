package methods;

public class CalcOverload {
    /*
     * Method OverLoading
     * Methods with same name and different # arguments or different types of
     * arguments
     * but the return type and accessmodifier can also change
     */

    // public int add(int n1, int n2) {
    // return n1 + n2;
    // }

    // // overloaded method
    // public int add(int n1, int n2, int n3) {
    // return n1 + n2 + n3;
    // }

    // public int add(int n1, int n2, int n3, int n4) {
    // return n1 + n2 + n3;
    // }

    public float add(float n1, float n2, float n3, float n4) {
        return n1 + n2 + n3;
    }

    // unlimited parameters (var args)
    public int add(int... n) {
        int res = 0;
        for (int i : n) {
            res += i;
        }
        return (res);
    }

    public int dif(int i, int j) {
        return i - j;
    }

    // overloaded method
    public int dif(int i, int j, int k) {
        return i - j - k;
    }

    public int prod(int i, int j) {
        return i * j;
    }

    public int div(int i, int j) {
        return i / j;
    }

    public static void main(String[] args) {
        CalcOverload c = new CalcOverload();
        c.add(10.6f, 8.5f, 5.6f, 4.5f);
        System.out.println(c.add(10, 2));
        System.out.println(c.add(10, 2, 5));
        System.out.println(c.add(10, 2, 5, 5));

    }
}
