class LCS {
    static void main() {
        String a = "abcde", b = "ace";
        System.out.println(longestCommonSubsequence(a,b));
    }
    public static int longestCommonSubsequence(String a, String b) {
        int m = a.length(), n = b.length();
        if(m==0 || n==0) return 0;
        String a2 = a.substring(0,m-1);
        String b2 = b.substring(0,n-1);
        if(a.charAt(m-1) == b.charAt(n-1)){
            return 1 + longestCommonSubsequence(a2,b2);
        }
        else {
            return Math.max(longestCommonSubsequence(a,b2) , longestCommonSubsequence(a2,b));
        }
    }
}