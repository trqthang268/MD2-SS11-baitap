package baitap.baitap04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PrintStr {
    public static void main(String[] args) {
        String str = "Rekkei Academy để nông dân biết code";
        List<String> stringList = new ArrayList<>();
        String[] arrStr = str.split("\\s");

        System.out.println(Arrays.toString(arrStr));
//        Cach 1: dung addAll chuyen phan tu trong mang sang danh sach
//        Collections.addAll(stringList,arrStr);
//        Cach 2: duyet tung phan tu trong mang add vao danh sach
        for (String word : arrStr) {
            stringList.add(word.trim());
        }
        System.out.println("Cac phan tu co do dai lon hon 3 la :");
        for (String word : arrStr) {
            if (word.length()>3){
                System.out.print(word+", ");
            }
        }
    }
}
