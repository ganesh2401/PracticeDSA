class Solution {
    public int removeElement(int[] nums, int val) {
        int counter = 0;
        for(int n:nums){
            if(val!=n){
                nums[counter] = n;
                counter++;
            }
        }
        return counter;
    }
}
