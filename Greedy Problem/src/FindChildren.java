import java.util.Arrays;

class FindChildren {
    public static void main(String[] args) {
        int[] g = {10,9,8,7}, s = {5,6,7,8};
        System.out.println(findContentChildren(g,s));
    }
    public static int findContentChildren(int[] g, int[] s) {
        int m = g.length; int n = s.length;
        Arrays.sort(g); Arrays.sort(s);
        if(m == 0 || n == 0) return 0;
        int i =0, j= 0;
        while(i<m && j < n){
            if(s[j] >= g[i]){
                i = i+1;
            }
            j= j+1;
        }
        return i;
    }
}