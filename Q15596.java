public class Q15596 {
    long sum = 0;

    long sum(int[] a){
        for (int i = 0; i < a.length; i++){
            sum += a[i];
        }
        return sum;
    }
}
