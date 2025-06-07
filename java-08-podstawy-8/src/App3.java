import java.util.Random;

public class App3 {
    public static void main(String[] args) {
        // Warunkowy operator trójargumentowy (ternary operator)
        // warunek ? wartość_jeśli_prawda : wartość_jeśli_fałsz

        // Liczba losowana z przedziału [45, 75] i jeśli podzeilna przez 3, to do zmiennej xx przypisz wartość 1, w przeciwnym wypadku 2

        Random rnd = new Random();

        int v = rnd.nextInt(45 , 76);

        System.out.printf("Wylosowana liczba: %d%n", v);

        int x;

        // ternary operator
        int xx = v % 3 == 0 ? 1 : 2;

        System.out.println("xx = " + xx);
    }
}
