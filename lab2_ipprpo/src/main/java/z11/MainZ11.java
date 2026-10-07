package z11;

import java.util.Scanner;

public class MainZ11 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("ведите размер массива: ");
        int n = scanner.nextInt();
        int[] m = new int[n];

        System.out.println("ведите элементы массива:");
        for (int i = 0; i < n; i++) {
            m[i] = scanner.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (m[j] > m[j + 1]) {
                    int a = m[j];
                    m[j] = m[j + 1];
                    m[j + 1] = a;
                }
            }
        }

        System.out.print("отсортированный массив: ");
        for (int i : m) {
            System.out.print( i+ " ");
        }
    }
}
