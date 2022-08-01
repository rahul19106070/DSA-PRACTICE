class Solution {
    // int count=0;
    public int countPath(int start, int end,int m,int n,int[][] dp){
        if(start==m-1 && end==n-1){
           return 1;
        }
        // System.out.println(start);
        // System.out.println("---"+end);
          if(start>m-1 || end>n-1){
               return 0;
           }
        if(dp[start][end]!=0) return dp[start][end];
        
//         if(start==m-1) {
//             countPath(start,end+1,m,n);
//             return;
            
//         }
//         if(end==n-1){
//             countPath(start+1,end,m,n);
//             return;
//         }
//         countPath(start+1,end,m,n);
//         countPath(start,end+1,m,n);
         
        return dp[start][end]=countPath(start+1,end,m,n,dp)+countPath(start,end+1,m,n,dp);
    }
    public int uniquePaths(int m, int n) {
        
        // ArrayList<ArrayList<Integer>> arr=new ArrayList<ArrayList<Integer>>();
        int[][] dp=new int[m][n];
         return countPath(0,0,m,n,dp);
        
    }
}