import java.util.Scanner;

public class Q5585 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = 1000 - scan.nextInt();
        int a, b, c, d, e, f;
        a = num / 500;
        b = (num - (500 * a)) / 100;
        c = (num - (500 * a) - (100 * b)) / 50;
        d = (num - (500 * a) - (100 * b) - (50 * c)) / 10;
        e = (num - (500 * a) - (100 * b) - (50 * c) - (10 * d))/ 5;
        f = (num - (500 * a) - (100 * b) - (50 * c) - (10 * d) - (5 * e));

        int sum = a + b + c + d + e + f;
        
        System.out.println(sum);
        scan.close();
    }
}
