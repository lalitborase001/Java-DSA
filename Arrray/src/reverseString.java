import java.util.Arrays;

//import static jdk.internal.org.jline.utils.Colors.s;

public class reverseString {
    public static void main(String[] args) {
        char[] s ={'l', 'a', 'l', 'i', 't'};
        int low = 0;
        int high = s.length - 1;
        int mid = (low + high) / 2;
        for (int i =0; i< s.length/2; i ++){
            char temp = s[i];
            s[i] = s[high - i];
            s[high - i ] = temp;

        }
        System.out.println(Arrays.toString(s));

    }
}
