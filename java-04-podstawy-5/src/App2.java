import static java.lang.Math.*;

public class App2 {
    public static void main(String[] args) {
        int a = 13, b = 4;
        int r1 = a + b;
        int r2 = a - b;
        int r3 = a * b;
        int r4 = a / b;
        int r5 = a % b; // Modulus operator
        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);
        System.out.println("r4 = " + r4);
        System.out.println("r5 = " + r5);

        // Rzutowanie
        double wynik = (double) a / b;
        System.out.printf("Wynik rzutowania: %.5f%n", wynik);

        double r9 = Math.pow(12, 3); // Potęgowanie

        System.out.println("Potęgowanie, r9 = " + r9);
        System.out.println(Math.abs(-12)); // Wartość bezwzględna
        System.out.println(Math.ceil(-13.6)); // Zaokrąglanie w górę
    }
}
