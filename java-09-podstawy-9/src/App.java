import java.util.Random;

public class App {
    public static void main(String[] args){
        // Losuj liczbą z przedziału [100, 999] dopóki nie wylosujesz liczby parzystej
        // while (warunek) {instrukcje}

        Random rnd = new Random();

        int v = rnd.nextInt(100, 1000);

        int counter = 1;

        System.out.println("Pętla while...");

        while (v % 2!= 0) {
            v = rnd.nextInt(100, 1000);

            counter = counter + 1;
        }

        System.out.printf("Wylosowano liczbę: %d, za %d razem\n", v, counter);

        // do .. while (warunek) {instrukcje}
        int w;
        do {
            w = rnd.nextInt(100, 1000);
            if (w%5 == 0){
                break;
            }
            System.out.println("Wylosowana liczba w: " + w);
        } while(w%2 != 0);
        System.out.printf("Wylosowana liczba w: %d%n", w);

        // pętla for (inizjalizacja, warunek, iteracja) {instrukcje}
        System.out.println("Pętla for...");

        for (int z = 0; z < 10; z +=2) {
            System.out.println("K = " + z);
        }

        // foreach (typ elementu zmienna : kolekcja) {instrukcje}

        System.out.println("Foreach...");
        int [] arr = {12,21,34,45,56};
        for (int element : arr) {
            System.out.println("Element tablicy: " + element);
        }
    }
}
