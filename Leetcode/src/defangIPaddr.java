import java.util.StringTokenizer;

public class defangIPaddr {
    public static void main(String[] args) {
        String address = "1.1.1.1";
        String ans = defangIPaddr(address);
        System.out.println(ans);
    }
    public static String defangIPaddr(String address) {
//        return address.replace(".","[.]");
        String a="";
        for(int i=0;i<address.length();i++){
            char s=address.charAt(i);
            if(s=='.'){
                a=a+"[.]";
            }else{
                a=a+s;
            }
        }
        return a;
    }
}
