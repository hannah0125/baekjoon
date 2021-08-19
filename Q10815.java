import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int num[] = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(num);

        int M = Integer.parseInt(br.readLine());
        int comp[] = new int[M];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < M; i++) {
            comp[i] = Integer.parseInt(st.nextToken());
        };

        for (int i = 0; i < M; i++){
            int ans = find(comp[i], num);
            if (ans != -1){
                System.out.print("1" + " ");
            }
            else {
                System.out.print("0" + " ");
            }
        }

    }

    public static int find(int N, int num[]){
        int start = 0;
        int end = num.length - 1;

        while (start <= end){
            int mid = (start + end) / 2;
            if(num[mid] < N){
                start = mid + 1;
            }
            else if(num[mid] > N){
                end = mid - 1;
            }
            else{
                return 0;
            }
        }
        return -1;
    }
}
