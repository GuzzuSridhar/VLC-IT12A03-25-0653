package classesandobjects;

public class Employee_List {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();

        // add emp1 info
        emp1.ename = "John";
        emp1.eid = 100;
        emp1.dept = "Sales";
        emp1.sal = 999.77f;

        // add emp2 info
        emp2.ename = "Alex";
        emp2.eid = 101;
        emp2.dept = "Mktg";
        emp2.sal = 1299.32f;

        // retrieve the emp information
        System.out.println("------Emp 1 - Information");
        System.out.println("The Employee Name is: " + emp1.ename);
        System.out.println("The Employee ID is: " + emp1.eid);
        System.out.println("The Employee Department is: " + emp1.dept);
        System.out.println("The Employee Salary is: " + emp1.sal);

        System.out.println("------Emp 2 - Information");
        System.out.println("The Employee Name is: " + emp2.ename);
        System.out.println("The Employee ID is: " + emp2.eid);
        System.out.println("The Employee Department is: " + emp2.dept);
        System.out.println("The Employee Salary is: " + emp2.sal);

    }
}
