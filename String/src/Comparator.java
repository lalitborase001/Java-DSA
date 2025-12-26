import java.util.Arrays;

public class Comparator {
    public static void main(String[] args) {
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
        boolean result = arrayStringsAreEqual(word1, word2);
        if (result){
            System.out.println("Strings are equal");
        }else {
            System.out.println("Strings are not equal");
        }
    }
    public  static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        for (String one : word1){
            sb1.append(one);
        }
        StringBuilder sb2 = new StringBuilder();
        for (String two : word2){
            sb2.append(two);
        }
        return sb1.toString().equals(sb2.toString());
    }



}
