class Solution {
    public int peakValleyDifference(int[] nums) {
        int sumofpeak=0;
        int sumofvalley=0;
        for(int i=1;i<nums.length-1;i++){
            if(nums[i]>nums[i-1]&&nums[i]>nums[i+1]){
                int peak=nums[i];
                sumofpeak+=peak;

            }
            else if(nums[i] < nums[i - 1]&&nums[i] < nums[i + 1]){
                int valley=nums[i];
                sumofvalley+=valley;
            }
        }
        return sumofpeak-sumofvalley;

    }
}