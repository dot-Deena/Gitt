class Solution {
    public int findMaxLength(int[] nums) {
        
        HashMap<Integer, Integer> distinct = new HashMap<>();
        int sum = 0;
        int longest = 0;
        
        for(int i=0; i<nums.length; i++){
            // treat 0 as -1 and add to cumsum
            sum += (nums[i] == 0? -1:1);
            
            if(sum==0){ // if sum=0 take all subarray from start to i
                longest = i+1;
            }else if(distinct.containsKey(sum)){ // if not and its in hash
                longest = Math.max(longest, i-distinct.get(sum));
            }else{ // if not 0 and not in hash
                distinct.put(sum,i);
            }
        }
        return longest;
    }
}