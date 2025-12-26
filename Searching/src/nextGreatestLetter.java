public class nextGreatestLetter {
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char target = 'c';
        char result = nextGreatestLetter(letters,target);
        System.out.println(result);
    }
    public static char nextGreatestLetter(char[] letters, char target) {
        for (char ch : letters ){
            if(ch > target){
                return ch;
            }
        }
        return letters[0];
    }
}
