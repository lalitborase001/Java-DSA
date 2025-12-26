public class Palindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        boolean isPalindrome = s.equals(sb.toString());
        if (isPalindrome){
            System.out.println("String is palindrome");
        }else {
            System.out.println("not an palindrome");
        }
    }
}
