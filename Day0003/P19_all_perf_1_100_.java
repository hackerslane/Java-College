package Day0003;
// WAP to print all perfect numbers between 1 to 100


public class P19_all_perf_1_100_ {
    public static void main(String[] args) {
        System.out.println("Perfect numbers from 1 to 100 are:");

        
        for (int num = 1; num <= 100; num++) {
            int sum = 0;

            
            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    sum += i;
                }
            }

            
            if (sum == num) {
                System.out.println(num + " is a Perfect Number");
            }
        }
    }
}
