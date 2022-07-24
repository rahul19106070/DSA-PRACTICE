class Solution {
    public String longestCommonPrefix(String[] strs) {
        String temp="";
        int res=Integer.MAX_VALUE;
        if(strs.length==1){
            // for(int i=0;i<strs[0].length();i+++){
            //     if(str)
            // }
            return strs[0];
        }
        // int res=Integer.MIN_VALUE;
        for(int i=1;i<strs.length;i++){
            int ans=Integer.MIN_VALUE;
                  for(int j=0;j<strs[i].length()&&j<strs[i-1].length();j++){
                       
                       if(strs[i].charAt(j)==strs[i-1].charAt(j)){
                           ans=j;
                           // res=Math.max(ans,res);
                           continue;
                       }else{
                           break;
                       }    
                  }
            res=Math.min(ans,res);
            // System.out.println(res);
            if(res>=0){
                continue;
            }else{
                System.out.print(temp);
                return temp;
            }
        }
        for(int i=0;i<=res;i++){
            temp+=strs[0].charAt(i);
        }
        return temp;
    }
}