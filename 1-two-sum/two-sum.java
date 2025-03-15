class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> hmap = new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            int y = target-nums[i];
            if(hmap.containsKey(y)){
                return new int[]{i,hmap.get(y)};
            }
            hmap.put(nums[i],i);
        }
        return new int[]{};
    }
}

//Psuedo Code
//1. Create a hashMap to store the key-value pairs where the key is the element and index is the index of it in array.
//2. iterate through the array and check the conditions :
        // - if the key  = (target-element) exists in the hashmap which means we are searching for y in x+y = target.
        // So if y is present in the hashmap when target-x is done then we have the element which is part of the sum.
        // else if it is not found then add the x with its index to the hashmap as it will be helpful for further iteration.