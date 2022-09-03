class Solution {
    public void dfs(int n, int i, int k,List<Integer> ans){
        if(n==0){
            ans.add(i);
            return;
         }
        int y=i%10;
        if(y+k<10){
            dfs(n-1,i*10+y+k,k,ans);
        }
        if(k>0 && y-k>=0){
            dfs(n-1,i*10+y-k,k,ans);
        }
    }
    public int[] numsSameConsecDiff(int n, int k) {
        if(n==1){
            return new int[] {0,1,2,3,4,5,6,7,8,9};
        }
        List<Integer> ans=new ArrayList<Integer>();
        for(int i=1;i<10;i++){
            dfs(n-1,i,k,ans);
        }
    return ans.stream().mapToInt(j->j).toArray();

    }
    
    }