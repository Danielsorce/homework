public class Task_8 {
    /* Для трех сотрудников:
    Маша: 67 760 рублей
    Денис: 83 690 рублей
    Кристина: 76 230 рублей
    Рассчитайте:
    Новую зарплату после повышения на 10%
    Разницу в годовом доходе до и после повышения */
    public static void main(String[] args) {

        int mashaSalary = 67760;
        int denisSalary = 83690;
        int christineSalary = 76230;
        double percentageUp = 0.10;

        double mashaSalaryUp = mashaSalary * percentageUp;
        double mashaNewSalary = mashaSalary + mashaSalaryUp;
        double denisSalaryUp = denisSalary * percentageUp;
        double denisNewSalary = denisSalary + denisSalaryUp;
        double christineSalaryUp = christineSalary * percentageUp;
        double christineNewSalary = christineSalary + christineSalaryUp;

        double mashaYearSalaryUp = (mashaNewSalary - mashaSalary) * 12;
        double denisYearSalaryUp = (denisNewSalary - denisSalary) * 12;
        double christineYearSalaryUp = (christineNewSalary - christineSalary) * 12;

        System.out.println("Маша теперь получает "+ mashaNewSalary + " рублей. Годовой доход вырос на "  + mashaYearSalaryUp + "рублей");
        System.out.println("Денис теперь получает "+ denisNewSalary + " рублей. Годовой доход вырос на "  + denisYearSalaryUp + "рублей");
        System.out.println("Кристина теперь получает "+ christineNewSalary + " рублей. Годовой доход вырос на "  + christineYearSalaryUp + "рублей");
    }
}
