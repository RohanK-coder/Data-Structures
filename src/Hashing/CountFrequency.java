package Hashing;

import java.util.HashMap;

public class CountFrequency {
    public static void main(String[] args) {
        int[] arr = new int[]{10,3,5,10,4,3,10};
        int arrayLength = arr.length;
        HashMap<Integer,Integer> m = countFrequency(arr,arrayLength);
        System.out.println(m);
        System.out.print("The largest frequency is : "+highestFrequency(m));
    }

    public static HashMap<Integer,Integer> countFrequency(int[] arr,int n){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        return map;
    }
    //finding the highest frequency
    public static int highestFrequency(HashMap<Integer,Integer> m){
        int largest = 0;
        for(int i : m.values()){
            if(i>largest){
                largest = i;
            }
        }
        return largest;
    }
}
