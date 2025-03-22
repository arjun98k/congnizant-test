package Easy;

public class MissNumber {
    public static int missnum(int[] num) {
        int n = num.length + 1;
        for (int i = 1; i <= n; i++) {
            boolean found = false;
            for (int j = 0; j < num.length; j++) {
                if (num[j] == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int arr[] = {0,2,3,4,6,7};
        System.out.println(missnum(arr));

        }
    }

