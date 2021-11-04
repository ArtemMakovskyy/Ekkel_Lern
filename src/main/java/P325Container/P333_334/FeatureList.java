package P325Container.P333_334;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class FeatureList {
    public static void main(String[] args) {
        Random random = new Random(47);
        List<Integer> pets_integger = new ArrayList<>();
        pets_integger.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        System.out.println("1: pets_integger " + pets_integger);
    }
}
