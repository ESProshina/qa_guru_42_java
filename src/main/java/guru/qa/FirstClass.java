package guru.qa;

public class FirstClass {
    public static void main(String[] args) {
        // 0) Арифметика с int
        int a = 10;
        int b = 3;
        System.out.println("10 + 3 = " + (a + b));
        System.out.println("10 - 3 = " + (a - b));
        System.out.println("10 * 3 = " + (a * b));
        System.out.println("10 / 3 = " + (a / b));

        // 1) Смешанные операции int + double
        int c = 5;
        double d = 2.0;
        System.out.println("5 + 2.0 = " + (c + d));   // 7.0
        System.out.println("5 - 2.0 = " + (c - d));   // 3.0
        System.out.println("5 * 2.0 = " + (c * d));   // 10.0
        System.out.println("5 / 2.0 = " + (c / d));   // 2.5 (вещественное)

        // 2) Логические операции сравнения
        int x = 7;
        int y = 10;
        System.out.println("x < y  = " + (x < y));   // true
        System.out.println("x > y  = " + (x > y));   // false
        System.out.println("x >= 7 = " + (x >= 7));  // true
        System.out.println("y <= 9 = " + (y <= 9));  // false

        // 4) Переполнение int
        int max = Integer.MAX_VALUE; // 2_147_483_647
        System.out.println("MAX + 1 = " + (max + 1)); // -2147483648 (переполнение)
        System.out.println("MAX * 2 = " + (max * 2)); // -2 (переполнение)
    }
}