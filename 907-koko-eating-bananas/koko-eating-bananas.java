class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        

        int max_bananas = 0;
        int min_k = Integer.MAX_VALUE;
        for(int i: piles){
            max_bananas = Math.max(max_bananas,i);
        }

        int l = 1;
        int r = max_bananas;
        while(l<=r){
            int mid = (l+r)/2;
            long sum = 0;
            for(int i : piles){
                sum += Math.ceil((double)i/mid);
            }
            if(sum <= h){
                min_k = mid;
                r = mid-1;
            }else{
                l = mid+1;
            }
        }
        return min_k;
    }
}