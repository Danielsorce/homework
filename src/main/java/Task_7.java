public class Task_7 {
    /* Спортсмену нужно сбросить 7 кг. Рассчитайте:
    Сколько дней потребуется при потере 250 грамм в день
    Сколько дней потребуется при потере 500 грамм в день
    Среднее количество дней для похудения
    Выведите все три результата в консоль. */
    public static void main(String[] args) {
        short twoHundredGramInDay = 250;
        byte needToLost = 7;

        int convertInGram = needToLost * 1000;
        int workout200GramPerDay = convertInGram / twoHundredGramInDay;
        int workout500GramPerDay = convertInGram / (twoHundredGramInDay * 2);
        int averageDays1 = (workout200GramPerDay + workout500GramPerDay) / 2;
        
        System.out.println("При потере в 250 грамм в день уйдет " + workout200GramPerDay + " дней");
        System.out.println("При потере в 500 грамм в день уйдет " + workout500GramPerDay + " дней");
        System.out.println("Среднее количество " + averageDays1 + " день");
    }
}
