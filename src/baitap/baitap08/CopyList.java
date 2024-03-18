package baitap.baitap08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CopyList {
    public static void main(String[] args) {
        String str = "Rekkei Academy để nông dân biết code";
        List<String> stringList = new ArrayList<>();
        String[] arrStr = str.split("\\s");
        System.out.println(Arrays.toString(arrStr));
        Collections.addAll(stringList,arrStr);
        System.out.println(stringList);
    }
}
