class Solution {
    public int repeatedNTimes(int[] nums) {
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int num : nums){
            if (hm.containsKey(num)){
                return num;
            }hm.put(num, 1);
        }
        return -1;
    }
}