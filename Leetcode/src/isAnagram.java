import java.util.ArrayList;
import java.util.Arrays;

public class isAnagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        boolean result = isAnagram(s,t);
        System.out.println(result);
    }
    public static boolean isAnagram(String s, String t) {
        char[] chars1 = s.toCharArray();
        Arrays.sort(chars1);
        String sorted1 = new String(chars1);
        char[] chars2 = t.toCharArray();
        Arrays.sort(chars2);
        String sorted2 = new String(chars2);
        return sorted1.equals(sorted2);
    }
}
