class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 1;
 // default 1
        // then loop over each word in sentences array
        for(String s : sentences){
            int count = s.split(" ").length;
            // split each word and find length
            max = Math.max( max, count);

        }
        return max;
    }
}