class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder str = new StringBuilder();
		int result = columnNumber;
		int index = 0;
		int ascii = -5;
		while(result != 0){
            result--;
    		index = result%26;
    		ascii = 65 + index;
    		str.append((char)(ascii));
    		result = result/26;
		}
		return str.reverse().toString();
    }
}