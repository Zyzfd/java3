package two;
import bubble.bubble;
import one.one;

public class two extends one{
    private static int[][] mass;

    public static void two(int x, int y) {
        mass = new int[x][y];
        if (x == y) {
            int chet = 0;
            int nechet = 0;
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < y; j++) {
                    if (i+j % 2 == 0) {
                        chet += mass[i][j];
                    } else {
                        nechet += mass[i][j];
                    }
                }
            }
            int temp[] = new int[x];
            
            if (chet > nechet) {
                for (int i = 0; i < x; i++) {
                    temp[i] = mass[i][i];
                }

                int[] sorted = bubble.sort(temp);

                for (int i = 0; i < x; i++) {
                    mass[i][i] = sorted[i];
                }
            } else {
                for (int i = 0; i < x; i++) {
                    for (int j = 0; j < y; j++) {
                        if (i+j == x+1) {
                            temp[i] = mass[i][j];
                        }
                    }
                }

                int[] sorted = bubble.sort(temp);

                for (int i = 0; i < x; i++) {
                    for (int j = 0; j < y; j++) {
                        if (i+j == x+1) {
                            mass[i][j] = sorted[i];
                        }
                    }
                }
            }
        } else {
            System.out.println("Матрица не квадратная");
        }
    }

    public static void krat_2(int[][] mass) {

    }
    
}
