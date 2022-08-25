class Solution {
    public boolean canConstruct(String r, String m) {
        int[] rans=new int[26];
        int[] mag=new int[26];
        for(int i=0;i<r.length();i++){
            rans[r.charAt(i)-'a']++;
        }
        for(int i=0;i<m.length();i++){
            mag[m.charAt(i)-'a']++;
        }
        for(int j=0;j<r.length();j++){
            if(rans[r.charAt(j)-'a']>mag[r.charAt(j)-'a']){
                return false;
            }
        }
        return true;
    }
}