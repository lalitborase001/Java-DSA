class Solution {
    public int myAtoi(String s) {
        String result = s.trim();
        if(result.length() == 0) return 0;
        int i = 0, sign = 1, num = 0;
        if(result.charAt(i) == '-'){
            sign = -1;
            i++;
        } else if(result.charAt(i) == '+'){
            i++;
        }
        for(; i < result.length(); i++){
            char ch = result.charAt(i);
            if(Character.isDigit(ch)){
                int digit = ch - '0';
                if(num > (Integer.MAX_VALUE - digit) / 10){
                    return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
                num = num * 10 + digit;
            }
            else break;
        }
        return sign * num;
    }
}