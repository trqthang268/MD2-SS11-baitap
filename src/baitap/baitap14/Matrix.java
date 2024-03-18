package baitap.baitap14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Matrix {
    public static void main(String[] args) {
        int size = (int) (Math.random()*10 +1);
        System.out.println(size);
        List<Integer>[][] arrayLists = new ArrayList[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arrayLists[i][j] = new ArrayList<>();
                arrayLists[i][j].add((int) (Math.random()*100));
            }
        }
        System.out.println(Arrays.deepToString(arrayLists));
    }

}
