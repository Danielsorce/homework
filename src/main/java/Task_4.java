public class Task_4 {
    /* Производительность бутылочного автомата Автомат производит 16 бутылок за 2 минуты. Рассчитайте:
    Производительность за 20 минут
    Производительность за сутки (1440 минут)
    Производительность за 3 дня
    Производительность за 1 месяц (30 дней) */
    public static void main(String[] args) {

        int bottlesPer2Minutes = 16,
                Minutes = 2,
                per20Minutes = 20,
                perDay = 1440,
                per3Days = 3,
                perMonth = 30;

        int bottlesPerMinute = bottlesPer2Minutes / Minutes;
        int bottlesPer20Minutes = bottlesPerMinute * per20Minutes;
        int bottlesPerDay = bottlesPerMinute * perDay;
        int bottlesPer3Days = bottlesPerMinute * (perDay * per3Days);
        int bottlesPerMonth = bottlesPerMinute * (perDay * perMonth);

        System.out.println("Производительность бутылочного завода:");
        System.out.println("В минуту: " + bottlesPerMinute);
        System.out.println("За " + per20Minutes + " минут: " + bottlesPer20Minutes);
        System.out.println("В сутки: "  + bottlesPerDay);
        System.out.println("За 3 дня: " + bottlesPer3Days);
        System.out.println("В месяц: " + bottlesPerMonth);
    }
}
