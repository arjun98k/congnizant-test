package string;



public class CapitalFirstLast {

    public static String capFL(String str1input){
        if (str1input == null && str1input.isEmpty()){
            return str1input;
        }
        String[] words = str1input.split(" ");
        StringBuilder answ = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.length() == 0){
                answ.append(" ");
                continue;
            }
            if (word.length() == 1) {
                answ.append(Character.toUpperCase(word.charAt(0)));
            } else {
                char f = Character.toUpperCase(word.charAt(0));
                String m = word.substring(1,word.length()-1);
                char l = Character.toUpperCase(word.charAt(word.length()-1));

                answ.append(f).append(m).append(l);
            }
            if (i < words.length-1){
                answ.append(" ");
            }


        }
        return answ.toString();
    }

    public static void main(String[] args) {

        String str1input = "hello arjun kandekar real og engineer";
        String output = capFL(str1input);
        System.out.println(output);

    }
}
