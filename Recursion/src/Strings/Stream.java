package Strings;

public class Stream {
    public static void main(String[] args) {
        System.out.println(Skipnotapple("bapplecappcad"));
    }
    static void Skip(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if (ch == 'a'){
            Skip(p,up.substring(1));
        }else {
            Skip(p + ch, up.substring(1));
        }
    }
    static String Skip( String up){
        if (up.isEmpty()){
            return "";
        }
        char ch = up.charAt(0);
        if (ch == 'a'){
            return Skip(up.substring(1));
        }else {
            return ch + Skip( up.substring(1));
        }
    }
    static String Skipapple( String up){
        if (up.isEmpty()){
            return "";
        }

        if (up.startsWith("apple")){
            return Skipapple(up.substring(5));
        }else {
            return up.charAt(0) + Skipapple( up.substring(1));
        }
    }
    static String Skipnotapple( String up) {
        if (up.isEmpty()) {
            return "";
        }

        if (up.startsWith("app") && !up.startsWith("apple")) {
            return Skipnotapple(up.substring(3));
        } else {
            return up.charAt(0) + Skipnotapple(up.substring(1));
        }
    }
}
