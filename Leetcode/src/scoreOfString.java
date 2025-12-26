//import static sun.util.calendar.CalendarUtils.mod;

public class scoreOfString {
    public static void main(String[] args) {
        String s = "hello";
        System.out.println(scoreOfString(s));
    }
    public static int scoreOfString(String s) {
        int score = 0;
        for(int i = 0; i < s.length()-1; i++){
            char current = s.charAt(i);
            char next = s.charAt(i + 1);
            int val1 = (int)current;
            int val2 = (int)next;
            score +=Math.abs(val1-val2);
        }
        return score;
    }
}
