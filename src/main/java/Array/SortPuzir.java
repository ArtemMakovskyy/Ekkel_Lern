package Array;
//https://www.youtube.com/watch?v=4BH4fG-nYsc
import java.util.Arrays;

public class SortPuzir {
    public static void main(String[] args) {
        //sorted from max to muin value
        int ar[] = {3, 5, 1, 6, 2, 4};
        for (int i = 0; i < ar.length - 1; i++) {
            int first_min_value = ar[i]; // value position
            int minimum_data_position = i; // number position


            for (int j = i + 1; j < ar.length; j++)
                if (first_min_value < ar[j]) {
                    minimum_data_position = j;
                    first_min_value = ar[j];
                }
                int temp = ar[i];
                ar[i] = ar[minimum_data_position];
                ar[minimum_data_position] = temp;
        }
        System.out.println(Arrays.toString(ar));

    }
}
