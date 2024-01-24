import java.util.*;

class Student{
    String name;
    int height;
    int weight;

    public Student(String name, int height, int weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] student = new Student[n];

        for(int i = 0; i < n; i++){
            String name = sc.next();
            int height = sc.nextInt();
            int weight = sc.nextInt();

            student[i] = new Student(name, height, weight);
        }
        Arrays.sort(student, new Comparator<Student>() {
            @Override
            public int compare(Student a, Student b) {
                if(a.height != b.height){
                    return a.height - b.height;
                }
                return b.weight - a.weight;
            }
        });

        for(int i = 0; i < n; i++){
            System.out.println(student[i].name + " " + student[i].height + " " + student[i].weight);
        }
    }
}