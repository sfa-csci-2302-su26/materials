public class App {
    public static void main(String[] args) throws Exception {
        
        Student s1 = new Student("Jack");
        Student s2 = new Student("Kyla");
        Student s3 = new Student("Jessica");

        Student[] students = {s1, s2, s3};

        {
            University uni = new University("SFA", students);
            uni.printNames();
            System.out.println(s1.getName());
        }

        
        System.out.println(students[0].getName());


        
    }
}
