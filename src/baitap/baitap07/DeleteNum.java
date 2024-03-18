package baitap.baitap07;

import java.util.ArrayList;
import java.util.List;

public class DeleteNum {
    public static void main(String[] args) {
        List<Integer> listNum = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            listNum.add((int) (Math.random() * 100));
        }
        System.out.println("Mang cu la :" + listNum);
        List<Integer> newlistNum = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            if (listNum.get(i)%2!=0){
                newlistNum.add(listNum.get(i));
            }
        }
        System.out.println("Mang so nguyen le? la' : "+newlistNum);
    }
}
