class Solution {
    public int[] buildArray(int[] nums) {
        // Scanner sc = new Scanner(System.in);
        int[] arr = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            arr[i] = nums[nums[i]];
        }
        return arr;
        
    }
}