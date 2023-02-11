package string_Problem_Solving;

import java.util.Scanner;

public class EvenAndOdd {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("plz enter number :");

        int num = scan.nextInt();

        if(num % 2 == 0){
           System.out.println("Number is even");
        }else{
           System.out.println("Number is odd");
        }
    }
}
