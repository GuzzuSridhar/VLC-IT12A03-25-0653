package exercies;

public class Student {
    String studName;
    final int rollNumber;
    int grade;
    float marksInEnglish;
    float marksInMath;
    float marksInScience;
    static final String schoolName = "My School";

    public Student(String studName, int rollNumber, int grade) {
        this.studName = studName;
        this.rollNumber = rollNumber;
        this.grade = grade;
    }

    public Student(int rollNumber, String studName, int grade) {
        this.studName = studName;
        this.rollNumber = rollNumber;
        this.grade = grade;
    }

    // full loaded constructor
    public Student(String studName, int rollNumber, int grade, float marksInEnglish, float marksInMath,
            float marksInScience) {
        this.studName = studName;
        this.rollNumber = rollNumber;
        this.grade = grade;
        this.marksInEnglish = marksInEnglish;
        this.marksInMath = marksInMath;
        this.marksInScience = marksInScience;
    }

}
