class Solution {
    public int maxArea(int[] heights) {
        int maxWat=0,start=0, end=heights.length-1;

       while(start<end){
        int water=Math.min(heights[start],heights[end])*(end-start);
        // System.out.println(water+" "+heights[start]+" "+heights[end]);
        // System.out.println("Start/end"+" "+start+" "+end);
        maxWat=Math.max(maxWat,water);

        if(heights[start]<heights[end]) start++;
        else if(heights[start]>heights[end]) end--;
        else {
            start++;
            end--;
        }
       }

       return maxWat;
    }
}
