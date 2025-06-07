import java.util.Random;

public class App2 {
    public static void main(String[] args) {
        // Losujesz liczbę z przedziału [1, 100] i sprawdzasz, do jakiego zakresu należy

        Random rnd = new Random();

        int v = rnd.nextInt(1, 101);

        // zakres1 [1-10]
        // zakres2 (10,25)
        // zakres3 [25-56)
        // zakres1 [56-100]

        if (v >= 1 && v <= 10){
            System.out.printf("Liczba %d jest w zakresie [1,10]%n", v);
        } else if (v > 10 && v < 25) {
            System.out.printf("Liczba %d jest w zakresie (10,25)%n", v);
        } else if (v >= 25 && v < 56) {
            System.out.printf("Liczba %d jest w zakresie [25,56)%n", v);
        } else {
            System.out.printf("Liczba %d jest w zakresie [56,100]%n", v);
        }
    }
}
