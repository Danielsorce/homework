public class Task_3 {
    /* Людмила Павловна: 23 ученика
    Анна Сергеевна: 27 учеников
    Екатерина Андреевна: 30 учеников
    Они вместе закупили 480 листов бумаги. Рассчитайте, сколько листов достанется каждому ученику. */
    public static void main(String[] args) {

        short LP = 23,
                AS = 27,
                EA = 30,
                allPaper = 480;

        int paperForAllSchoolboys = (allPaper / (LP + AS + EA));

        System.out.println("На каждого ученика рассчитано " + paperForAllSchoolboys + " листов бумаги");
    }

}
