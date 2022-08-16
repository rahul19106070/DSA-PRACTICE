class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
     
        if(k<=1) return 0;
        int prod=1;
        int left=0;
        int ans=0;
        for(int right=0;right<nums.length;right++){
            prod*=nums[right];
            while(prod>=k){
                System.out.println(prod);
                prod/=nums[left];
                left++;
            }
            ans+=right-left+1;
        }
        return ans;
    }
}