package z13;

import java.util.Scanner;

public class MainZ13 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите n: ");
        int n = scanner.nextInt();

        System.out.println("простые числа до n: ");
        for (int i = 2; i <= n; i++) {
            boolean simple = true;

            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    simple = false;
                    break;
                }
            }

            if (simple) System.out.print(i + " ");
        }
        System.out.println("конец");
    }
}
