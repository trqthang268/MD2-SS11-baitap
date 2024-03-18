package baitap.baitap05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PrintMin {
    public static void main(String[] args) {
        String str = "Rekkei Academy để nông dân biết code i e";
        List<String> stringList = new ArrayList<>();
        String[] arrStr = str.split("\\s");
        List<String> kdl = new ArrayList<>();
        System.out.println("Mang ban dau");
        System.out.println(Arrays.toString(arrStr));
//        Cach 1: dung addAll chuyen phan tu trong mang sang danh sach
        Collections.addAll(stringList, arrStr);
        int min = stringList.get(0).length();
        for (String word : stringList) {
            if (word.length() < min) {
                min = word.length();
                kdl.clear();
                kdl.add(word);
            } else if (word.length() == min) {
                kdl.add(word);
            }
        }
        System.out.println("Mang chua cac phan tu co do dai nho nhat");
        System.out.println(kdl);
    }
}
