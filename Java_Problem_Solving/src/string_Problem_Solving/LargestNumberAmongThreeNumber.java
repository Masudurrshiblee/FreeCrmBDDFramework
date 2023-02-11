package string_Problem_Solving;

public class LargestNumberAmongThreeNumber {


    public static void main(String[] args) {


        int x =200;
        int y =200;
        int z =200;

        if(x>y && x>z){
           System.out.println("x is the largest number");
        }else if(y>z){
          System.out.println("y is the largest number");
        }else{
            System.out.println("z is the largest number");
        }
    }
}

