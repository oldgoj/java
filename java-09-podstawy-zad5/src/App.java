import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Pobierz od użytkownika współrzędne x oraz y punktu na płaszczyźnie i oblicz jego odległość od początku
        //układu współrzędnych.

        var sc = new Scanner(System.in);

        System.out.println("Podaj współrzędną x:");

        var x = sc.nextDouble();

        System.out.println("Podaj współrzędną y:");

        var y = sc.nextDouble();

        // odległość = pierwiastek kwadratowy z (x^2 + y^2)

        //var distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

        var distance = Math.sqrt(x * x + y * y);

        System.out.println("Odległość punktu (" + x + ", " + y + ") od początku układu współrzędnych wynosi: " + distance);
    }
}
