package Peaksoft;

import java.util.*;

public class Main {
    static Random random = new Random();

    public static void main(String[] args) {
	// write your code here

        int[] array = new int[20];
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        printArray(array);
        printArray(arrayList);
        printArray(linkedList);

    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(2);
        }
        Arrays.sort(array);
        for (int sorted : array) {
            System.out.print(sorted + " ");
        }
        System.out.println();
    }

    public static void printArray(List<Integer> arrayList) {
        for (int i = 0; i < 20; i++) {
            arrayList.add(random.nextInt(2));
        }
        Collections.sort(arrayList);
        System.out.println("ArrayList : " + arrayList);
    }

    public static void printArray(LinkedList<Integer> linkedList) {
        for (int i = 0; i < 20; i++) {
            linkedList.add(random.nextInt(2));
        }
        Collections.sort(linkedList);
        System.out.println("LinkedList : " + linkedList);
    }
}
