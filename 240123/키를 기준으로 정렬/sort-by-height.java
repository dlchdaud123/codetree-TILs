import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[] {
            new Student(90, 80, 90),
            new Student(20, 80, 80),
            new Student(90, 30, 60),
            new Student(60, 10, 50),
            new Student(80, 20, 10)
        };

        Arrays.sort(students);

        for(int i = 0; i < 5; i++)
            System.out.println(students[i].kor + " " + students[i].eng + " " + students[i].math);
            
    }
}