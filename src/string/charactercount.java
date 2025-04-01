package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class charactercount {
    public static void main(String[] args) {
        String str = "Hello Arjun kandekar";
        String str1 = new String("akash");
           str1.concat(" Salekar");
        System.out.println(str1);

        StringBuilder sb = new StringBuilder("Akshay");
        sb.append(" salekar");
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));

        List<Integer> list2 = list;

        list2.add(12);

        System.out.println(list);


        System.out.println(sb.toString());
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
