import java.util.Scanner;
public class Sumofeven {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number:");
        int n=sc.nextInt();
        while(n!=0)
        {
            int rem=n%10;
            if(rem%2==0){
            sum+=rem;
            }
            n=n/10;
        }
        System.out.println(sum);
        sc.close();
    }
    
}
