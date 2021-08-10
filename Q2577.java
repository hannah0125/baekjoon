import java.util.Scanner;

public class Q2577 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();

        int num = A * B * C;

        String NUM = Integer.toString(num);

        for(int i = 0; i < 10; i++) {
            int count = 0;
            for(int j = 0; j < NUM.length(); j++) {
                if((NUM.charAt(j) - '0') == i){
                    count++;
                }
            }
            System.out.println(count);
        }
        scan.close();
    }
}
