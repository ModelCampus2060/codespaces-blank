public import java.util.Scanner;
public class PrimeCompo {
    public static void main(String[] args) {
        int n, count;
        Scanner sc = new Scanner(System.in);
        for (n = 2; n <= 100; n++) {
            count = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(n);
            }
        }
        sc.close();
    }
} {
    
}
