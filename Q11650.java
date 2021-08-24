import java.util.*;
import java.io.*;

public class Q11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int xy[][] = new int[N][2];
        for (int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            xy[i][0] = Integer.parseInt(st.nextToken());
            xy[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(xy, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                if (a[0] == b[0]) {
                    return a[1] - b[1];
                }
                else
                    return a[0] - b[0];
            }
        });

        for (int i = 0; i < N; i++) {
            System.out.println(xy[i][0] + " " + xy[i][1]);
        }
    }
}
