package string_Problem_Solving;

public class ReverseInteger {  //  We can use same method to check palindrome just we have to put one if condition
    public static void main(String[] args) {
        int num =12345;
   int rev =0;
   while (num != 0){
       rev = rev * 10 + num % 10;
       num = num/ 10;
   }
        System.out.println(rev);
        //System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
   int num1=123456;
   StringBuffer sf = new StringBuffer(String.valueOf(num1));
        System.out.println(sf.reverse());
    }
}
