public class SB {
    public static void main(String[] args) {
        String[] word1 = {"ab", "c"};
        StringBuilder sb = new StringBuilder();
        for (String par : word1){
            sb.append(par);
        }
        System.out.println(sb.toString());
//        for (int i = 0; i < 26; i++) {
//            char ch = (char)('a' + i);
//            sb.append(ch);
//        }
//
//        System.out.println(sb.toString());
//
//        sb.reverse();
//        sb.delete(  4 , 8);
//
//        System.out.println(sb);

    }
}
