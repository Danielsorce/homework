public class Task_6 {
    /* Рассчитайте общий вес завтрака спортсмена в граммах и килограммах по рецепту:
    Бананы: 5 штук × 80 грамм
    Молоко: 200 мл (100 мл = 105 грамм)
    Мороженое: 2 брикета × 100 грамм
    Яйца: 4 штуки × 70 грамм */
    public static void main(String[] args) {

        byte Bananas = 5;
        byte iceCreamBriquettes = 2;
        byte Eggs = 4;
        byte bananasGram = 80;
        byte milk100MlGram = 105;
        byte iceCreamBriquetteGram = 100;
        byte EggGram = 70;

        double bananasAllGrams = Bananas * bananasGram;
        double milkAllGrams = milk100MlGram * 2;
        double iceCreamAllGrams = iceCreamBriquetteGram * iceCreamBriquettes;
        double  EggAllGrams = Eggs * EggGram;

        System.out.println("Общая пищевая ценность в граммах: ");

        double[] allNutritionalValueInGram = {bananasAllGrams, milkAllGrams, iceCreamAllGrams, EggAllGrams};
        for (double x : allNutritionalValueInGram) {
            System.out.println(x + " грамм.");
        }

        double bananasInKg =  bananasAllGrams / 1000;
        double milkInKg = milkAllGrams / 1000;
        double iceCreamInKg = iceCreamAllGrams / 1000;
        double EggInKg = EggAllGrams / 1000;

        System.out.println("Общая пищевая ценность в килограммах:");

        double[] allNutritionalValueInKg = {bananasInKg, milkInKg, iceCreamInKg, EggInKg};
        for (double x : allNutritionalValueInKg) {
            System.out.println(x + " кг.");
        }
    }
}