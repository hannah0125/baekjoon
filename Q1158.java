import java.io.*;
import java.util.*;

public class Q1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int idx = 0;
        int NUM = N;
        int num[] = new int[N];
        int i = 0;

        for (int j = 0; j < N; j++) {
            num[j] = j+1;
        }
        
        System.out.print('<');

        while (NUM > 0){
            if(num[idx] != 0) {
                i++;
            }

            if (i == K){
                System.out.print(num[idx]);
                num[idx] = 0;
                i = 0;
                NUM--;
                if (NUM == 0){
                    break;
                }
                System.out.print(", ");
            }

            idx++;

            if (idx == N){
                idx = 0;
            }
        }

        System.out.println('>');
    }
}
