package baitap.baitap11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinCollec {
    public static void main(String[] args) {
        List<Integer> listNum = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            listNum.add((int) (Math.random()*100));
        }
        for (Integer i : listNum) {
            System.out.print(i+" ");
        }
        System.out.println("So nho nhat trong mang la: " + Collections.min(listNum));
    }
}
