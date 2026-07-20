
import Student.*;

public class App {
    public static void main(String[] args) throws Exception {
       Student s = new Student("Jack", 31, 3.9);
        System.out.println(s.getAge());
        System.out.println(s.getName());
    }
}
