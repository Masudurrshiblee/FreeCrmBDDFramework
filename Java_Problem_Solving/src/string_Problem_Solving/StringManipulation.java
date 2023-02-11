package string_Problem_Solving;

import java.sql.SQLOutput;

public class StringManipulation {

    public static void main(String []args){

        String str="The rains have started here sunday";
        System.out.println(str.length()); // it will return the length
        System.out.println(str.charAt(5)); // it will return the character

        //First occurrence of s:
        System.out.println(str.indexOf('s')); // it will return the index of first available s

        // Second occurrence of s:
       // System.out.println(str.indexOf('s',9));
       // it will start counting from 9th index because on 8 index there is 1st s
        System.out.println(str.indexOf('s',str.indexOf('s')+1));// It will return s from 15 index

        // Third occurrence of s:
        //System.out.println(str.indexOf('s',16)); // it will return index of third available s and start counting from 16
        System.out.println(str.indexOf('s',str.indexOf('s',str.indexOf('s')+1)+1));

        //To get individual character
        System.out.println(str.indexOf("have"));

        // If string character is not available then it will return -1
        System.out.println(str.indexOf("Hello"));


        // String comparison: if two string match then return true ,if not return false
        String str1="The rains have started here sunday";
        System.out.println(str.equals(str1));
        System.out.println(str.equalsIgnoreCase(str1)); // it will ignore the case sensitive

        // To get substring
        System.out.println(str.substring(0,9));

        // Trim and Replace method: Trim will remove after and before space , but replace method will remove between space or anything in between two character
        String s="   hello-world    ";
        String date="01-02-2022";
        System.out.println(s.trim());
        System.out.println(s.replace("-"," "));
        System.out.println(date.replace("-","/"));

        // Split :
         String test="Hello_test_java_selenium";
         // If we want to split based on underscore it will return four value so we have to declare it as array
        String testvar []=test.split("_");
        for(int i=0; i<testvar.length; i++){
            System.out.println(testvar[i]);
        }

        // Concatination: String ca n be concatinate with variable

        String s3="rain";
        System.out.println(s3.concat("s"));

        String x="Hello";
        String y="world";
        int a=100;
        int b=200;
        double c=50.5;
        double d=100.75;
        System.out.println(x+y+a+b);// Result will be HelloWorld100200
        System.out.println(a+b+x+y); // Result will be 300HelloWorld
        System.out.println(x+y+(a+b)); // Result will be HelloWorld300
        System.out.println(x+y+b+c+d); // Result will be HelloWorld10020050.5100.75

    }
}
