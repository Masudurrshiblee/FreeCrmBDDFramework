package string_Problem_Solving;

public class Check_Palindrome_Number {
    public static void main(String[] args) {

        int num = 1234;
        int rev = 0;
        int actualNumber = num;

        while(num != 0){
            int n = num% 10;
            rev = rev * 10 + n;
            num = num/10;
        }
        System.out.println(" Reversed number is :"+ rev);
        if(actualNumber== rev){
            System.out.println(actualNumber + " is palindrome");
        }else{
            System.out.println(actualNumber + " is not palindrome");
        }
    }




}
