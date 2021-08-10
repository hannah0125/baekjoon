public class Q4673 {
    // 셀프 넘버
    public static int num(int number) {
        int sum = number;

        while (number != 0) {   // 생성자를 사용하여 만들어진 수
            sum = sum + number % 10;
            number /= 10;
        }
        return sum;
    }
    public static void main(String[] args){
        boolean[] check = new boolean[10001];

        for (int i = 0; i < 10001; i++) {
            int n = num(i);

            if(n < 10001) {
                check[n] = true;
                // 생성자를 사용하여 만들어진 수를 인덱스로 한 boolean 배열 원소를 true로 변경
            
            }
       }

       // 원소가 false 인 인덱스 번호만 출력
       for (int i = 0; i < 10001; i++) {
           if(!check[i]) {
               System.out.println(i);
           }
       }
    }
}
