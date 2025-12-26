import java.util.ArrayList;
import java.util.List;

public class Phonepad {
    public static void main(String[] args) {
        System.out.println( padRet("","23"));
    }
    static void pad(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0) - '0';
        for (int i = (digit-2)*3; i < (digit-1) *3 ; i++) {
            char ch = (char)('a'+i);
            pad(p+ch,up.substring(1));
        }
    }
    static List<String> padRet(String p, String up){
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) - '0';
        ArrayList<String> ans = new ArrayList<>();
        for (int i = (digit-2)*3; i < (digit-1) *3 ; i++) {
            char ch = (char)('a'+i);
            ans.addAll(padRet(p+ch,up.substring(1)));
        }
        return ans;
    }
    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) return new ArrayList<>();
        return padRete("", digits);
    }
    static List<String> padRete(String p, String up){
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) - '0';
        ArrayList<String> ans = new ArrayList<>();
        String[] mapping = {
                "",
                "",
                "abc",
                "def",
                "ghi",
                "jkl",
                "mno",
                "pqrs",
                "tuv",
                "wxyz"
        };
        String letters = mapping[digit];
        for (char ch : letters.toCharArray()) {
            ans.addAll(padRete(p + ch, up.substring(1)));
        }

        return ans;
    }
}
