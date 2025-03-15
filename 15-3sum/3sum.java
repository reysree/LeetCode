class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        ArrayList<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            //check for duplicates
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            for(int j = i+1,k=nums.length-1;j<k;){
                int target = nums[i]+nums[j]+nums[k];
                if(target == 0){
                    res.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    //Skip the duplicates if the next j elements are same
                    while(j<k && nums[j] == nums[j+1]){
                        j++;
                    }
                    //Skip the duplicates if the prev k elements are same;
                    while(j<k && nums[k] == nums[k-1]){
                        k--;
                    }
                    j++;
                    k--;
                }else if(target < 0){
                    j++;
                }else{
                    k--;
                }
            }
        }
        return res;
    }
}