package debug.demo;

public class RotateArray {
    //代码部分
    class Solution {
        public void rotate(int[] nums, int k) {
            if(nums ==null ||nums.length==0){
                return ;
            }
            k %=nums.length;
            reverse(nums,0,nums.length-1);
            reverse(nums,0,k-1);
            reverse(nums,k,nums.length-1);
        }
        public void reverse(int [] nums,int start, int end){
            while (start <end){
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                ++start ;
                --end;
            }
        }
    }
}

