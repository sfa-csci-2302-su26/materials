public class University {
   String name;
   Student[] students;  // representing that smaller is part of bigger object

   public University(String name, Student[] students) {
    this.name = name;
    if(students.length > 1000)
        this.students = students;
   }

   public void printNames(){
    for(Student s: students) {
        System.out.println(s.getName());
    }
   }
}
