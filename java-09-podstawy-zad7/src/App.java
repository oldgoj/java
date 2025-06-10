import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Pobierz od użytkownika trzy liczby zmiennoprzecinkowe. Oblicz ich średnia arytmetyczną oraz
        //odchylenie standardowe dla całej populacji.
        var sc = new Scanner(System.in);

        System.out.printf("Podaj pierwszą liczbę: ");
        var n1 = sc.nextDouble();
        System.out.printf("Podaj drugą liczbę: ");
        var n2 = sc.nextDouble();
        System.out.printf("Podaj trzecią liczbę: ");
        var n3 = sc.nextDouble();

        var avg = (n1 + n2 + n3) / 3;

        System.out.println("Średnia arytmetyczna: " + avg);

        var variance = ((n1 - avg) * (n1 - avg) + (n2 - avg) * (n2 - avg) + (n3 - avg) * (n3 - avg)) / 3;

        System.out.println("Odchylenie standardowe: " + Math.sqrt(variance));

    }
}
