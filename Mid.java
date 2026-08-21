import java.util.Scanner;
public class Mid{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter a three digit number:");
        n=sc.nextInt();
        int a=n/10;
        int mid=a%10;
        System.out.println(mid);
    }
}