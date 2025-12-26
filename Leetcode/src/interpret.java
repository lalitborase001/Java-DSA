import java.util.HashMap;

public class interpret {
    public static void main(String[] args) {
        String command = "G()()()()(al)";
        System.out.println(interpret(command));
    }
    public static String interpret(String command) {
//        return command.replace("()","o").replace("(al)", "al");
        HashMap<String , String> hash = new HashMap<>();
        hash.put("G", "G");
        hash.put("()", "o");
        hash.put("(al)", "al");
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < command.length();) {
            if (command.startsWith("G",i)) {
                output.append(hash.get("G"));
                i += 1;
            }
            if (command.startsWith("()",i)) {
                output.append(hash.get("()"));
                i += 2;
            }
            if (command.startsWith("(al)",i)) {
                output.append(hash.get("(al)"));
                i += 2;
            }
        }
        return output.toString();
    }
}
