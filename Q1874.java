import java.io.*;
import java.util.*;

public class Q1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        
        int start = 0;

        while (N-- > 0) {
            int ans = Integer.parseInt(br.readLine());

            if (ans > start) {
                for (int i = start + 1; i <= ans; i++) {
                    stack.add(i);
                    sb.append('+').append('\n');
                }
                start = ans;
            }
            
            else if (stack.peek() != ans){
                System.out.println("NO");
                return;
            }
            stack.pop();
            sb.append('-').append('\n');
        }
        System.out.println(sb);
    }
    
}
