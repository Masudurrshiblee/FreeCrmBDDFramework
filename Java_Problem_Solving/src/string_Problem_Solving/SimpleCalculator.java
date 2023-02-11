package string_Problem_Solving;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Please enter two numbers :");
        double first = scan.nextDouble();
        double second = scan.nextDouble();

        System.out.println("plz enter an operator :(+,-,*,/");

        char operator = scan.next().charAt(0);

        double result =0 ;

        switch (operator){
            case'+':
                result=first + second;
            case'-':
                result=first - second;
            case'*':
                result=first * second;
            case'/':
                result=first / second;
                break;

            default:
                System.out.println("plz pass the correct operator");
                break;
        }
        System.out.println(result);

    }
}
