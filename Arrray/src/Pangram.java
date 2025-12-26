import javax.management.StringValueExp;

public class Pangram {
    public static void main(String[] args) {
            String sentence = "lalit";
            boolean isPangram = true;
            for (char ch = 'a'; ch <= 'z'; ch++) {
                if (!sentence.contains(String.valueOf(ch))){
                    isPangram = false;
                }
            }
            isPangram = true;

    }
}

