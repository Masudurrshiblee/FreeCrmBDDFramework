package string_Problem_Solving;

public class StringLengthWithoutInbuilt {
    public static void main(String args[]) {
        String str = "sampleString";
        int length = 0;
        for(char c: str.toCharArray()) {
            length++;
        }
        System.out.println("Length of the given string ::"+length);
    }
}
