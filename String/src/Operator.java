import javax.xml.transform.Source;
import java.util.ArrayList;

public class Operator {
    public static void main(String[] args) {
        System.out.println("a" + "b");
        System.out.println('a' + 'b');
        System.out.println("a" + 'b');

        System.out.println("Kunal" + new ArrayList<>());
        System.out.println("Kunal" + new Integer(56));

        String ans = new Integer(56) + "" + new ArrayList<>();
        System.out.println(ans);

        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            series = series + ch; // series += ch
        }

        System.out.println(series);
    }
}
