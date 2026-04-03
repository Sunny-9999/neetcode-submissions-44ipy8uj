class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> uniqSet=new HashSet<>();
        int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        for(int num:nums){
            max=Math.max(max,num);
            min=Math.min(min,num);
            uniqSet.add(num);
        }

      //  System.out.println(min+" "+max);

        int maxLen=0,currCount=0;

        while(min<=max){
           // System.out.println(min+" :min");
            if(uniqSet.contains(min)){
                currCount++;
            }
            else{
                maxLen=Math.max(currCount,maxLen);
                currCount=0;
            }
            min++;
        }

        return Math.max(maxLen,currCount);
    }
}
