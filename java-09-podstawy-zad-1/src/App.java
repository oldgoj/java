import java.util.Random;

public class App {
    public static void main(String[] args) {
        // Wylosuj liczbę całkowitą z przedziału [1, 100] i sprawdź, czy jest podzielna przez 4.

        Random rnd = new Random();

        int liczba = rnd.nextInt(1, 101);

        if (liczba % 4 == 0) {
            System.out.println("Liczba " + liczba + " jest podzielna przez 4.");
        } else {
            System.out.println("Liczba " + liczba + " nie jest podzielna przez 4.");
        }

        System.out.println(liczba % 4 == 0? "Liczba jest podzielna przez 4." : "Liczba nie jest podzielna przez 4.");
    }
}

