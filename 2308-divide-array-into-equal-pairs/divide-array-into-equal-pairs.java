class Solution {
    public boolean divideArray(int[] nums) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for(int i : nums){
            hmap.put(i,hmap.getOrDefault(i,0)+1);
        }
        Set<Integer> hs = hmap.keySet();
        for(Integer i : hs){
            if(hmap.get(i)%2 == 0){
                continue;
            }else{
                return false;
            }
        }
        return true;
    }
}