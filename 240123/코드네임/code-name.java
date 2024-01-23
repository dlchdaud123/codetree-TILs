import java.util.Scanner;
class Agent {
    char code;
    int score;

    public Agent() {
        this.code = 'A';
        this.score = 0;
    }

    public Agent(char code, int score) {
        this.code = code;
        this.score = score;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = 100;
        int idx = 0;
        Agent[] agents = new Agent[5];
        for(int i = 0; i < 5; i++) {

            char code = sc.next().charAt(0);
            int score = sc.nextInt();
            if(min > score){
                idx = i;
                min = score;
            }
            agents[i] = new Agent(code, score);
        }
        Agent bestAgents = agents[idx];
        System.out.print(bestAgents.code+" ");
        System.out.print(bestAgents.score+" ");
        
    }
}