class Solution:
    def sortColors(self, nums: List[int]) -> None:
            Solution.QuickSort(nums, 0, (len(nums)-1))
    def sortColors(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        left=0
        right=len(nums)-1
        k=0
        #保证left左面都是0，right右面都是2
        while k<=right: #right右边的是已经排完的了
            if nums[k]==1: #如果是1，就是中部的，不需要动，k+1继续排下一个
                k+=1
            elif nums[k]==0: #如果是0，排在左边，left+1证明左边的都排完了，k+1接着排下一个
                nums[left],nums[k]=nums[k],nums[left]
                left+=1
                k+=1
            else: #如果是2，排在右边，right-1证明右边的都排完了，但是不确定调到这个位置的数的大小，所以要再排该位置的
                nums[right],nums[k]=nums[k],nums[right]
                right-=1