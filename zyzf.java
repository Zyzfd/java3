import java.awt.event.*;

public class zyzf extends KeyAdapter{

    public static void main(String[] args) {
        System.out.println("Выберите размерность массива:");
        System.out.println("1) Одномерный массив:");
        System.out.println("2) Двумерный массив:");

    }

    @Override
    public void keyTyped(KeyEvent event) {
        if (event.getKeyCode()==KeyEvent.VK_W) {
            System.out.println("Ok");
        }
    }

}