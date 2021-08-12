import java.util.Scanner;

public class Q11047 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int K = scan.nextInt();
        int ans = 0;

        int money[] = new int[N];

        for (int i = 0; i < N; i++) {   // 동전의 가치
            money[i] = scan.nextInt();
        }

        scan.close();

        for (int i = N - 1; i >= 0; i--) {
            ans = ans + (K / money[i]);
            K = K - ((K / money[i]) * money[i]);
        }

        System.out.println(ans);
    }
}
