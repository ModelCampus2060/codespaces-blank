public class Valid{
    public static void validate(int age){
        if(age<18){
            throw new ArithmeticException("Person is not Eligible to vote");
        }
        else{
            System.out.println("Person is Eligible to vote");
        }
    }
    public static void main(String[] args){
        validate(28);
        System.out.println("Rest of the code.........");
    }
}