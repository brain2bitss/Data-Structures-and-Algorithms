class Solution {
    public int addDigits(int num) {
        if(num == 0){return num;}

        String str = String.valueOf(num);
        int result = 0;
        for(int i = 0; i < str.length(); i++){
            int a = num % 10;
            result = result + a;
            num = num/10;
        }
        if(String.valueOf(result).length() == 1){
            return result;
        }else{
            return addDigits(result);
        }
    }
}