import java.util.Scanner;

public class App {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj wiek:");
        int age = sc.nextInt();
        System.out.printf("Wiek to: %d%n", age);
        sc.nextLine();

        System.out.println("Podaj wagę:");
        double weight = sc.nextDouble();
        System.out.printf("Waga to: %.2f%n", weight);
        sc.nextLine();

        System.out.println("Podaj imię:");
        String name = sc.nextLine();
        System.out.println("Imię: " + name);
        //sc.nextLine();

        sc.close();
    }
}
