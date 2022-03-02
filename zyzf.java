import one.one;
import two.*;

public class zyzf {

    public static void main(String[] args) {
        // System.out.println("Выберите размерность массива:");
        // System.out.println("1) Одномерный массив:");
        // System.out.println("2) Двумерный массив:");
        System.out.printf("\nОтвет: %d", one.one(5));
        System.out.printf("\n\n");
        System.out.printf("\nОтвет: %d", two.krat_2(5));
        System.out.printf("\n\n");
        two.two(5);
    }
}