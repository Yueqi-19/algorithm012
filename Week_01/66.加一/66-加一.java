class Solution {
    public int[] plusOne(int[] digits) {
        //1、非空判断
        if(digits == null || digits.length <= 0){
            return digits;
        }
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i] != 9){
                //2、此时只需要加一就是我们需要的最终结果，直接return
                digits[i]++;
                return digits;
            }else{
                //3、走到这里说明此时第i个元素是9，那么按照进位加一则为0，进行下一轮的判断
                digits[i] = 0;
            }
        }
        //4、如果走到这里，说明digits里面所有元素都是9，则新建数组
        int[] res = new int[digits.length + 1];
        res[0] = 1;
        return res;
        

    }
}