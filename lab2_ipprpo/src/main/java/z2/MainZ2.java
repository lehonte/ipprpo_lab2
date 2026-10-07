package z2;

import java.util.Scanner;

public class MainZ2 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите a и b: ");
        int a = scanner.nextInt();
        scanner.nextLine();
        int b = scanner.nextInt();
        scanner.nextLine();

        System.out.println("введите операцию (+ - * /): ");
        String op = scanner.nextLine();

        System.out.println("ответ: ");
        if (op.equals("+")) System.out.println(a+b);
        else if (op.equals("-")) System.out.println(a-b);
        else if (op.equals("*")) System.out.println(a*b);
        else if (op.equals("/")) System.out.println(a/b);

    }
}
