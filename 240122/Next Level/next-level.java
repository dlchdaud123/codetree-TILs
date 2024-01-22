import java.util.Scanner;

class User {
    String id;
    int lv;

    public User(){
        this.id = "";
        this.lv = 0;
    }
    public User(String id, int lv){
        this.id = id;
        this.lv = lv;
    }
};


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        User user1 = new User();

        user1.id = "codetree";
        user1.lv = 10;
        
        String id2 = sc.next();
        int lv2 = sc.nextInt();

        User user2 = new User();
        user2.id = id2;
        user2.lv = lv2;
        
        System.out.println("user "+user1.id+" lv "+user1.lv);
        System.out.println("user "+user2.id+" lv "+user2.lv);
    }
}