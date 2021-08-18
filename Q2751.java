import java.util.Arrays;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Q2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int num[] = new int[N];

        for(int i = 0; i < N; i++){
            num[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(num);

        for(int i = 0; i < N; i++) {
            sb.append(num[i] + "\n");
        }
        System.out.println(sb);
    }
}