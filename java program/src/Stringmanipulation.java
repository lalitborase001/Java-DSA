public class Stringmanipulation {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String concat = str1 + " " + str2;
        System.out.println("Concatenation: " + concat);
        String sub = concat.substring(0,5);
        System.out.println(sub);
        String str3 = "Hello";
        if (str1.equals(str3)) {
            System.out.println("str1 and str3 are equal");
        } else {
            System.out.println("str1 and str3 are not equal");
        }
    }
}
