public class App3 {
    public static void main(String[] args) {
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
    }
}
