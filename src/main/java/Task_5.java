public class Task_5 {
    /* На ремонт школы купили 120 банок краски двух цветов. На один класс требуется:
    2 банки белой краски
    4 банки коричневой краски
    Рассчитайте:
    Сколько всего классов в школе
    Сколько банок каждого цвета было куплено*/
    public static void main(String[] args) {

        int canWhiteColor = 2,
                canBrownMonster = 4;

        int classrooms = 120 / (canWhiteColor + canBrownMonster);
        int allCansWhiteColor = canWhiteColor * classrooms;
        int allCansBrownMonster = canBrownMonster * classrooms;

        System.out.println("В школе, где "+ classrooms + " классов, нужно " + allCansWhiteColor +
                " банок белой краски и " + allCansBrownMonster + " банок коричневой краски");
    }
}
