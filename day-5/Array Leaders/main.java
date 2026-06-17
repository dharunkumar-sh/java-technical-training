import java.util.ArrayList;
import java.util.Collections;

class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        int arrLength = arr.length, i;
        ArrayList<Integer> l1 = new ArrayList<>();
        int prev = arr[arrLength - 1];
        l1.add(prev);
        for (i = arrLength - 2; i >= 0; i--) {
            if (arr[i] >= prev) {
                l1.add(arr[i]);
                prev = arr[i];
            }
        }
        Collections.reverse(l1);
        return l1;
    }
}