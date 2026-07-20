import java.nio.channels.AlreadyBoundException;

public class Student {
    private String name;
    private int age;
    private double gpa;

    // TODO: Write a constructor and assign values "alex", 22, 3.2 to the variables of this class
    public Student() {
        name = "alex";
        age = 22;
        gpa = 3.2;
    }
    // Later I will add methods to this class

    // Accessor or Getter methods 
    public String getName() {
        return name;
    }

    public double getGPA() {
        return gpa;
    }

    public int getAge() {
        return age;
    }

    // Write accessor or getter methods for age and gpa

    // Mutators or Setter methods
    public void setGpa(double new_gpa) {
        gpa = new_gpa;
    }

    // Write a setter method to change the age of Alex from 22 to any age
    public void setAge(int new_age) {
        age = new_age;
    }

    // toString() method is a special to print the object in a 
    // particular format inside System.out.print()
    @Override 
    public String toString() {
        String msg = String.format("Name: %s\nAge: %d\nGpa: %.2f", name, age, gpa);
        return msg; 
        
    }

}
