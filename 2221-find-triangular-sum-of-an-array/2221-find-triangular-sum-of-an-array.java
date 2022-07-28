class Solution {
    public int triangularSum(int[] nums) {
        int x=1;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length-x;j++){
                // System.out.println(j);
                nums[j]=(nums[j]+nums[j+1])%10;
            }
            x++;
        }return nums[0];
    }
}