class Solution {
    public int maxProduct(int[] nums) {
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int product=1;
            for(int j=i;j<nums.length;j++){
                product=product*nums[j];
                 int previousproduct=product;
                largest =Math.max(product,largest);          
            }
              
        }
        return largest;
    }
}