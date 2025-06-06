public class App {
    public static void main(String[] args){
        System.out.println("Liczby zmiennoprzecinkowe");
        double a = 12.3;
        //System.out.println("Zmienna a: %.2f".formatted(a));
        System.out.printf("Zmienna a: %f%n", a);
        float b = 12.3f;
        //System.out.println("Zmienna b: %.2f".formatted(b));
        System.out.printf("Zmienna b: %f%n", b);

        System.out.println("Double");
        System.out.println(Double.BYTES);
        System.out.println(Double.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);

        // Typ double jest bardziej precyzyjny

        // Typ BigDecimal - przechowuje dokładne liczby zmiennoprzecinkowe
    }
}
