import java.util.Scanner;

public class Q10162 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        int a, b, c;

        if (num % 10 != 0) {
            System.out.println(-1);
        }
        else{
            a = num / 300;
            b = (num - (300 * a)) / 60;
            c = (num - (300 * a) - (60 * b)) / 10;
    
            System.out.println(a + " " + b + " " + c);
        }

        scan.close();
    }
}
