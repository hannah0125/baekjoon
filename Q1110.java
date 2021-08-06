import java.util.Scanner;

public class Q1110 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int N = scan.nextInt();
        int next = N;
        int num = 0;

        while(true){
            if(next > 9){
                int a = next % 10;
                int b = next / 10;
                if(a+b >= 10){
                    next = a * 10 + ((a + b) % 10);
                }
                else{
                    next = a * 10 + (a + b);
                }
            }

            else{
                int a = next;
                next = a * 10 + a;
            }
            num++;
            
            if(next == N){
                break;
            }
        }

        System.out.println(num);
       
        scan.close();
    }    
}
