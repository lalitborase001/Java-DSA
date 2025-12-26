import java.util.Arrays;

public class convertTemperature {
    public static void main(String[] args) {
//        double celsius = 36.50;
        double[] result = convertTemperature(36.50);
        System.out.println(Arrays.toString(result));
    }
    public static double[] convertTemperature(double celsius) {
        double kelvin =  celsius + 273.15;
        double Fahrenheit = celsius * 1.80 + 32.00;
        return new double[]{kelvin,Fahrenheit};
    }
}
