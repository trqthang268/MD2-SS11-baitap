package baitap.baitap02;

import java.util.ArrayList;
import java.util.List;

public class Reverse {
    public static void main(String[] args) {
        List<Integer> listNumb = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            listNumb.add((int) (Math.random()*100));
        }
        System.out.println("Mang ban dau"+listNumb);
        List<Integer> reservedList =  new ArrayList<>();
        for (int i = listNumb.size()-1; i >= 0 ; i--) {
            reservedList.add(listNumb.get(i));
        }
        System.out.println("List da dao nguoc la "+reservedList);
    }

}
