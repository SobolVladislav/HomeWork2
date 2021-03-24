public class HomeWork2 {

    /**
     * Домашнее задание №2
     * Соболь Владислав
     */

    public static void main(String[] args) {

        System.out.println(chekNumbers10in20(2, 10));
        checkTheNumber(-1);
        System.out.println(checkTheNumberAgan(2));
        cyclicalPrinting("я сам это сделал)) это моя маленькая победа))", 2);
        // *доп задание
        leapYear(2300);
    }

    // the task 1

    public static boolean chekNumbers10in20(int a, int b) {
        int c = a + b;
        if (c >= 10 && c <= 20) {
            return true;
        } else {
            return false;
        }
    }

    // the task 2

    public static void checkTheNumber(int a) {
        if (a >= 0) {
            System.out.println("число положительное");
        } else {
            System.out.println("число отрицательное");
        }
    }

    //the task 3

    public static boolean checkTheNumberAgan(int x) {
        if (x >= 0) {
            return false;
        } else {
            return true;
        }
    }

    //the task 4

    public static void cyclicalPrinting(String text, int number_of_cycles) {
        for (int a = 1; a <= number_of_cycles; a++) {
            System.out.println(a + " " + text);
        }
    }

    // the task 5

    /**
     * задание реально что бы сломать голову)
     */

    public static void leapYear(int a) {
        if (a % 4 == 0 && !(a == 100) && a % 400 == 0) {
        System.out.println("Год весокосный");}
        else {
        System.out.println("Год не весокосный");

        }
    }
}