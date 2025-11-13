package enums;

public class Employee {
    String ename;
    Department dept;
    float sal;

    @Override
    public String toString() {
        return "ename=" + ename + ", dept=" + dept + ", sal=" + sal;
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.ename = "John";
        e.sal = 1989;
        e.dept = Department.ACCOUNTS;

        System.out.println(e);
    }
}
