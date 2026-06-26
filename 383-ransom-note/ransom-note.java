class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < magazine.length(); i++){
            if(map.containsKey(magazine.charAt(i))){
                int val = map.get(magazine.charAt(i)) + 1;
                map.put(magazine.charAt(i), val);
            }else{
                map.put(magazine.charAt(i), 1);
            }
        }

        for(int i = 0; i < ransomNote.length(); i++){
            if(!map.containsKey(ransomNote.charAt(i))){
                return false;
            }else{
                int val = map.get(ransomNote.charAt(i)) - 1;
                if(val < 0) return false;
                map.put(ransomNote.charAt(i), val);
            }
        }
        return true;
    }
}