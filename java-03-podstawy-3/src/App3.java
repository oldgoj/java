public class App3 {
    public static void main(String[] args) {
        //System.err.println("To jest błąd");
        int yourAge = 39;
        int myAge = 49;
        byte x1 = 127;
        short x2 =32767;
        int x3 = 2147483647;
        long x4 = 9223736772882993L; //Suffix L potrzebny dla long

        System.out.println("Hello, World!");
        System.out.println("Twój wiek: " + yourAge);
        System.out.printf("Mój wiek: %d%n".formatted(myAge));
        System.out.printf("Mój wiek: %d",myAge);
        System.out.printf("%nA może: %d",48);

        //Stała
        final int X5 = 10; // stała, nie można zmienić wartości. Stałe zazwyczaj oznaczamy DUŻYMI LITERAMI

        // Pozyskanie informacji nt typów z predefiniowanych stałych
        System.out.println("Byte:");
        System.out.println(Byte.BYTES);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println("Short:");
        System.out.println(Short.BYTES);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println("Integer:");
        System.out.println(Integer.BYTES);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println("Long:");
        System.out.println(Long.BYTES);
        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);

        // Trzy specjalne obiekty w Java
        // System.out - wysyła dane do konsoli
        // System.in - pobiera dane z konsoli
        // System.err - wysyła dane do konsoli błędów
    }
}
