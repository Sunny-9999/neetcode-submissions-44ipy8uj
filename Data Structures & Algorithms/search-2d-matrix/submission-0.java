class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length,n=matrix[0].length;
        int start=0, end=m*n-1;
        

        while(start<=end){
            int mid=(start+end+1)/2;
            int i=mid/n,j=mid%n;

            if(matrix[i][j]<target){
                start=mid+1;
            }else if(matrix[i][j]>target){
                end=mid-1;
            }else{
                return true;
            }
        }

        return false;
    }
}