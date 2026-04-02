class Solution {
    public int[] productExceptSelf(int[] nums) {
        int length=nums.length;
        int[] leftProduct=new int[length+1];
        int[] rightProduct=new int[length+1];

        leftProduct[0]=1;
        rightProduct[length]=1;

        for(int i=0;i<length;i++){
            leftProduct[i+1]=leftProduct[i]*nums[i];
        }

        for(int i=length-1;i>=0;i--){
            rightProduct[i]=rightProduct[i+1]*nums[i];
        }

        int[] result=new int[length];

        for(int i=0;i<length;i++){
            result[i]=leftProduct[i]* rightProduct[i+1];
        }

        return result;
    }
}  
