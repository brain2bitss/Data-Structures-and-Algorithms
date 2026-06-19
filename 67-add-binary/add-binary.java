class Solution {
    public String addBinary(String a, String b) {
        int last1 = a.length() - 1;
        int last2 = b.length() - 1;

        int carry = 0;

        StringBuilder result = new StringBuilder();

        while(last1 >= 0 || last2 >= 0 || carry == 1){
            if(last1 >= 0){
                carry+= a.charAt(last1) - '0';
                last1--;
            }
            if(last2 >= 0){
                carry+= b.charAt(last2) - '0';
                last2--;
            }
            result.append(carry%2);
            carry = carry/2;
        }
        return result.reverse().toString();
    }
}