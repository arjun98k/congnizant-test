package Easy;

import java.util.HashSet;

public class FindSubArray {
       public static boolean subarry(int a[], int b[]) {
           HashSet<Integer> hashset = new HashSet<>();
           for (int i : a) {
               hashset.add(i);
           }

           for (int j : b) {
               if (!hashset.contains(j)) {
                   return false;
               }
           }
           return  true;
       }

    public static void main(String[] args) {
           int a[] = {2,4,5,6,1,3};
           int b[] = {2,5,6,1,11};

        System.out.println(subarry(a,b));
    }
}
