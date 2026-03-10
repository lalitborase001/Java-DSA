class Num {
    static void main() {
        String s = "1101";
        System.out.println(numSteps(s));
    }
    public static int numSteps(String s) {
        int decimal = Integer.parseInt(s, 2);
        int step = 0;
        while (decimal >= 1){
            if(decimal % 2 == 0){
                decimal /= 2;
                step++;
            }else{
                decimal += 1;
                step++ ;
            }
        }
        return step;

    }
}