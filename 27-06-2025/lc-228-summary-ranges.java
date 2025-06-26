class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        int i=0;
        while(i<nums.length){
            int start=nums[i];
            while (i<nums.length-1 && nums[i]+1==nums[i+1]) i+=1;
            if(nums[i]!=start){
                ans.add(start+"->"+nums[i]);
            }
            else{
                ans.add(String.valueOf(start));
            }
            i+=1;
        }
        return ans;
        
    }
}
