import java.util.HashMap;

class LongestKSub {
    public int longestKSubstr(String s, int k) {
        int max = -1;
        HashMap<Character,Integer> map = new HashMap<>();
        int i =0,j=0;
        while(j<s.length()){
            char ch = s.charAt(j);
            map.put(ch,map.getOrDefault(ch, 0) + 1);
            if(map.size() < k) j++;
            else if(map.size() ==k){
                max = Math.max(max,j-i+1);
                j++;
            }
            else if(map.size() > k){
                while(map.size() > k){
                    char left = s.charAt(i);
                    map.put(left,map.get(left)-1);
                    if(map.get(left)==0){
                        map.remove(left);
                    }
                    i++;
                }
                j++;
            }
        }
        return max;
    }
}