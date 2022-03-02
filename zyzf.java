import one.one;
import two.*;
import javax.swing.*;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.util.Scanner;

    public class zyzf extends JFrame implements KeyListener{
        int menu = 1;
     
     
        public static void main(String[] args) {
            JFrame w = new JFrame("Window");
            w.setSize(400, 400); 
            w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
            w.show(); 
        }
     
        @Override
        public void keyTyped(KeyEvent e) {
     
        }
     
        @Override
        public void keyPressed(KeyEvent e) {
            Scanner in = new Scanner(System.in);
     
            if (e.getKeyCode() == KeyEvent.VK_W) {
                if(menu == 1) {
                    menu = 2;
                }
                else {
                    menu--;
                }
            }
     
            if (e.getKeyCode() == KeyEvent.VK_S) {
                if(menu == 2) {
                    menu = 1;
                }
                else {
                    menu++;
                }
            }
            if (e.getKeyCode() == KeyEvent.VK_SPACE) {
                if(menu == 1) {
                    menu = 3;
                }
                if(menu == 2) {
                    menu = 4;
                }
                if(menu == 3) {
                    
                }
            }
            if (menu == 1) {
                System.out.println("---------------------");
                System.out.println("| Одномерный массив |");
                System.out.println("---------------------");
                System.out.println("Двумерный массив");
            }
            if (menu == 2) {
                System.out.println("Одномерный массив");
                System.out.println("--------------------");
                System.out.println("| Двумерный массив |");
                System.out.println("--------------------");
            }
            if (menu == 3) {
                System.out.println("Введите размер массива: ");
                int x = in.nextInt();
                System.out.printf("\nОтвет: %d", one.one(x));
                System.out.printf("\n\n");
            }
            if (menu == 4) {
                System.out.println("Введите количество строк массива: ");
                int x = in.nextInt();
                System.out.printf("\nОтвет: %d", two.krat_2(x));
                System.out.printf("\n\n");
                two.two(5);
                System.out.printf("\n\n");
            }
     
        }
        @Override
        public void keyReleased(KeyEvent e) {
     
        }
}