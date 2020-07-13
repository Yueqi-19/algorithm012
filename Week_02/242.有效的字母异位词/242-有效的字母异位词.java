//数组法
// class Solution {
//     public boolean isAnagram(String s, String t) {
//         if(s.length()!= t.length()){
//             return false;
//         }
//         char[] str1 = s.toCharArray();
//         char[] str2 = t.toCharArray();
//         Arrays.sort(str1);
//         Arrays.sort(str2);
//         return Arrays.equals(str1, str2);
//     }
// }

//哈希表法 复杂度有点高 不推荐 
// class Solution{
//     public boolean isAnagram(String s, String t) {
//         if (s.length() != t.length()) {
//             return false;
//         }
//         int[] counter = new int[26];
//         for (int i = 0; i < s.length(); i++) {
//             counter[s.charAt(i) - 'a']++;
//             counter[t.charAt(i) - 'a']--;
//         }
//         for (int count : counter) {
//             if (count != 0) {
//                 return false;
//             }
//         }
//         return true;
//     }
// }


//hash map
// class Solution {
//     public boolean isAnagram(String s, String t) {
//         Map<Character,Integer> map = new HashMap<>();
//         if(s.length() != t.length()){
//             return false;
//         }else{
//             for(int i = 0;i < s.length();i++){
//                 if(map.get(s.charAt(i)) == null){
//                     map.put(s.charAt(i),1);
//                 }else{
//                     int temp = map.get(s.charAt(i)) + 1;
//                     map.put(s.charAt(i),temp);
//                 }
//             }
//             for(int j = 0;j < t.length();j++){
//                 if(map.get(t.charAt(j)) == null){
//                     return false;
//                 }else{
//                     int temp = map.get(t.charAt(j)) - 1;
//                     map.put(t.charAt(j),temp);
//                 }
//             }
//             for (Integer v : map.values()) {
//                 if(v != 0){
//                     return false;
//                 }
//         }
//         return true;
//     }
// }
// }
class Solution {
    public boolean isAnagram(String s, String t) {
        int arr[] = new int[26];
        for(char c : s.toCharArray())
            arr[c-'a']++;
        for(char c : t.toCharArray()){
            if(arr[c-'a'] == 0)
                return false;
            arr[c-'a']--;
        }
        for(int i=0;i<26;i++)
            if(arr[i]>0)
                return false;
        
        return true;
    }
}
