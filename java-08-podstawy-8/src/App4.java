import java.util.Scanner;

public class App4 {
    public static void main(String[] args) {
        // konwerter numeru dnia tygodnia na nazwę dnia, gdzie 1 to poniedziałek, 2 to wtorek itd.

        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj numer dnia tygodnia (1-7):");
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("Poniedziałek");
                break;
            case 2:
                System.out.println("Wtorek");
                break;
            case 3:
                System.out.println("Środa");
                break;
            case 4:
                System.out.println("Czwartek");
                break;
            case 5:
                System.out.println("Piątek");
                break;
            case 6:
                System.out.println("Sobota");
                break;
            case 7:
                System.out.println("Niedziela");
                break;
            default:
                System.out.println("Nieprawidłowy numer dnia tygodnia. Proszę podać liczbę od 1 do 7.");
        }

        System.out.println(" V2 - Podaj numer dnia tygodnia (1-7):");

        int day2 = sc.nextInt();

        // switch expression w Javie 12+
        String dayName = switch (day2) {
            case 1 -> "Poniedziałek";
            case 2 -> "Wtorek";
            case 3 -> "Środa";
            case 4 -> "Czwartek";
            case 5 -> "Piątek";
            case 6 -> "Sobota";
            case 7 -> "Niedziela";
            default -> "Nieprawidłowy numer dnia tygodnia. Proszę podać liczbę od 1 do 7.";
        };

        System.out.printf("%s%n", dayName);

        sc.close();
    }
}