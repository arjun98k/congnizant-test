package string;

public class charactercount {
    public static void main(String[] args) {
        String str = "Hello Arjun kandekar";
        int count = 0;
        int space = 0;
        for (int i = 0; i < str.length() ; i++) {
            if (str.charAt(i)!=' '){
                count++;
            } else {
                space++;
            }



        } System.out.println(count);
        System.out.println(space);
    }
}
