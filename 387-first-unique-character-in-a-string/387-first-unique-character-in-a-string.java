class Solution {
    public int firstUniqChar(String s) {
        int[] map=new int[26];
       for(int i=0;i<s.length();i++){
           map[s.charAt(i)-'a']++;
       }
        for(int j=0;j<s.length();j++){
            if(map[s.charAt(j)-'a']==1){
                return j;
            }
        }
        return -1;
    }
}