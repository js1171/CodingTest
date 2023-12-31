import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(long n) {
        List<Integer> list = new ArrayList<Integer>();
 
        while(n>0) {
            list.add((int)(n%10));
            n /= 10;
        }

        return list.stream().mapToInt(i -> i).toArray();
    }
}