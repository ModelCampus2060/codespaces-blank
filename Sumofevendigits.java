import java.util.Scanner;
public class Sumofevendi {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number:");
        int n=nextInt();;
        while(n!=0)
        {
            int rem=n%10;
            sum+=rem;
            n=n/10;
        }
        System.out.println(sum);
        sc.close();
    }
    
}
