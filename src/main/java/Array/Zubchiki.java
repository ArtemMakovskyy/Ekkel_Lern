package Array;

import java.util.Arrays;

//https://www.youtube.com/watch?v=4BH4fG-nYsc
public class Zubchiki {
    public static void main(String[] args) {
        short z[][] = new short[5][];
        z[0] = new short[3];
        z[1] = new short[4];
        z[2] = new short[2];
        z[3] = new short[3];
        z[4] = new short[1];

//        for (int i = 0; i < z.length; i++) {
//            z[i] = new short[2];
//        }
        short cnt = 1;
        for (int i = 0; i < z.length ; i++) {
            for (int j = 0; j < z[i].length; j++) {
                System.out.print(z[i][j] = cnt);
                System.out.print( " ");
                cnt++;
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < z.length; i++) {
            System.out.println(z.length + " " + z[i].length);
        }
        System.out.println(Arrays.toString(z));
    }
}
