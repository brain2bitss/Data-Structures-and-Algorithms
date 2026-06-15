class Solution {
    public boolean backspaceCompare(String s, String t) {
        String first = "";
        String second = "";
        int count = 0;
        for(int i = s.length() - 1; i >= 0; i--){
            if(s.charAt(i) == '#'){
                count++;
            }else if(count != 0){
                count--;
                continue;
            }else if(count == 0){
                first = first + s.charAt(i);
            }
        }
        count = 0;
        for(int i = t.length() - 1; i >= 0; i--){
            if(t.charAt(i) == '#'){
                count++;
            }else if(count != 0){
                count--;
                continue;
            }else{
                second = second + t.charAt(i);
            }
        }
        if(first.length() != second.length()){
            return false;
        }
        for(int i = 0; i < first.length(); i++){
            if(first.charAt(i) != second.charAt(i)){
                return false;
            }
        }
        return true;
    }
}