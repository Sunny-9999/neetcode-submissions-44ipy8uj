class Solution {
    public int maxArea(int[] height) {
    	int left = 0, right = height.length - 1;
    	int max = 0;
    	while (left < right) {
    		int height_left = height[left];
    		int height_right = height[right];

    		int area = Math.min(height_left, height_right) * (right - left);
    		if (max < area) max = area;
    		
    		if (height_left >= height_right) {
    			while (height[right] <= height_right && left < right) {
    				right--;
    			};
    		} 
    		if (height_left <= height_right) {
    			while (height[left] <= height_left && left < right) {
    				left++;
    			};
    		}     		
    	}
        return max;
    }
}