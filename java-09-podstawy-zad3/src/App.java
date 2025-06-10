import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        // Wylosuj dwie liczby całkowite z przedziału [1, 100] i sprawdź, czy ich iloczyn jest liczbą
        //należącą do jednego z przedziałów: [1, 15], (15, 25), [25, 35), [35, 45).

        var rnd = new Random();

        int num1 = rnd.nextInt(1, 101);
        int num2 = rnd.nextInt(1, 101);

        int prod = num1 * num2;

        if (prod >= 1 && prod <= 15){
            System.out.printf("Iloczyn %d i %d jest w przedziale [1, 15].%n", num1, num2);
        } else if (prod > 15 && prod < 25) {
            System.out.printf("Iloczyn %d i %d jest w przedziale (15, 25).%n", num1, num2);
        } else if (prod >= 25 && prod < 35) {
            System.out.printf("Iloczyn %d i %d jest w przedziale [25, 35).%n", num1, num2);
        } else if (prod >= 35 && prod < 45) {
            System.out.printf("Iloczyn %d i %d jest w przedziale [35, 45).%n", num1, num2);
        } else {
            System.out.printf("Iloczyn %d i %d nie należy do żadnego z przedziałów.%n", num1, num2);
        }
    }
}
