import java.util.Scanner;
class Date{
    String date;
    String weekname;
    String weather;

    public Date(String date, String weekname, String weather){
        this.date = date;
        this.weekname = weekname;
        this.weather = weather;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String nearDate = "2100-12-31";
        int idx = 0;
        Date[] date = new Date[n];
        for(int i = 0; i < n; i++){
            String date1 = sc.next();
            String weekname1 = sc.next();
            String weather1 = sc.next();
            date[i] = new Date(date1, weekname1, weather1);
            if(weather1.compareTo("Rain") == 0){ // 비가 온다면
                if(date1.compareTo(nearDate) < 0){ 
                    nearDate = date1;
                    idx = i;
                }
            }
        }
        System.out.print(date[idx].date+" "+date[idx].weekname+" "+date[idx].weather);
    }
}