class Solution {
    public int search(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        while(low<high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]>target){
                if(nums[mid]<nums[low]){
                    high=mid-1;
                }
                else if(nums[low]>target){
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }else{
                if(nums[mid]>nums[high]){
                    low=mid+1;
                }
                else if(nums[high]<target){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }
        }
        if(nums[low]==target){
            return low;
        }
       else return -1;
        
    }
}