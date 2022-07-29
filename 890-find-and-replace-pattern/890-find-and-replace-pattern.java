class Solution {
    public boolean isValid(String str,String pattern){
        HashMap<Character,Character> map=new HashMap<Character,Character>();
        HashMap<Character,Character> ma=new HashMap<Character,Character>();
        for(int i=0;i<str.length();i++){
            
            if(map.containsKey(str.charAt(i))){
                
                    if(map.get(str.charAt(i))==pattern.charAt(i)){
                        continue;
                    }

                    else{ 
                        return false;
                    }
            }
            else{
                map.put(str.charAt(i),pattern.charAt(i));
            }
    }
               for(int j=0;j<str.length();j++){
                   if(ma.containsKey(pattern.charAt(j))){
                       if(ma.get(pattern.charAt(j))==str.charAt(j)){
                           continue;
                       }else{
                           return false;
                       }
                   }else{
                       ma.put(pattern.charAt(j),str.charAt(j));
                   }
               }
               return true;
               
    }
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> li=new ArrayList<String>();
        for(int i=0;i<words.length;i++){
            String str=words[i];
            if(str.length()!=pattern.length()){
                continue;
            }else {
                if(isValid(str,pattern)){
                    li.add(str);
                }
            }
        }
        return li;
    }
}