package baitap.baitap03;

import java.util.*;

public class SortNum {
    public static void main(String[] args) {
        List<Integer> listNum = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            listNum.add((int) (Math.random()*100));
        }
        System.out.println("Danh sach ban dau la "+listNum);
        Collections.sort(listNum, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
//        Collections.sort(listNum);      //sap xep tang dan
//        Collections.reverse(listNum);   // dao nguoc
        System.out.println("List sap xep giam dan "+listNum);
    }
}
