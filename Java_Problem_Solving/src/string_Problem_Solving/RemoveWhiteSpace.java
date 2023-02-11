package string_Problem_Solving;

public class RemoveWhiteSpace {
    public static void main(String[] args)
    {
        String s = "India is best";
        String s1 = s.replaceAll("\\s", "");
        System.out.println(s1);
    }
}
