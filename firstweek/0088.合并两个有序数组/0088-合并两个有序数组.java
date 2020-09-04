// class Solution {
//     public void merge(int[] nums1, int m, int[] nums2, int n) {
//         int[] result = new int[m];
//         for(int i =0; i<m;i++){
//             result[i]=nums1[i];
//         }
//         int i=0,j=0,k=0;
//         while(i < m && j < n){
//             if(nums1[i] <= nums2[j]){
//                 result[k]=nums1[i];
//                 i++;
//             } else {
//                 result[k] = nums2[j];
//                 j++;
//             }
//             k++; 
//         }
//         while(i<m){
//             result[k]=nums1[i];
//             i++;
//             k++;
//         }
//         while(j<n){
//             result[k]=nums2[j];
//             j++;
//             k++;
//         }
       
//     }
// }
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int []temp_nums1 = new int[m];
        for(int i =0;i<m;i++){
            temp_nums1[i]=nums1[i];
        }
        int i=0,j=0,k=0;
        while(i<m && j<n){
            if(temp_nums1[i]<=nums2[j]){
                nums1[k]=temp_nums1[i];
                i++;
            }else{
                nums1[k]=nums2[j];
                j++;
            }
            k++;
        }
        while(i<m){
            nums1[k] = temp_nums1[i];
            i++;
            k++;
        }
        while(j<n){
            nums1[k] = nums2[j];
            j++;
            k++;
        }
    }
}