package ComplexProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroupAnagrams {
    public static void main(String[] args) {
        GroupAnagrams g = new GroupAnagrams();
        System.out.println(g.groupAnagram(new String[]{"eat","tea","tan","ate","nat","bat"}));

    }
    public List<List<String>> groupAnagram(String[] strs){
        List<List<String>> result = new ArrayList<>();
        if(strs == null || strs.length == 0) return result;
        for(int i = 0; i < strs.length; i++){
            ArrayList<String> temp = new ArrayList<>();
            for(int j = 0; j < strs.length; j++){
                char[] check1 = strs[i].toCharArray();
                char[] check2 = strs[j].toCharArray();
                System.out.println(check1);
                if(i==j) continue;


            }
        }
        return  result;
    }
}
