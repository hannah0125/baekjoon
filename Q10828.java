import java.io.*;
import java.util.StringTokenizer;


public class Q10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int stack[] = new int[10000];
        int idx = 0;

        for (int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            if (str.equals("push")){
                stack[idx++] = Integer.parseInt(st.nextToken());
            }
            else if (str.equals("pop")){
                if (idx == 0){
                    System.out.println(-1);
                }
                else{
                    System.out.println(stack[idx-1]);
                    idx--;
                }
            }
            else if (str.equals("size")) {
                System.out.println(idx);
            }
            else if (str.equals("empty")) {
                if (idx == 0){
                    System.out.println(1);
                }
                else{
                    System.out.println(0);
                }
            }
            else if (str.equals("top")){
                if (idx == 0) {
                    System.out.println(-1);
                }
                else{
                    System.out.println(stack[idx-1]);
                }

            }
        
        }

    }
}
