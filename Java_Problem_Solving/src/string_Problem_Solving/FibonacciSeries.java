package string_Problem_Solving;

public class FibonacciSeries {
    public static void main(String[] args) {
        // Fibonacci series is series of number is the sum of two preceding number, like0 1 1 2 3 5 8 13
        // here first two number will not change because it will add last two number
        int num=10;
        int t1=0;
        int t2=1;
        for(int i=0; i<=num;i++){
            System.out.println(t1);

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }
}

