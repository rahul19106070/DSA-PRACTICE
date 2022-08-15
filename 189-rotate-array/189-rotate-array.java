class Solution {
    public void reverse(int[] nums,int i,int j){
        // int i=0;
        // int j=nums.length;
        if(i==j){
            return;
        }
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }
    public void rotate(int[] nums, int k) {
        
        
        int l=nums.length-1;
        k=k%(l+1);
        reverse(nums,0,l);
        reverse(nums,0,k-1);
        reverse(nums,k,l);
        
    }
}