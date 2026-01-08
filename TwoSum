class Solution {
    public int[] twoSum(int[] nums, int target) {
       int n= nums.length;
       HashMap<Integer,Integer> resultMap = new HashMap();
        for(int i=0;i<n;i++){
            int secondValue = target-nums[i];
            if(resultMap.containsKey(secondValue)){
                return new int[]{
                    resultMap.get(secondValue),i
                };
            }
            resultMap.put(nums[i],i);
        }

        return new int[] {};
        
    }
}
