class Solution {
    public int maxArea(int[] height) {
        if(height==null){
            return 0;
        }
        int res = 0;
        int left =0;
        int right = height.length-1;
        while (left < right){
            int area = Math.min(height[left],height[right])*(right-left);
            res = Math.max(res,area);
            if(height[left]<=height[right]){
                left++;
            } else {
                right--;
            }
        }
        return res;

    }
}