package string;

public class RemovwWhiteSpace {
    public static void main(String[] args) {
        String str = "Arjun is the best next engineer";
        String str2 = str.replaceAll("\\s+","");
        System.out.println(str2);
    }
}
