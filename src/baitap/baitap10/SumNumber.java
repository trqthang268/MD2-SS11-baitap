package baitap.baitap10;

import java.util.ArrayList;
import java.util.List;

public class SumNumber {
    public static void main(String[] args) {
        List<Integer> listNum = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            listNum.add((int) (Math.random() * 100));
        }
        System.out.println("Mang so la :" + listNum);
        int sum = 0;
        for (Integer i : listNum) {
            sum +=i;
        }
        System.out.println("Tong cac phan tu trong mang so la :"+sum);
    }
}
