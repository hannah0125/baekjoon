import java.util.Scanner;

public class Q2839 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int ans = -1;

        if (num % 5 == 0){
            ans = num / 5;
        }
        else if (num % 5 == 1 || num % 5 == 3){
            ans = (num / 5) + 1;
        }
        else if (num % 5 == 2 || num % 5 == 4){
            ans = (num / 5) + 2;
        }
        if (num == 4 || num == 7){
            ans = -1;
        }

        System.out.println(ans);
        
        scan.close();
    }
}
