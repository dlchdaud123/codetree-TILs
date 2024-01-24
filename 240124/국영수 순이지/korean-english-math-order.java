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
        if(this.kor != score.kor) 
            return score.kor - this.kor;
        if(this.eng != score.eng) 
            return score.eng - this.eng;
        return score.math - this.math;
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