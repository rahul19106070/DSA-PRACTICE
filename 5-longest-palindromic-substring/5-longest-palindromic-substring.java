class Solution {
    public static String foreven(String s){
        String ans="";
        int  start=0;
        int end=0;
        int len=0;
        for(int i=0;i<s.length()-1;i++){
            int x=i;
            int y=i+1;
            if(s.charAt(x)==s.charAt(y)){
                x--;
                y++;
             while(x>=0 && y<s.length()){
                    if(s.charAt(x)==s.charAt(y)){
                        x--;
                        y++;
                        continue;
                    }else{
                        break;
                    }
             }
                x++;
                y--;
                // System.out.println(x+" "+y);
                // System.out.println("-->"+len);
                if((y-x+1)>len){
                    len=y-x+1;
                    // System.out.println("--+"+len);
                    start=x;
                    end=y;
                }
            }
             
        }
           
            
            
            for(int i=start;i<=end;i++){
                ans+=s.charAt(i);
            }
           System.out.print(ans);
            return ans;
        }
    
    public static String forold(String s){
        String ans="";
        int start=0;
        int end=0;
        int len=0;
        for(int i=0;i<s.length()-2;i++){
            int x=i;
            int y=i+2;
            if(s.charAt(x)==s.charAt(y)){
                x--;
                y++;
             while(x>=0 && y<s.length()){
                    if(s.charAt(x)==s.charAt(y)){
                        x--;
                        y++;
                        continue;
                    }else{
                        break;
                    }
             }
                x++;
                y--;
                if((y-x+1)>len){
                    len=y-x+1;
                    start=x;
                    end=y;
                }
            }}
            
            
            
            for(int i=start;i<=end;i++){
                ans+=s.charAt(i);
            }
            return ans;
        }
    
    
    public String longestPalindrome(String s) {
        
      int n=s.length();
      String x=foreven(s);
      String y=forold(s);
      if(x.length()>=y.length()){
          return x;
      }else{
          return y;
      }
    }
}