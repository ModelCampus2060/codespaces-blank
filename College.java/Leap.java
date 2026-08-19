import java.util.Scanner;
class Leap {
    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any year : ");
        year = sc.nextInt();
	if((year%4==0 && year%100!=0)||year%400==0)
	System.out.println(year + "is leap year");
	else
	System.out.println(year+"is not a Leap Year"); 
        sc.close();
    }
}