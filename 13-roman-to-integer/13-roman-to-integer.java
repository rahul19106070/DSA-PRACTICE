class Solution {
    public int romanToInt(String s) {
        int ans=0;
        for(int i=0;i<s.length();i++){
        
            if(s.charAt(i)=='I' &&(i+1)<s.length()&& (s.charAt(i+1)=='V' || s.charAt(i+1)=='X')){
                if(s.charAt(i+1)=='V'){
                 ans+=4;
                }else{
                    ans+=9;
                }
                i++;
                continue;
            }
            else if(s.charAt(i)=='X' &&(i+1)<s.length()&& (s.charAt(i+1)=='L' || s.charAt(i+1)=='C')){
                if(s.charAt(i+1)=='L'){
                 ans+=40;
                }else{
                    ans+=90;
                }
                i++;
                continue;
            }
            
            else if(s.charAt(i)=='C' &&(i+1)<s.length()&& (s.charAt(i+1)=='D' || s.charAt(i+1)=='M')){
                if(s.charAt(i+1)=='D'){
                 ans+=400;
                }else{
                    ans+=900;
                }
                i++;
                continue;
            }
            else if(s.charAt(i)=='I'){
                            // System.out.print(i);

                ans+=1;
                continue;
            }else if(s.charAt(i)=='V'){
              ans+=5;
                continue;
  
            }else if(s.charAt(i)=='X'){
                ans+=10;
                continue;

            }else if(s.charAt(i)=='L'){
                ans+=50;
                continue;

            }else if(s.charAt(i)=='D'){
                ans+=500;
                continue;
            }else if(s.charAt(i)=='C')
            {
                ans+=100;
                continue;
            }else{
                ans+=1000;
                continue;
            }
        }
        return ans;
        
    }
}