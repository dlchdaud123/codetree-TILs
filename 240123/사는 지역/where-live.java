import java.util.Scanner;

class Citizen{
    String name, addr, city;

    public Citizen(String name, String addr, String city){
        this.name = name;
        this.addr = addr;
        this.city = city;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char min = 'a';
        int idx = 0;
        Citizen[] citizen = new Citizen[n];
        for(int i = 0; i < n; i++){
            String name = sc.next();
            String addr = sc.next();
            String city = sc.next();
            citizen[i] = new Citizen(name, addr, city);

            if(name.charAt(0) > min){
                min = name.charAt(0);
                idx = i;
            }
        }
        System.out.println("name "+citizen[idx].name);
        System.out.println("addr "+citizen[idx].addr);
        System.out.println("city "+citizen[idx].city);
    }
}