package baitap.baitap09;

import java.util.ArrayList;
import java.util.List;

public class DeleteNumCopy {
    public static void main(String[] args) {
        List<Integer> listNum = new ArrayList<>();
        listNum.add(22);
        listNum.add(22);
        for (int i = 0; i < 10; i++) {
            listNum.add((int) (Math.random() * 100));
        }
        System.out.println("Mang cu la :" + listNum);
        List<Integer> newList = new ArrayList<>();
        for (int i = 0; i < listNum.size(); i++) {
            if (!newList.contains(listNum.get(i))) {
                newList.add(listNum.get(i));
            }
        }
        System.out.println("Mang moi la :" + newList);
    }
}
