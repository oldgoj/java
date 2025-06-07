import java.util.Random;

public class App {
    public static void main (String[] args){
        // wylosuj liczbe z przedziału 1-10 i jeśli będzie to liczba parzysta, wypisz komunikat liczba parzysta
        Random rnd = new Random();

        int v = rnd.nextInt(1,11);
        if (v % 2 == 0) {
            System.out.printf("Liczba %d jest parzysta%n",v);
        }
        else {
            System.out.printf("Liczba %d jest nieparzysta%n",v);
        }

        if (v % 2 == 0 && v > 2) {
            System.out.printf("Liczba %d jest parzysta i większa niż 2%n",v);
        } else if (v % 2 == 0 && v <= 2) {
            System.out.printf("Liczba %d jest parzysta i mniejsza lub równa 2%n",v);
        } else {
            System.out.printf("Liczba %d jest nieparzysta%n",v);
        }
    }
}
