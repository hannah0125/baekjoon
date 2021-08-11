import java.util.Scanner;

public class Q2798 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int Max = scan.nextInt();
        int card[] = new int[num];
        int ans = 0;

        for (int i = 0; i < num; i++) {
            card[i] = scan.nextInt();
        }

        for (int i = 0; i < num; i++) {
            for (int j = i + 1; j < num; j++) {
                for (int k = j + 1; k < num; k++) {
                    if (card[i] + card[j] + card[k] == Max){
                        ans = card[i] + card[j] + card[k];
                    }
                    else if(card[i] + card[j] + card[k] < Max && card[i] + card[j] + card[k] > ans){
                        ans = card[i] + card[j] + card[k];
                    }
                }
            }
        }

        scan.close();

        System.out.println(ans);
    }   
}
