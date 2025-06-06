import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class App {
    public static void main(String[] args){
        Random rnd = new Random();

        int v1 = rnd.nextInt();
        int v2 = rnd.nextInt(1000000);
        int v3 = rnd.nextInt(50, 100);

        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);

        double v4 = rnd.nextDouble();
        double v5 = rnd.nextDouble(10.5);
        double v6 = rnd.nextDouble(100.5, 1000.5);

        System.out.println(v4);
        System.out.println(v5);
        System.out.println(v6);

        int v7 = rnd.nextInt(1240, 1352);
        double v8 = v7 / 100.0;
        System.out.println("v7 = " + v7);
        System.out.println("v8 = " + v8);

        ThreadLocalRandom tlRnd = ThreadLocalRandom.current();
        System.out.println("ThreadLocalRandom: " + tlRnd.nextInt(1000, 2000));
    }
}
