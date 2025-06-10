import java.util.Random;
import java.util.Scanner;

public class App {

    /*
        Pobierz od użytkownika trzy liczby i sprawdź, czy mogą utworzyć trójkąt.
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj pierwszą wartość:");
        double a = sc.nextDouble();

        System.out.println("Podaj drugą wartość:");
        double b = sc.nextDouble();

        System.out.println("Podaj trzecią wartość:");
        double c = sc.nextDouble();

        System.out.println("a = " + a + ", b = " + b + ", c = " + c);

        if (a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && b + c > a) {
            System.out.println("Boki: " + a + ", " + b + ", " + c + " mogą utworzyć trójkąt");
        } else {
            System.out.println("Boki: " + a + ", " + b + ", " + c + " nie mogą utworzyć trójkąta");
        }
    }
}
