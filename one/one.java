package one;

public class one {
    private static int[] mass;

    public static int krat(int[] mass) {
        int k = 0;
        for (int i = 0; i < mass.length - 1; i++) {
            if (mass[i] % mass[mass.length - 1] != 0) {
                k++;
            }
        }
        return k;
    }

    public static int one(int n) {
        mass = new int[n];
        return krat(mass);
    }
    

}
