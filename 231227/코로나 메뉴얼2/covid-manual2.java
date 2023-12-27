import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int temper[] = new int[3];
        char sang[] = new char[3];
        int hosp[] = new int[4];
        int emer = 0;

        for(int i = 0; i < 3; i++){
            sang[i] = sc.next().charAt(0);
            temper[i] = sc.nextInt();
            
            if(sang[i] == 'Y' && temper[i] >= 37){
                hosp[0]++; // A
            }
            else if(sang[i] == 'N' && temper[i] >= 37){
                hosp[1]++; // B
            }
            else if(sang[i] == 'Y' && temper[i] < 37){
                hosp[2]++; // C
            }
            else if(sang[i] == 'N' && temper[i] < 37){
                hosp[3]++; // D
            }
        }
        for(int i = 0;i < 4; i++){
            System.out.print(hosp[i]+" ");
        }
        if(temper[0] >= 2){
            System.out.print("E");
        }
        
    }
}