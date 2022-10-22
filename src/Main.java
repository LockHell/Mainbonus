public class Main {
    public static void main(String[] args) {
        int balance = 666;
        int cashflow = 1001;

        int ball;
        if (cashflow > 1000) {
            ball = 1;
        } else {
            ball = 0;
        }

        int bonus = cashflow / 100 * ball;


        System.out.println(" Итоговый баланс: " + (cashflow + balance + bonus));
        System.out.println(" Начисленный бонус: " + bonus);
    }
}