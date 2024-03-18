package baitap.baitap06;

import java.util.ArrayList;
import java.util.List;

public class SortListNumb {
    public static void main(String[] args) {
        List<Integer> listNum = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            listNum.add((int) (Math.random() * 100));
        }
        System.out.println("Mang cu la :" + listNum);
//      Nổi bọt
//        int temp;
//        for (int i = 0; i < listNum.size()-1; i++) {
//            for (int j = 0; j < listNum.size()-1-i; j++) {
//                if (listNum.get(j)> listNum.get(j+1)){
//                    temp = listNum.get(j);
//                    listNum.set(j, listNum.get(j+1));
//                    listNum.set(j+1, temp);
//                }
//            }
//        }
//        System.out.println("Mang da sap xep la :"+listNum);

//        Chọn
//        int n = listNum.size();
//        for (int i = 0; i < n-1; i++) {
//            int minIndex = i;
//            for (int j = i + 1; j < n; j++) {
//                if (listNum.get(j)<listNum.get(minIndex)){
//                    minIndex = j;
//                }
//            }
//            int temp = listNum.get(minIndex);
//            listNum.set(minIndex, listNum.get(i));
//            listNum.set(i,temp);
//        }
//        System.out.println("Mang da sap xep la :"+listNum);

//        Chèn
        int n = listNum.size();
        for (int i = 1; i < n; ++i) {
            int key = listNum.get(i);
            int j = i - 1;
            while (j >= 0 && listNum.get(j) > key) {
                listNum.set(j + 1, listNum.get(j));
                j = j - 1;
            }
            listNum.set(j+1,key);
        }
        System.out.println("Mang da sap xep la :"+listNum);
    }
}
