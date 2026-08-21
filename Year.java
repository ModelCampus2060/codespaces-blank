class Year{
    public static void main(String[] args)
    {
        System.out.println("Leap years between 2000 to 2083");
        for(int y=2000; y<=2083; y++)
            if((y%4==0 && y%100!=0)||(y%400==0))
                System.out.println(y);
    }
}