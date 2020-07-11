class Solution {
    public int maxSubArray(int[] nums) {
        return helper(nums,0,nums.length-1);
    }
    public int helper(int[] nums, int l , int r){
        if (l==r){
            return nums[l];
        }
        int mid = (l + r)/2;
        int resL = helper(nums,l,mid);
        int resR = helper(nums,mid+1, r);

        int maxSumL = nums[mid];
        int maxSumR = nums[mid+1];
        int sumL = 0;
        int sumR = 0;
        for (int i = mid ; i>=l;i--){
            sumL += nums[i];
            if (sumL > maxSumL){
                maxSumL = sumL;
            }
        }
        for (int j = mid +1 ; j <=r; j++){
            sumR += nums[j];
            if(sumR > maxSumR){
                maxSumR =sumR;
            }
        }
        int resM = maxSumL +maxSumR;
        return Math.max(resM,(resL>resR ? resL : resR));
    }
}