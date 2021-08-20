import java.io.*;
import java.util.StringTokenizer;

public class Q10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int deque[] = new int[20000];
        int front = 9999;
        int back = 10000;
        int num = 0;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String input = st.nextToken();

            if (input.equals("push_front")) {
                deque[front--] = Integer.parseInt(st.nextToken());
                num++;
            }
            else if (input.equals("pop_front")) {
                if(num == 0){
                    System.out.println(-1);
                }
                else{
                    System.out.println(deque[front + 1]);
                    front++;
                    num--;
                }
            }
            else if (input.equals("push_back")) {
                deque[back++] = Integer.parseInt(st.nextToken());
                num++;
            }
            else if (input.equals("pop_back")) {
                if(num == 0) {
                    System.out.println(-1);
                }
                else{
                    System.out.println(deque[back-1]);
                    back--;
                    num--;
                }
            }
            else if (input.equals("size")) {
                System.out.println(num);
            }
            else if (input.equals("empty")) {
                if (num == 0) {
                    System.out.println(1);
                }
                else System.out.println(0);
            }
            else if (input.equals("front")) {
                if (num == 0){
                    System.out.println(-1);
                }
                else System.out.println(deque[front + 1]);
            }
            else if (input.equals("back")) {
                if (num == 0) {
                    System.out.println(-1);
                }
                else System.out.println(deque[back - 1]);
            }
        }
    }
}