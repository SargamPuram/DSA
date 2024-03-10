package sargam;

public class Assign3 {
    public static void main(String[] args) {
        int[] nums ={2,5,9,15};
        System.out.println(buildArray(nums));
    }

    public static int[] buildArray(int[] nums) {
        int[] arr = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            arr[i]=nums[nums[i]];
        }
        return arr;
    }
}
