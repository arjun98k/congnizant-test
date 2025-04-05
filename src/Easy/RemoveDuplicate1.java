package Easy;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate1 {
    public static void main(String[] args) {
        int arr[] = {11,2,3,4,3,5,44,55};
        HashSet<Integer>set = new HashSet<>();
        for (int i: arr){
            set.add(i);
        }
        for (int i: set){
            System.out.print(i + " ");
        }
    }
}
