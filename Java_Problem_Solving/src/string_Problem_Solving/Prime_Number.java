package string_Problem_Solving;

public class Prime_Number {
    public static void main(String[] args) {
        int num = 10;
        boolean flag = false;
        for(int i=2; i<=num/2; i++){
            if(num % 2 == 0){
                flag = true;
                break;
            }
        }
        if(!flag){
            System.out.println(num +" is prime number");
        }else{
            System.out.println(num +" is not prime number");
        }
    }
}
