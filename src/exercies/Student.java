package exercies;

import java.time.LocalDate;

public class Student {
    String studName;
    final int rollNumber;
    int grade;
    float marksInEnglish;
    float marksInMath;
    float marksInScience;
    LocalDate dob;
    static final String schoolName = "My School";

    public Student(String studName, int rollNumber, int grade, LocalDate dob) {
        this.studName = studName;
        this.rollNumber = rollNumber;
        this.grade = grade;
        this.dob = dob;
    }

    public Student(int rollNumber, String studName, int grade, LocalDate dob) {
        this.studName = studName;
        this.rollNumber = rollNumber;
        this.grade = grade;
        this.dob = dob;
    }

    // full loaded constructor
    public Student(String studName, int rollNumber, int grade, float marksInEnglish, float marksInMath,
            float marksInScience, LocalDate dob) {
        this.studName = studName;
        this.rollNumber = rollNumber;
        this.grade = grade;
        this.dob = dob;
        this.marksInEnglish = marksInEnglish;
        this.marksInMath = marksInMath;
        this.marksInScience = marksInScience;
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Student [studName=" + studName + ", rollNumber=" + rollNumber + ", grade=" + grade + ", marksInEnglish="
                + marksInEnglish + ", marksInMath=" + marksInMath + ", marksInScience=" + marksInScience + ", dob="
                + dob + "]";
    }

}
