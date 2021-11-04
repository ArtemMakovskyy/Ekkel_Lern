package BreackContinueReturn;

public class LabelFor137 {
    public static void main(String[] args) {
        PrnAndOther p = new PrnAndOther();
        int i = 0;
        for (; true; ) {
            for (; i < 10; i++) {
                System.out.println(("i = " + i));
                if (i == 2) {
                    System.out.println("cont");
                    continue;
                }
                if (i == 3) {
                    System.out.println("breack");
                    i++;
                    break;
                }
                if (i == 7) {
                    System.out.println("cont outer");
                    i++;
                    p.print(1111);
                    continue;
                }
                if (i == 8) {

                    System.out.println(8);
                    break;
                }
                if (i == 9) {
                    for (int j = 0; j < 5; j++) {
                        if (j == 4) {
                            System.out.println("exit k " + j);
                            return;
                        }
                    }
                }

            }
        }
    }

}
