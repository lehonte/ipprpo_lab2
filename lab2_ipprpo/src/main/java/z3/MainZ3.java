package z3;

import java.util.Scanner;

public class MainZ3 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                способы перевода:
                1 Цельсий -> Фаренгейт
                2 Фаренгейт -> Цельсий
                выберите способ:
                """);

        int choice = scanner.nextInt();
        if (choice == 1) {
            System.out.print("введите температуру в C: ");
            double c = scanner.nextDouble();
            double f = (c * 9 / 5) + 32;
            System.out.printf("%.2f C = %.2f F", c, f);

        } else if (choice == 2) {
            System.out.print("введите температуру в F: ");
            double f = scanner.nextDouble();
            double c = (f - 32) * 5 / 9;
            System.out.printf("%.2f F = %.2f C", f, c);
        }
    }

}
