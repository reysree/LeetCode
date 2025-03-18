class Solution {
    public long repairCars(int[] ranks, int cars) {
        
        long max_rank = 0;
        //long min_time = Long.MAX_VALUE;
        for(int i : ranks){
            max_rank = Math.max(max_rank,i);
        }
        long l=1;
        long r=max_rank*cars*cars;
        while(l<=r){
            long mid = l+(r-l)/2;
            long sum = 0;
            for(int i : ranks){
                sum += (long)Math.sqrt(mid/i);
                //System.out.println("The mid value we reached is  : "+mid);
                //System.out.println("The count of cars repaired for rank :"+i+" is: "+((long)Math.floor(Math.sqrt(mid/i))));
            }
            if(sum >= cars){
                //min_time = Math.min(min_time,mid);
                r = mid-1;
            }else{
                l = mid+1;
            }
        }  
        return l;  
    }
}