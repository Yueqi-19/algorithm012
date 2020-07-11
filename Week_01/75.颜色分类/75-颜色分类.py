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
        #��֤left���涼��0��right���涼��2
        while k<=right: #right�ұߵ����Ѿ��������
            if nums[k]==1: #�����1�������в��ģ�����Ҫ����k+1��������һ��
                k+=1
            elif nums[k]==0: #�����0��������ߣ�left+1֤����ߵĶ������ˣ�k+1��������һ��
                nums[left],nums[k]=nums[k],nums[left]
                left+=1
                k+=1
            else: #�����2�������ұߣ�right-1֤���ұߵĶ������ˣ����ǲ�ȷ���������λ�õ����Ĵ�С������Ҫ���Ÿ�λ�õ�
                nums[right],nums[k]=nums[k],nums[right]
                right-=1