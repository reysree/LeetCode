class Solution {
    public int search(int[] nums, int target) {
        
        int left = 0;
        int right = nums.length-1;
        return binarySearch(nums,left,right,target);
    }

    public int binarySearch(int[] nums, int left, int right, int target){
        
        if(left<=right){
            int mid = (left+right)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] > target){
                return binarySearch(nums,left,mid-1,target);
            }else{
                return binarySearch(nums,mid+1,right,target);
            }
        }
        return -1;
        

    }
}