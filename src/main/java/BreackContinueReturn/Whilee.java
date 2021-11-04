package BreackContinueReturn;

public class Whilee {
static void prnOuter(){
    System.out.println("outer");
}

    public static void main(String[] args) {
        int i=0;
        prnOuter();
        while (true){
            System.out.println("outer cycle while");
            while (true){
                i++;
                System.out.println("i = " + i);
                if (i==1){
                    System.out.println("cont"   );
                    continue;
                }
                if (i == 3 ){
                    System.out.println("cont outer");
                    continue;
                }

                if (i == 5 ){
                    System.out.println("breack");
                    break;
                }
                if (i == 7 ){
                    System.out.println("breack out");
                    prnOuter();
                    return;
                }
            }
        }

    }
}
