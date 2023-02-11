package string_Problem_Solving;

public class FactorialValue {
    public static void main(String[] args) {
        // !5=5x4x3x2x1=120 is called Factorial 5
        //!4=24
        //!0=1
        //int num =0;
        int num =5;
        int fact =1;
        for(int i=1; i <=num; i++){
            fact = fact * i;
        }
        System.out.println("Factorial 5 is :" +fact);
    }
}
