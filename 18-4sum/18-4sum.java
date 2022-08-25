class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
         List<List<Integer>> res=new ArrayList<List<Integer>>();
        for(int i=0;i<nums.length-3;i++){
            for(int j=i+1;j<nums.length-2;j++){
                long x=nums[i]+nums[j];
                long ans=(long)target-x;
                int k=j+1;
                int l=nums.length-1;
                while(k<l)
                {
                     if((nums[k]+nums[l])==ans){
                         List<Integer> li=new ArrayList<Integer>();
                         li.add(nums[i]);
                         li.add(nums[j]);
                         li.add(nums[k]);
                         li.add(nums[l]);
                         res.add(li);
                         while(k<l && nums[k]==nums[k+1]) k++;
                        while(k<l && nums[l]==nums[l-1]) l--;
                         k++;
                         l--;
                    }
                    else if((nums[k]+nums[l])>ans)
                        l--;
                    else
                        k++;
                    
                    
                }
                while(j<nums.length-2 && nums[j]==nums[j+1]) j++;
            }
            while(i<nums.length-3 && nums[i]==nums[i+1]) i++;
        }
        return res;
    }
}