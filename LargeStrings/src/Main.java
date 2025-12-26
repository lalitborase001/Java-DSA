import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        StringBuffer sb1 = new StringBuffer("Lalit");
        StringBuffer sb2 = new StringBuffer(30);

        sb.append("lalit");
        sb.append( " is nice ");

        String str = sb.toString();
        System.out.println(str);

        int n = 20;
        String name = RandomString.generate(n);
        System.out.println(name);

        String sentence = "hi ce vre vr if     v";
        System.out.println(sentence);
        System.out.println(sentence.replaceAll("\\s", ""));

        String arr = "Lalit Borase Adarsh Chetan";
        String[] names = arr.split(" ");
        System.out.println(Arrays.toString(names));

        DecimalFormat df = new DecimalFormat("0.000");
        System.out.println(df.format(7.2));
    }
}