class Solution {
    public int edgeScore(int[] edges) {
        int n=edges.length;
        long[] res=new long[n];
        for(int i=0;i<n;i++){
            res[edges[i]]+=i;
        }
        long  max=0;
        int ans=-1;
        for(int i=0;i<n;i++){
            if(res[i]>max){
                max=res[i];
                ans=i;
                
            }
        }
        return ans;
    }
}