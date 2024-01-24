import java.util.Scanner;
import java.util.Arrays;

class Student implements Comparable<Student> {
    int height;
    int weight;
    int number;

    public Student(int height, int weight, int number){
        this.height = height;
        this.weight = weight;
        this.number = number;
    }

    @Override
    public int compareTo(Student student){
        if(this.height != student.height) // 키가 동일하지 않다면
            return student.height - this.height; //키로 정렬
        if(this.weight != student.weight) // 몸무게가 동일하지 않다면
            return student.weight - this.weight; // 몸무게로 정렬
        return student.number - this.number; // 번호로 정렬
    }
};

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Student[] student = new Student[n];

        for(int i = 0; i < n; i++){
            int height = sc.nextInt();
            int weight = sc.nextInt();
            int number = i+1;

            student[i] = new Student(height, weight, number);
        };

        Arrays.sort(student);

        for(int i = 0; i < n; i++){
            System.out.println(student[i].height + " " + student[i].weight + " " + student[i].number);
        }
    }
}