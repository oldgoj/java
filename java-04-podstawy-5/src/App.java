import static java.lang.Math.abs;

public class App {
    public static void main(String[] args) {
        int a = 13, b = 4;
        int r1 = a + b;
        int r2 = a - b;
        int r3 = a * b;
        int r4 = a / b;
        int r5 = a % b; // Modulus operator
        System.out.println("r1 = "+ r1);
        System.out.println("r2 = "+ r2);
        System.out.println("r3 = "+ r3);
        System.out.println("r4 = "+ r4);
        System.out.println("r5 = "+ r5);

        // rzutowanie
        double wynik = (double) a / b;
        System.out.printf("Wynik rzutowania: %.5f%n", wynik);

        double r9 = Math.pow(12, 3); // Potęgowanie

        System.out.println("Potęgowanie, r9 = " + r9);
        System.out.println(abs(-12)); // Wartość bezwzględna
        System.out.println(Math.ceil(-13.6)); // Zaokrąglanie w górę

        int age = 12;
        double height = 175;

        System.out.printf("Warunek %s%n", (age >= 18 && height >= 160) ? "spełniony" : "nie spełniony");
        System.out.printf("Warunek %s%n", age == 18);

        // Operatory do operacji bitowych
        int x = 12;
        int y = 15;
        System.out.printf("x = %s%n", Integer.toBinaryString(x));
        System.out.printf("y = %s%n", Integer.toBinaryString(y));
        System.out.printf("x & y = %s%n", Integer.toBinaryString(x & y));
        System.out.printf("~x = %s%n", Integer.toBinaryString(~x));

        // Przesunięcie bitowe
        int z = 19;
        System.out.printf("z = %s%n", Integer.toBinaryString(z));
        System.out.printf("z>> = %s%n", Integer.toBinaryString(z >> 1)); //dzielenie przez 2
        System.out.printf("z<< = %s%n", Integer.toBinaryString(z << 1)); //mnożenie razy 2
    }
}
