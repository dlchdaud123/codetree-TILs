import java.util.*;

class Student{
    int hei;
    int wei;
    int idx;
    
    public Student(int hei, int wei, int idx){
        this.hei = hei;
        this.wei = wei;
        this.idx = idx;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] student = new Student[n];

        for(int i = 0; i < n; i++){
            int hei = sc.nextInt();
            int wei = sc.nextInt();
            int idx = i+1;

            student[i] = new Student(hei, wei, idx);
        }

        Arrays.sort(student, new Comparator<Student>() {
            @Override
            public int compare(Student a, Student b) {
            // number가 작으면 정렬 했을 때 앞에 와야 합니다.
                if(a.hei != b.hei) // 키가 다르면
                   return a.hei - b.hei; // 키 순서
            // index가 작으면 정렬 했을 때 앞에 와야 합니다.
                return b.wei - a.wei;
            }
            });

        for(int i = 0 ; i < n; i++){
            System.out.println(student[i].hei+" "+student[i].wei+" "+student[i].idx);
        }
        
    }
}