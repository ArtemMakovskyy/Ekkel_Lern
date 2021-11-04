package BreackContinueReturn;
// p135
import java.util.Random;


public class BCR {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i == 99) break;
            if (i % 9 != 0) continue; // прерывание и старт с начала фора
            System.out.print(i + " ");
        }
        System.out.println();
        int i = 0;

        while (true) {
            i++;
            int j = i * 27;
            if (j == 1269) break;// прерывание в этом месте и продолжение программы
            if (i % 10 != 0) continue;
            System.out.println(i + " ");

        }
        System.out.println();
        i = 0;
        for (; ; ) {
            i++;
            int j = i * 27;
            if (j == 1269) return;//выход совсем
            if (i % 10 != 0) continue;
            System.out.println(i + " ");

        }
    }
}
