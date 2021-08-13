import java.util.*;

public class Q1202 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int K = scan.nextInt();

        // 우선순위 큐
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // 보석과 가방 배열 생성
        ArrayList<Jewelry> jewelries = new ArrayList<>();
        ArrayList<Integer> bag = new ArrayList<>();

        // Jewelry 클래스의 생성자 사용
        for (int i = 0; i < N; i++) {
            jewelries.add(new Jewelry(scan.nextInt(), scan.nextInt()));
        }

        for (int i = 0; i < K; i++) {
            bag.add(scan.nextInt());
        }

        Collections.sort(jewelries, new Comparator<Jewelry>() {
            @Override
            public int compare(Jewelry a, Jewelry b) {
                if (a.x <= b.x) {
                    return -1;
                }
                else{
                    return 1;
                }
            }
        });

        Collections.sort(bag);

        long ans = 0;
        int idx = 0;

        for (int i : bag) {
            while (idx < N) {
                if (i >= jewelries.get(idx).x) {
                    pq.add(-(jewelries.get(idx++).y));
                }else{
                    break;
                }
            }

            if (!pq.isEmpty()) ans = ans + Math.abs(pq.poll());
        }
        
        System.out.println(ans);
    }

    public static class Jewelry {
        int x;
        int y;

        // 생성자 - 클래스를 특정 형태로 초기화
        public Jewelry (int x, int y){
            this.x = x;
            this.y = y;
        }
    }
}