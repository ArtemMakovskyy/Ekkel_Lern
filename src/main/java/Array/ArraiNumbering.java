package Array;

public class ArraiNumbering {
    public static void main(String[] args) {
        int i, j, s, k = 0, on = 3, tw = 4, th = 5;
        int twoDarray[][][] = new int[on][tw][th];

        //input

        for (i = 0; i < on; i++) {
            for (j = 0; j < tw; j++) {
                for (s = 0; s < th; s++) {
                    twoDarray[i][j][s] = k;
                    k++;
                }
            }
        }
        // output
        for (i = 0; i < on; i++) {
            for (j = 0; j < tw; j++) {
                for (s = 0; s < th; s++) {
                    System.out.print(twoDarray[i][j][s] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        int num = twoDarray.length;
        System.out.println(num);
    }
}
