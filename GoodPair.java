package goodPair;

import java.util.Scanner;

public class GoodPair {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = scanner.nextInt();
        int array[] = new int[size];
        System.out.println("Enter element into the array");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Enter the Number to find");
        int find = scanner.nextInt();
        scanner.close();
        GoodPair goodpair = new GoodPair();
        System.out.println(goodpair.pair(array, size, find));
    }

    public int pair(int array[], int size, int find) {
        boolean check = false;
        int val = 0;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (array[i] + array[j] == find) {
                    check = true;
                    val = (check) ? 1 : 0;

                }
            }
        }
        return val;
    }
}
