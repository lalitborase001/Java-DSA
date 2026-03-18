class Powerm {
    static void main() {
        System.out.println(myPow(2,2));
    }
    public static double myPow(double x, int n) {
        double result = 1;
        if(n == 0) return 1;
        if(n>0) result = x * myPow(x,n-1);
        else if (n<0){
            result = 1 / (x * myPow(x,n+1));  
        }
        return result;
    }
}