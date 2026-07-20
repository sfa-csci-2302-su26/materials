package Student;

public class Club {
    
    Student[] students;
    int count = 0;

    public Club() {
        students = new Student[100];
        students[0] = new Student("Jack", 31, 3.9);
    }

    public void getClubMembersName() {
        for(int i = 0; i < count; i++) {
            System.out.println(students[i].ame()getN);
        }
    }
}
