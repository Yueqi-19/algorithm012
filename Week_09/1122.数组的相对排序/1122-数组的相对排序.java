class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2){
        int[] nums = new int[1001];
        int[] ans = new int[arr1.length];

        for(int num : arr1) 
            nums[num]++;

        int index = 0;
        for(int i : arr2){
            while(nums[i]-- > 0)
                ans[index++] = i;
        }

        for(int i = 0; i < nums.length; i++){
            while(nums[i]-- > 0)
                ans[index++] = i;
        }
        return ans;
    }
}
