package classesandobjects;

import java.util.Scanner;

public class EmpArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Employee[] employees = new Employee[3];
        // employees[0] = new Employee();
        // employees[1] = new Employee();
        // employees[2] = new Employee();
        // employees[3] = new Employee();
        // employees[4] = new Employee();

        for (int i = 0; i < employees.length; i++) {
            employees[i] = new Employee();
        }

        for (Employee e : employees) {
            System.out.print("Enter Employee Name: ");
            e.ename = scan.nextLine();
            System.out.print("Enter Employee ID: ");
            e.eid = scan.nextInt();
            scan.nextLine();
            System.out.print("Enter Employee Department: ");
            e.dept = scan.nextLine();
            System.out.print("Enter Employee Salary: ");
            e.sal = scan.nextFloat();
            scan.nextLine();
        }

        // rerieve the emp info
        for (Employee e : employees) {
            System.out.println(e.ename + " - " + e.eid + " - " + e.dept + " - " + e.sal);
        }
    }
}
