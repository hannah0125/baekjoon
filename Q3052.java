import java.util.Scanner;
import java.util.HashSet;

public class Q3052 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashSet<Integer> hash = new HashSet<Integer>();
        // 중복되는 값은 자동으로 HashSet에 입력되지 않음

        for (int i = 0; i < 10; i++){
            hash.add(scan.nextInt() % 42);  // 입력받은 수를 42로 나눈 나머지를 바로 HASHSET에 입력
        }

        scan.close();

        System.out.println(hash.size());
    }
}
