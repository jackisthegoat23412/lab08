public class CtoFTableDisplay {
    public static void main(String[] args) {
        System.out.printf("%-10s | %-10s\n", "Celsius", "Fahrenheit");
        System.out.println("-------------------------");
        for (double c = -100; c <= 100; c++) {
            double f = CtoF(c);
            System.out.printf("%-10.1f | %-10.1f\n", c, f);
        }
    }

    public static double CtoF(double Celsius) {
        return (Celsius * 9 / 5) + 32;
    }
}
