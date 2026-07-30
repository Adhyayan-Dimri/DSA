class Solution {
    public int searchInsert(int[] nums, int target) {
        int pos=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
            else if(nums[i]!=target && nums[i]>target){
                return i;
            }
            else if(target>nums[nums.length-1]){
                return nums.length;
            }
            
        }
        return pos;
    }
}