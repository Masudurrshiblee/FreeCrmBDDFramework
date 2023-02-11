package string_Problem_Solving;

import java.util.Scanner;

public class CheckLeapYear {

    public static void main(String[] args) {
        //int year;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter year :");
        int year = scan.nextInt();
        if((year % 4 == 0 && year % 100!=0 )|| year%400==0){
            System.out.println("this is leap year ");
        }else{
            System.out.println(" Is not a leap year");
        }

    }
}
