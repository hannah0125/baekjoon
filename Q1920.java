import java.util.Scanner;
import java.util.Arrays;

public class Q1920 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int ans; 

        int N = scan.nextInt();
        int num[] = new int[N];

        for (int i = 0; i < N; i++) {
            num[i] = scan.nextInt();
        }

        int M = scan.nextInt();
        int x[] = new int[M];

        for (int i = 0; i < M; i++) {
            x[i] = scan.nextInt();
        }

        scan.close();

        Arrays.sort(num);

        for (int i = 0; i < M; i++){
            ans = -1;
            ans = Arrays.binarySearch(num, x[i]);
            if (ans < 0) {
                System.out.println("0");
            }
            else{
                System.out.println("1");
            }
        }


    }
    
}
