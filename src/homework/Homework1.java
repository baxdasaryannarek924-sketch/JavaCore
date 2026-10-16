package homework;

import java.sql.SQLOutput;

public class Homework1 {
    static void main() {
        int x = 10;
        int y = 20;
        if (x > y) {
            System.out.println("x > y");
        } else if (x == y) {
            System.out.println("x = y");
        } else {
            System.out.println("x < y");
        }

        System.out.println();

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        System.out.println();

        int a = 5;
        int b = 7;
        System.out.println(a + b);

        System.out.println();

        int n = 3;
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + n * i);
        }
    }
}
