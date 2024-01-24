import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

class People implements Comparable<People> {
    String name;
    int height;
    int weight;

    public People(String name, int height, int weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(People peoples) {
        return this.height - peoples.height;
    }
};

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();
        People[] peoples = new People[n];
        for(int i = 0; i < n; i++){
            String name = sc.next();
            int height = sc.nextInt();
            int weight = sc.nextInt();

            peoples[i] = new People(name, height, weight);
        }

        Arrays.sort(peoples);

        for (int i = 0; i < n; i++){
            System.out.print(peoples[i].name + " ");
            System.out.print(peoples[i].height + " ");
            System.out.println(peoples[i].weight + " ");
        }
    }
}