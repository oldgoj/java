import java.util.Random;

public class App {
    public static void main(String[] args) {
        int num1, num2;

        var rnd = new Random();

        do {
            num1 = rnd.nextInt(-20, 20);
            num2 = rnd.nextInt(-20, 20);
            if (num2 == 0) {
                System.out.println("Num2 nie może być zerem, losuję ponownie.");
                break;
            }
            System.out.printf("Num1: %d, Num2: %d%n", num1, num2);
            if (num1 % num2 == 0) {
                System.out.println("Num1 jest podzielne przez Num2");
            }
        } while (num1 % num2 != 0);
    }
}
