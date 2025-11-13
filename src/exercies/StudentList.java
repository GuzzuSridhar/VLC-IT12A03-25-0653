package exercies;

import java.time.LocalDate;
import java.util.Scanner;

public class StudentList {
    static Student[] students;
    static Scanner scan;

    public static void main(String[] args) {
        students = new Student[1];
        scan = new Scanner(System.in);
        int grade = 0, id = 0, dd = 0, mm = 0, yy = 0;
        String name = "";
        LocalDate dob;

        // add records
        for (int i = 0; i < students.length; i++) {
            System.out.print("Enter Student Name: ");
            name = scan.nextLine();
            System.out.print("Enter Student ID: ");
            id = scan.nextInt();
            scan.nextLine();
            System.out.print("Enter Student Grade: ");
            grade = scan.nextInt();
            scan.nextLine();
            System.out.print("Enter Student date of Birth (Date): ");
            dd = scan.nextInt();
            scan.nextLine();
            System.out.print("Enter Student date of Birth (Month): ");
            mm = scan.nextInt();
            scan.nextLine();
            System.out.print("Enter Student date of Birth (Year): ");
            yy = scan.nextInt();
            scan.nextLine();
            dob = LocalDate.of(yy, mm, dd);
            students[i] = new Student(name, id, grade, dob);
        }

        // display the records
        displayRecords();

        System.out.print("Select a Student to add marks to: ");
        int tmp = scan.nextInt();
        scan.nextLine();
        addMarks(tmp);

        displayRecords();

    }

    public static void addMarks(int id) {
        boolean isFound = false;
        for (Student student : students) {
            if (student.rollNumber == id) {
                isFound = true;
                System.out.print("Enter Marks in English: ");
                float m1 = scan.nextFloat();
                scan.nextLine();
                System.out.print("Enter Marks in Maths: ");
                float m2 = scan.nextFloat();
                scan.nextLine();
                System.out.print("Enter Marks in Science: ");
                float m3 = scan.nextFloat();
                scan.nextLine();
                student.marksInEnglish = m1;
                student.marksInMath = m2;
                student.marksInScience = m3;
            }
        }
        if (!isFound) {
            System.out.println("Student Not Found");
        }
    }

    public static void displayRecords() {
        for (Student student : students) {
            // System.out.println(student.studName + " - " + student.rollNumber + " - " +
            // student.grade + " - "
            // + student.marksInEnglish + " - " + student.marksInMath + " - " +
            // student.marksInScience);
            System.out.println(student); // toString() invoked
        }
    }
}
