package Student;
public class Student {
    String name;
    private int age;
    private double gpa;
    private double internal_score;

    public Student(String name, int age, double gpa) {
        this(name, age, gpa, 2*gpa); // calling the second constructor 
    }

    private Student(String name, int age, double gpa, double internal_score) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.internal_score = internal_score;
    } 

    private String getName() {
        return name;
    }

    public int getAge() {
        getName();
        return age;
    }

    double getGpa() {
        return gpa;
    }
}