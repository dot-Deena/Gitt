class Solution {
    public int findMaxLength(int[] nums) {
        
        HashMap<Integer, Integer> distinct = new HashMap<>();
        int sum = 0;
        int longest = 0;
        
        for(int i=0; i<nums.length; i++){
            
            sum += (nums[i] == 0? -1:1);
            
            if(sum==0){
                longest = i+1;
            }else if(distinct.containsKey(sum)){
                longest = Math.max(longest, i-distinct.get(sum));
            }else{
                distinct.put(sum,i);
            }
        }
        return longest;
    }
}