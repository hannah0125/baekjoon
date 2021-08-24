import java.util.*;
import java.io.*;

public class Q9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            int num = 0;
            String str = br.readLine();
            for (int j = 0; j < str.length(); j++) {
                char ps = str.charAt(j);
                if (ps == '('){
                    num++;
                }
                if (ps == ')'){
                    num--;
                    if (num < 0) {
                        break;
                    }
                }
            }
            if (num == 0){
                System.out.println("YES");
            }
            if (num != 0){
                System.out.println("NO");
            }
        }
    }
}
