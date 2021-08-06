import java.util.*;

public class Q10871{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int a[] = new int [N];
        int X = scan.nextInt();

        for (int i  = 0; i < a.length ; i++){
            a[i] = scan.nextInt();
            if (a[i] < X){
                System.out.println(a[i]);
            }
        }
        scan.close();
    }
}