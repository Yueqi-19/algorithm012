class Solution {
    public int[] plusOne(int[] digits) {
        //1���ǿ��ж�
        if(digits == null || digits.length <= 0){
            return digits;
        }
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i] != 9){
                //2����ʱֻ��Ҫ��һ����������Ҫ�����ս����ֱ��return
                digits[i]++;
                return digits;
            }else{
                //3���ߵ�����˵����ʱ��i��Ԫ����9����ô���ս�λ��һ��Ϊ0��������һ�ֵ��ж�
                digits[i] = 0;
            }
        }
        //4������ߵ����˵��digits��������Ԫ�ض���9�����½�����
        int[] res = new int[digits.length + 1];
        res[0] = 1;
        return res;
        

    }
}