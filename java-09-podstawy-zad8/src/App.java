import java.util.Random;

public class App {
    public static void main(String[] args) {
        // Wylosuj trzy liczby całkowite z przedziału [-20, 20] i sprawdź, czy średnia arytmetyczna
        //liczby największej oraz liczby najmniejszej jest większa od liczby środkowej.

        var rnd = new Random();

        int a1 = rnd.nextInt(-20, 20);
        int a2 = rnd.nextInt(-20, 20);
        int a3 = rnd.nextInt(-20, 20);

        System.out.println("Wylosowane liczby: " + a1 + ", " + a2 + ", " + a3);

        int max = Math.max(a1, Math.max(a2, a3));

        int min = Math.min(a1, Math.min(a2, a3));

        int middle = a1 + a2 + a3 - max - min;

        double average = (max + min) / 2.0;

        System.out.println("Średnia arytmetyczna największej i najmniejszej liczby: " + average);

        if (average > middle) {
            System.out.println("Średnia arytmetyczna największej i najmniejszej liczby jest większa od liczby środkowej.");
        } else {
            System.out.println("Średnia arytmetyczna największej i najmniejszej liczby nie jest większa od liczby środkowej.");
        }
    }
}
