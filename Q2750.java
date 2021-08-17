import java.util.Scanner;

public class Q2750 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int num[] = new int[N];
        int temp;

        for (int i = 0; i < N; i++) {
            num[i] = scan.nextInt();
        }

        scan.close();

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if(num[i] > num[j]){
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }

        for (int i = 0; i < N; i ++) {
            System.out.println(num[i]);
        }

    }
}
    