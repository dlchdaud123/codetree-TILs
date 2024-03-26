import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr1[] = new int[10000000];
        int arr2[] = new int[10000000];
        int nCurr = 0;
        int mCurr = 0;
        int nCurrIdx = 0;
        int mCurrIdx = 0;

        for(int i = 0; i < n; i++){
            int time = sc.nextInt();
            String dir = sc.next();
            if(dir.equals("L")){
                for(int j = 0; j < time; j++){
                    arr1[nCurrIdx++] = nCurr--;
                }
            }
            else{
                for(int j = 0; j < time; j++){
                    arr1[nCurrIdx++] = nCurr++;
                }
            }
        }

        for(int i = 0; i < m; i++){
            int time = sc.nextInt();
            String dir = sc.next();
            if(dir.equals("L")){
                for(int j = 0; j < time; j++){
                    arr2[mCurrIdx++] = mCurr--;
                }
            }
            else{
                for(int j = 0; j < time; j++){
                    arr2[mCurrIdx++] = mCurr++; 
                }
            }
        }
        for(int i = nCurrIdx; i < nCurrIdx+mCurrIdx; i++){
            arr1[i] = arr1[i -1];
        }
        for(int i = mCurrIdx; i < nCurrIdx+mCurrIdx; i++){
            arr2[i] = arr2[i-1];
        }

        int meetCnt = 0;
        if(mCurrIdx > nCurrIdx){
            for(int i = 0; i < mCurrIdx; i++){
                System.out.println(i+ " "+ arr1[i] + " " + arr2[i]);
                if(arr1[i] == arr2[i]){
                    meetCnt++;
                    System.out.println("meet");
                }
            }
        }
        else{
            for(int i = 0; i < nCurrIdx; i++){
                System.out.println(i+ " "+ arr1[i] + " " + arr2[i]);
                if(arr1[i] == arr2[i]){
                    meetCnt++;
                    System.out.println("meet");
                }
            }
        }
        System.out.println(meetCnt - 1);
    }
}