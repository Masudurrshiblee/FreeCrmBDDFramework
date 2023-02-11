package string_Problem_Solving;

public class Check_Alphabet {

    public static void main(String[] args) {

        char ch = 'b';
        if((ch>='a' && ch<= 'z') || (ch >='A' && ch <= 'Z')){
            System.out.println("It is Alphabet");
        }else{
            System.out.println("Is not alphabet");
        }
    }
}
