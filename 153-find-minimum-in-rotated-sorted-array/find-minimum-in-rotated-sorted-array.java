class Solution {
    public int findMin(int[] nums) {
        

        int min = Integer.MAX_VALUE;

        int l = 0;
        int r = nums.length-1;

        while(l<=r){
            int mid = (l+r)/2;
            min = Math.min(min,nums[mid]);
            if(nums[l] < nums[mid] && nums[mid] < nums[r]){
                r= mid-1;
            }else if (nums[l] < nums[mid] && nums[mid] > nums[r]){
                l = mid+1;
            }else if(nums[l] > nums[mid] && nums[mid] < nums[r]){
                r = mid-1;
            }else{
                l = mid+1;
            }
        }
        return min;
    }
}
