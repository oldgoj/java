import java.util.Random;

public class App {
    public static void main(String[] args){
        Random rnd = new Random();

        int v1 = rnd.nextInt();
        int v2 = rnd.nextInt(100);
        int v3 = rnd.nextInt(50, 100);

        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
    }
}
