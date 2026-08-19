import java.util.Scanner;
class Triangle {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 sides of Triangles are : ");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a==b && b==c)
        System.out.println("equilateral");
        else
        System.out.println("Not a equilateral");
        sc.close();
    }
}
