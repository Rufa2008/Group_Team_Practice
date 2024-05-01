package book_store.joseph.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class SortingBubbleSorting {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(12,34,24,76,3,22,11,7,19,37));
        bubbleSort(list);
        System.out.println(list);

    }
    public static void bubbleSort(ArrayList<Integer> list) {
        boolean swapped;
        for (int i = 0; i < list.size() - 1; i++) {
            swapped = false;
            for (int j = 0; j < list.size() - 1 - i; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                    swapped = true;
                }
            }
            //if swapped is false then sorting is completed and break
            if (!swapped) {
                break;
            }
        }
    }


}
