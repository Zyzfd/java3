package bubble;

public class bubble {
    public static void swap(int[] array, int ind1, int ind2) {
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }

    public static int[] sort(int[] mass) {
        boolean need = true;
        while (need) {
            need = false;
            for (int i = 1; i < mass.length; i++) {
                if (mass[i] < mass[i - 1]) {
                    swap(mass, i, i-1);
                    need = true;
                }
            }
        }
        return mass;
    }
}
