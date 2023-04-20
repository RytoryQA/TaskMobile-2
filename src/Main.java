// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int unit = 1;
        int step = 100;
        int balance = 10;
        int deposit = 800;
        int bonus;
        int amound;
        if (deposit > 1000) {
            bonus = deposit / step;
            amound = balance + deposit + bonus;
        } else {
            bonus = 0;
            amound = balance + deposit + bonus;
        }
        System.out.println("Бонусов начислено: " + bonus);
        System.out.println("Итоговая сумма: " + amound);
    }
}