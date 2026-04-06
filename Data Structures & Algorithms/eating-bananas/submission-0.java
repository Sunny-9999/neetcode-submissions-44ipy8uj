class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int min=1,max=0,lastMin=0;;

        for(int pile:piles){
            max=Math.max(pile,max);
        }

        while(min<=max){
            int mid=(min+max)/2;

            int val=isCompletinginFrame(piles,h,mid);
            if(val<=0){
                lastMin=mid;
                max=mid-1;
            }else{
                min=mid+1;
            }
        }

        return lastMin;
    }

    private int isCompletinginFrame(int[] piles,int k,int mid){
        int count=0;

        for(int pile:piles){
            count=count+(pile/mid)+(pile%mid==0?0:1);
        }

        return count-k;
    }


}