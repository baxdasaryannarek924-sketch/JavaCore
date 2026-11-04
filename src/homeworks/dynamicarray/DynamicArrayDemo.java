package homeworks.dynamicarray;

public class DynamicArrayDemo {

        public static void main(String[] args) {

            DynamicArray da = new DynamicArray();

            // Թեստ 1 — Ավելացնել 5 էլեմենտ
            System.out.println("Test 1:");

            da.add(5);
            da.add(10);
            da.add(15);
            da.add(20);
            da.add(25);

            da.print();

            // Թեստ 2 — Ավելացնել ևս 10 էլեմենտ
            System.out.println("Test 2:");

            for (int i = 6; i <= 15; i++) {
                da.add(i * 5);
            }

            da.print();

            // Թեստ 3 — Ավելացնել ևս 10 էլեմենտ
            System.out.println("Test 3:");

            for (int i = 16; i <= 25; i++) {
                da.add(i * 5);
            }

            da.print();

            // Թեստ 4 — Ստանալ էլեմենտներն ըստ ինդեքսի
            System.out.println("Test 4:");

            System.out.println("First element: " + da.getByIndex(0));

            System.out.println("Last element: " + da.getByIndex(24));

            System.out.println("Negative index: " + da.getByIndex(-1));

            System.out.println("Invalid index: " + da.getByIndex(100));

            // Թեստ 5 — Ստուգել դատարկ զանգվածը
            System.out.println("Test 5:");

            DynamicArray emptyArray = new DynamicArray();

            System.out.println(emptyArray.getByIndex(0));
        }
    }

