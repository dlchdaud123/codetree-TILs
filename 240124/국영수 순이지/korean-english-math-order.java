import java.util.Scanner;
import java.util.Arrays;

class Score implements Comparable<Score> {
    String name;
    int kor;
    int eng;
    int math;

    public Score(String name, int kor, int eng, int math){
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    @Override
    public int compareTo(Score score) {
        if(this.kor == score.kor){ // 국어점수가 같으면
            if(this.eng == score.eng) // 영어 점수가 같으면
            return score.math - this.math; // 수학 점수로 내림차순
            else {
                return score.eng - this.eng; // 영어점수가 다르면, 영어점수로 내림차순
            }
        } 
        else {
            return score.kor - this.kor; // 국어점수 다르면, 국어점수로 내림차순
        }
        
    }
};

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Score[] score = new Score[n];

        for(int i = 0; i < n; i++){
            String name = sc.next();
            int kor = sc.nextInt();
            int eng = sc.nextInt();
            int math = sc.nextInt();

            score[i] = new Score(name, kor, eng, math);
        }

        Arrays.sort(score);

        for(int i = 0; i < n; i++){
            System.out.print(score[i].name + " ");
            System.out.print(score[i].kor + " ");
            System.out.print(score[i].eng + " ");
            System.out.println(score[i].math + " ");
        }
    }
}