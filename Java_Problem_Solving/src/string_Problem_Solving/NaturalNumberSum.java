package string_Problem_Solving;

public class NaturalNumberSum {
    public static void main(String[] args) {
         int num= 20;
         //int num= 100;
         int sum = 0;
         for(int i = 1; i<=num; i++){
             sum = sum + i;
         }
         System.out.println("sum is : " +sum);
    }
}
