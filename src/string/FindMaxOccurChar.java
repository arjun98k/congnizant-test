package string;

public class FindMaxOccurChar {
public static int findmax(String str){
    int maxcount = 0;
    char maxChar = ' ';
    for (int i = 0; i <str.length() ; i++) {
        int count = 0;
        for (int j = 0; j < str.length() ; j++) {
            if (str.charAt(i) == str.charAt(j)){
                count+=1;
            }

            }
        if (count>maxcount){
            maxcount  =  count;
            maxChar = str.charAt(i);

        }
    }
    System.out.println("Max occurring character: " + maxChar);
    return maxcount;

}

    public static void main(String[] args) {
        System.out.println(findmax("geeksforgeeks"));
    }
}
