import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
// 2차원 배열 정렬을 위한 import
// Arrays -> 정렬   Comparator -> 비교

public class Q1931 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int end, x;


        int time[][] = new int[num][2];

        for (int i = 0; i < num; i++) {
            time[i][0] = scan.nextInt();
            time[i][1] = scan.nextInt();
        }
        
        // 끝나는 시간 기준으로 오름차순 정렬
        Arrays.sort(time, new Comparator<int[]>(){
            @Override
            public int compare(int[] a, int[] b){
                if(a[1] == b[1]){   // 끝나는 시각이 같은 경우라면
                    return a[0] - b[0]; // 시작하는 시각을 오름차순으로 정렬
                }
                else{
                    return a[1] - b[1]; // 평소에는 끝나는 시각을 오름차순으로 정렬
                }
            }
        });

        // ***내림차순은 b - a 순으로 바꾸면 된다!
        end = time[0][1];
        x = 1;

        for (int i = 1; i < num; i++){
            if (time[i][1] >= end) {
                if(time[i][0] >= end){
                    end = time[i][1];
                    x++;
                }
            }
        }

        scan.close();

        System.out.println(x);
    }
}