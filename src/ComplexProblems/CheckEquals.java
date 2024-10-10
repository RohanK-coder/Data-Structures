package ComplexProblems;

import java.util.Arrays;
class CheckEquals {
    public static void main(String[] args){
        System.out.println(check(new int[]{6,1,8,2,9}));
        System.out.println(Arrays.equals(new int[]{1,3,4,5},new int[]{1,5,7,8}));
    }
    public static boolean check(int[] nums)
    {
        int[] temp = new int[nums.length];
        for(int i=0;i<nums.length;i++){
          temp[i] = nums[i];
        }
        Arrays.sort(nums);
        return Arrays.equals(temp,nums);
    }

}
