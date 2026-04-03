class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> uniqSet=new HashSet<>();
        int maxLen=0;
        for(int num:nums){
            uniqSet.add(num);
        }

        for(int num:nums){
            if(!uniqSet.contains(num-1)){
                int length=0;
                int val=num;
                while(uniqSet.contains(val)){
                    length++;
                    val++;
                }

                maxLen=Math.max(length,maxLen);
            }
        }
        return maxLen;
    }
}
