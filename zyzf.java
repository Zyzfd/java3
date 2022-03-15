import one.one;
import two.*;
import java.util.Scanner;

    public class zyzf {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("1: Одномерный массив");
            System.out.println("2: Двумерный массив");
            System.out.print("Введите номер нужного действия: ");
            int menu = scan.nextInt();
            int x = 0;
            switch (menu) {
                case 1:
                    System.out.print("Введите размер массива: ");
                    x = scan.nextInt();
                    System.out.printf("\nОтвет: %d", one.one(x));
                    System.out.printf("\n\n");
                    break;
                case 2:
                    System.out.print("Введите количество строк массива: ");
                    x = scan.nextInt();
                    System.out.printf("\nОтвет: %d", two.krat_2(x));
                    System.out.printf("\n\n");
                    two.two(5);
                    System.out.printf("\n\n");
                    break;
                default:
                    break;
            }
        }
}