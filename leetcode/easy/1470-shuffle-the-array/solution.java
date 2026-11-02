class Solution {
    public int[] shuffle(int[] nums, int n) {
       int k=n;
        int [] x=  new int[n];
        int [] y= new int[n];

        for(int i=0;i<n;i++){
            x[i]=  nums[i];
       
             y[i]=nums[n+i];
            
            }
            
        int [] result=  new int [2*n];

        for(int i=0;i<n;i++){
               result[2*i]=x[i];
               result[2*i+1]=y[i];

         }
            
            return result;
        
       
    }
}