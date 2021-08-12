import java.util.Scanner;
import java.util.Arrays;

public class Q11399 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int people[] = new int[num];
        int sum = 0;

        for (int i = 0; i < num; i++){
            people[i] = scan.nextInt();
        }
        scan.close();
        
        Arrays.sort(people);

        for (int i = 0; i < num; i++) {
            for (int j = i; j >= 0; j--){
                sum = sum + people[j];
            }
        }

        System.out.println(sum);
    }
}
