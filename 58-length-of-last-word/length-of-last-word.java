class Solution {
    public int lengthOfLastWord(String s) {
       int lst = s.length() - 1;
       int len = s.length() - 1;
		while(s.charAt(lst) == ' '){
		    lst--;
		}
		int count = 0;
		while(lst >= 0 && s.charAt(lst) != ' '){
		    count++;
		    lst--;
		}
        return count;
    }
}