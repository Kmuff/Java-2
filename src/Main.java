public class Main {
    public static void main(String[] args) {
        System.out.println("Личный кабинет");
        int ticket = 13_600;
        System.out.println("Стоимость билета: " + ticket + " руб.");
        int oneMiles = 20;
        int bonusMiles = ticket / oneMiles;
        System.out.println("Количество ваших бонусов:" + bonusMiles);
    }
}
