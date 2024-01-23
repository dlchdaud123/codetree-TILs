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
        Citizen[] citizen = new Citizen[n];
        for(int i = 0; i < n; i++){
            String name = sc.next();
            String addr = sc.next();
            String city = sc.next();
            citizen[i] = new Citizen(name, addr, city);
        }
        System.out.println("name "+citizen[n-1].name);
        System.out.println("addr "+citizen[n-1].addr);
        System.out.println("city "+citizen[n-1].city);
    }
}