package string;

public class SumofDigitString {
    public static int sumOfnumberInStr(String str) {
        int sum = 0;
        int currentnum = 0;

        boolean isInNumber = false;
        for (int i = 0; i < str.length(); i++) {
            char char1 = str.charAt(i);
            if (Character.isDigit(char1)) {
            currentnum = currentnum *10 + (char1 - '0');
            isInNumber = true;

            } else {
                if (isInNumber){
                    sum = sum + currentnum;
                    currentnum = 0;
                    isInNumber=false;
                }
            }
        }
        if (isInNumber){
            sum += currentnum;

        } return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfnumberInStr("1aks23"));
    }
}
