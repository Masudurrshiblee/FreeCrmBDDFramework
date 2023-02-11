package string_Problem_Solving;

public class CheckVowelOrConsonant {
    public static void main(String[] args) {

        // a,e,i,o,u
        char ch = 'z';

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " is vowel");
        } else {
            System.out.println(ch + " is consonant");
        }

        switch (ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch +" is a vowel");
                break;

            default:
                System.out.println(ch +" is a consonant");
                break;





        }

    }
}

