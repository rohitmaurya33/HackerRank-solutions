
    static boolean isAnagram(String a, String b) {
         a=a.toLowerCase();
         b=b.toLowerCase();
         if(a.length()!=b.length()){
            return false;
         }
         
         char[] arr1=a.toCharArray();
         char[] arr2=b.toCharArray();
         
         
          for(int i=0;i<arr1.length;i++){
            for(int j=i+1;j<arr1.length;j++){
                if(arr1[i]>arr1[j]){
                    char temp=arr1[i];
                    arr1[i]=arr1[j];
                    arr1[j]=temp;
                }
                
                 if(arr2[i]>arr2[j]){
                    char temp=arr2[i];
                    arr2[i]=arr2[j];
                    arr2[j]=temp;
                }
            }
          }
            for (int i = 0; i < arr1.length; i++) {
        if (arr1[i] != arr2[i]) {
            return false;
        }
    }

    return true;
          
            }

