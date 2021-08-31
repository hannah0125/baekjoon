import java.util.*;
import java.io.*;

public class Q1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st; 

        int CASE = Integer.parseInt(br.readLine());

        for (int j = 1; j <= CASE; j++) {
            st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int idx = Integer.parseInt(st.nextToken());
            int num = 0;
            int idxnum = 0;
    
            st = new StringTokenizer(br.readLine());
    
            LinkedList<Integer> q = new LinkedList<>();
            Queue<Integer> q2 = new LinkedList<>();
    
            for (int i = 0; i < n; i++) {
                int NUM = Integer.parseInt(st.nextToken());
                q.add(NUM);
                if (i == idx) {
                    q2.add(NUM);
                    idxnum = NUM;
                }
                else{
                    q2.add(10000);
                }
            }
    
            while(!q.isEmpty()) {
                boolean ox = true;
                for (int i = 0; i < q.size(); i++) {
                    if(q.peek() < q.get(i)) {
                        ox = false;
                        break;
                    }
                }
                if (!ox) {
                    q.add(q.poll());
                    q2.add(q2.poll());
                }
                else{
                    q.poll();
                    num++;
                    if(q2.peek() == idxnum) {
                        System.out.println(num);
                    }
                    q2.poll();
                }
            }
    
        }
    }
}
