import java.util.Scanner;

class User {
    String id;
    int lv;

    public User(){
        this.id = "codetree";
        this.lv = 10;
    }
    public User(String id, int lv){
        this.id = id;
        this.lv = lv;
    }
};


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String id = "codetree";
        int lv = 10;

        User user2 = new User();
        System.out.println("user "+user2.id+" lv "+user2.lv);

        id = sc.next();
        lv = sc.nextInt();

        User user1 = new User(id, lv);
        System.out.println("user "+user1.id+" lv "+user1.lv);
    }
}