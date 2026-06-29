class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for(int i = 0; i < patterns.length; i++){
            int val = word.indexOf(patterns[i]);
            if(val != -1){
                count++;
            }
        }
    return count;
    }
}