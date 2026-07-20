public class App {
    public static void main(String[] args) throws Exception {
        String name = "David";
        Student stud1 = new Student();
        System.out.println(stud1.getName()); // How to print the stud1 name?
        stud1.setGpa(3.4);
        stud1.setAge(23);
        System.out.println(stud1.getGPA());
        System.out.println(stud1.getAge());
        System.out.println(stud1);

    }

    public static void foo() {}
}
