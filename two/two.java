package two;
import bubble.bubble;
import one.one;
import java.util.Random;

public class two extends one{
    private static int[][] mass_sq;
    private static int[][] mass;

    public static int[][] generate_rand_square(int n) {
        mass_sq = new int[n][n];
        for (int i = 0; i < n; i++) {
            mass_sq[i] = generate_rand(mass_sq[i]);
        }
        return mass_sq;
    }

    public static int[][] generate_rand_nonsquare(int x) {
        mass = new int[x][];
        Random rand = new Random();
        for (int i = 0; i < x; i++) {
            mass[i] = new int[rand.nextInt(10)];
            mass[i] = generate_rand(mass[i]);
        }
        return mass;
    }

    public static void print_dvummass(int[][] mass) {
        for (int i = 0; i < mass.length; i++) {
            System.out.printf("\n");
            print_mass(mass[i]);
        }
    }

    public static void two(int x) {
        generate_rand_square(x);
        print_dvummass(mass_sq);
        int chet = 0;
        int nechet = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                if ((i+j) % 2 == 0) {
                    chet += mass_sq[i][j];
                } else {
                    nechet += mass_sq[i][j];
                }
            }
        }
        int temp[] = new int[x];
        
        if (chet > nechet) {
            // System.out.printf("\nЧетн");
            for (int i = 0; i < x; i++) {
                temp[i] = mass_sq[i][i];
            }

            int[] sorted = bubble.sort(temp);

            for (int i = 0; i < x; i++) {
                mass_sq[i][i] = sorted[i];
            }
        } else {
            // System.out.printf("\nНечетн");
            int ind = 0;
            int stolb = mass_sq[0].length-1;
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < x; j++) {
                    if (j == stolb) {
                        temp[ind] = mass_sq[i][j];
                        ind++;
                        stolb--;
                    }
                }
            }
            // System.out.printf("\n");
            // print_mass(temp);
            // System.out.printf("\n");

            int[] sorted = bubble.sort(temp);

            // System.out.printf("\n");
            // print_mass(temp);
            // System.out.printf("\n");

            stolb = mass_sq[0].length-1;
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < x; j++) {
                    if (j == stolb) {
                        mass_sq[i][j] = sorted[i];
                        stolb--;
                    }
                }
            }
        }
        System.out.printf("\n");
        print_dvummass(mass_sq);
    }

    public static int krat_2(int x) {
        print_dvummass(generate_rand_nonsquare(x));
        int max = 0;
        int max_index = 0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i].length > max) {
                max = mass[i].length;
                max_index = i;
            }
        }
        return krat(mass[max_index]);
    }
    
}
