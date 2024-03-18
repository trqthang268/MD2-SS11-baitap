package baitap.baitap01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MaxCollec {
    public static void main(String[] args) {
        List <Integer> listNum = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            listNum.add((int) (Math.random()*100));
        }
        for (Integer i : listNum) {
            System.out.println(i+" ");
        }
        System.out.println("So lon nhat trong mang la" + Collections.max(listNum));
    }
}
