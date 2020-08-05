class Solution {
    public int[] sortArray(int[] array) {
        if(array==null||array.length <=1){
            return array;
        }
        int[] helper = new int[array.length];
        helper(array,helper,0,array.length-1);
        return array;
    }
    private void helper(int[] array,int[] helper, int left, int right){
        if(left == right){
            return;
        }
        int mid = left +(right-left)/2;
        helper(array,helper,left,mid);
        helper(array,helper,mid+1,right);
        merge(array,helper,left,mid,right);
    }
    private void merge(int[] array,int[] helper,int left,int mid,int right){
        for (int i = left; i<= right;i++){
            helper[i]=array[i];
        }
        int leftPointer = left;
        int rightPointer = mid+1;
        while (leftPointer <=mid && rightPointer <= right){
            if(helper[leftPointer]<helper[rightPointer]){
                array[left++] = helper[leftPointer++];
            } else {
                array[left++] = helper[rightPointer++];
            }
        }
        while(leftPointer <= mid){
            array[left++] = helper[leftPointer++];
        }
    }
}