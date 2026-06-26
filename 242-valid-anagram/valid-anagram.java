class Solution {
    public boolean isAnagram(String s, String t) {

        if(t.length() != s.length()){
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                int val = map.get(s.charAt(i)) + 1;
                map.put(s.charAt(i), val);
            }else{
                map.put(s.charAt(i), 1);
            }
        }
        for(int i = 0; i < t.length(); i++){
            if(map.containsKey(t.charAt(i))){
                int val = map.get(t.charAt(i)) - 1;
                map.put(t.charAt(i), val);
            }else{
                return false;
            }
        }
        for(int i = 0; i < map.size(); i++){
            if(map.get(s.charAt(i)) != 0){
                return false;
            }
        }
        return true;
    }
}