import java.util.*;

class Xynumber{
    int x;
    int y;
    int number;
    
    public Xynumber(int x, int y, int number){
        this.x = x;
        this.y = y;
        this.number = number;
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Xynumber[] xynumber = new Xynumber[n];

        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int number = i+1;
            xynumber[i] = new Xynumber(x, y, number);
        }

        Arrays.sort(xynumber, new Comparator<Xynumber>() {
            @Override
            public int compare(Xynumber a, Xynumber b) {
            if((Math.abs(a.x)+Math.abs(a.y)) != (Math.abs(b.x)+Math.abs(b.y))){
                return (Math.abs(a.x)+Math.abs(a.y)) - (Math.abs(b.x)+Math.abs(b.y));
            }
            return a.number - b.number;
            }
        });

        for(int i = 0; i < n; i++){
            System.out.println(xynumber[i].number);
        }
    }
}