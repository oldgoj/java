import java.util.Random;

public class App {
    public static void main(String[] args) {
        // Wylosuj dwie liczby całkowite z przedziału [1, 100] i wypisz większą z tych liczb lub
        //komunikat "EQ" kiedy liczby są równe.

        Random rnd = new Random();

        int rnd1 = rnd.nextInt(1, 101); // Losowanie liczby z przedziału [1, 100]
        int rnd2 = rnd.nextInt(1, 101); // Losowanie drugiej liczby z przedziału [1, 100]

        if (rnd1 != rnd2) {
            if (rnd1 > rnd2) {
                System.out.println("Rnd1: " + rnd1);
            }
            else if (rnd2 > rnd1) {
                System.out.println("Rnd2: " + rnd2);
            }
        } else {
            System.out.println("EQ");
        }
    }
}
