package homework3;

public class task {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }

    private static void task1() {
        System.out.println("Задача 1. Вывод чисел от 1 до 10");

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    private static void task2() {
        System.out.println("Задача 2. Сумма четных чисел");

        int num = 1;
        int sum = 0;

        while (num <= 100) {
            if (num % 2 == 0) {
                sum += num;
            }
            num++;
        }
        System.out.println(sum);
    }

    private static void task3() {
        System.out.println("Задача 3. Обратный отсчет");

        int num2 = 10;

        do {
            num2--;
        } while (num2 > 1);

        System.out.println(num2);

    }

    private static void task4() {
        System.out.println("Задача 4. Таблица умножения");

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print((i * j) + " ");
            }
            System.out.println();
        }
    }

    private static void task5() {
        System.out.println("Задача 5. Поиск простых чисел");

        for (int i = 2; i <= 50; i++) {
            boolean isPrime = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print((i) + " ");
            }
        }
        System.out.println();
    }

    private static void task6() {
        System.out.println("Задача 6. Рисуем треугольник");

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void task7() {
        System.out.println("Задача 7. Факториал числа");

        int factorial = 1;
        for (int i = 1; i <= 7; i++) {
            factorial *= i;
        }
        System.out.println("Факториал 7: " + factorial);
    }

    private static void task8() {
        System.out.println("Задача 8. Поиск делителей");

        int number = 36;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    private static void task9() {
        System.out.println("Задача 9. Числа Фибоначчи");

        int num = 10;
        int a = 0;
        int b = 1;

        for (int i = 1; i <= num; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }

    private static void task10() {
        System.out.println("Задача 10. Шахматная доска");

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("#");
                } else  {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
