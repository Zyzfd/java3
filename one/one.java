package one;
import java.util.Random;

public class one {
    private static int[] mass;

    public static int krat(int[] mass) {
        if (mass[mass.length - 1] != 0) {
            int k = 0;
            for (int i = 0; i < mass.length - 1; i++) {
                if (mass[i] % mass[mass.length - 1] != 0) {
                    k++;
                }
            }
            return k;
        } else {
            System.out.println("Деление на 0!");
            return 0;
        }
        
    }

    public static int[] generate_rand(int[] mass) {
        Random rand = new Random();
        for (int i = 0; i < mass.length; i++) {
            mass[i] = rand.nextInt(10);
        }
        return mass;
    }

    public static void print_mass(int[] mass) {
        for (int i = 0; i < mass.length; i++) {
            System.out.printf("%3d", mass[i]);
        }
    }

    public static int one(int n) {
        mass = new int[n];
        generate_rand(mass);
        print_mass(mass);
        return krat(mass);
    }
    

}
