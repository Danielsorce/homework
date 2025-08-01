public class Task_3 {
    /* Людмила Павловна: 23 ученика
    Анна Сергеевна: 27 учеников
    Екатерина Андреевна: 30 учеников
    Они вместе закупили 480 листов бумаги. Рассчитайте, сколько листов достанется каждому ученику. */
    public static void main(String[] args) {

        byte ludmilaPavlovna = 23;
        byte annaSergeevna = 27;
        byte ekaterinaAndreevna = 30;
        short paperBought = 480;

        int paperForAllSchoolboys = (paperBought / (ludmilaPavlovna + annaSergeevna + ekaterinaAndreevna));

        System.out.println("На каждого ученика рассчитано " + paperForAllSchoolboys + " листов бумаги");
    }

}
