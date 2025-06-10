import java.util.Random;
import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        //Wylosuj liczbę całkowitą z przedziału [100, 200] i sprawdź, czy jest ona większa od sumy dwóch liczb
        //całkowitych pobranych od użytkownika.

        var rnd = new Random();
        var sc = new Scanner(System.in);

        int r = rnd.nextInt(100, 200);

        System.out.println("Wylosowana liczba: " + r);

        System.out.print("Podaj pierwszą liczbę całkowitą: ");

        int a = sc.nextInt();
        System.out.print("Podaj drugą liczbę całkowitą: ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("Suma podanych liczb: " + sum);

        if (r > sum) {
            System.out.println("Wylosowana liczba jest większa od sumy podanych liczb.");
        } else if (r < sum) {
            System.out.println("Wylosowana liczba jest mniejsza od sumy podanych liczb.");
        } else {
            System.out.println("Wylosowana liczba jest równa sumie podanych liczb.");
        }
    }
}
