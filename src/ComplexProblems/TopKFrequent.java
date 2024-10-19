package ComplexProblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class TopKFrequent {
    public static void main(String[] args) {
        topKFrequent(new int[]{1,1,1,2,2,3},2);
    }
    public static int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for(int num:nums) {
            if (!map.containsKey(num)) {
                map.put(num, new ArrayList<>());
            }
            map.get(num).add(num);
        }
        System.out.println(map);

        return null;
    }
}
