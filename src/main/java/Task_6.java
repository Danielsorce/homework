public class Task_6 {
    /* Рассчитайте общий вес завтрака спортсмена в граммах и килограммах по рецепту:
    Бананы: 5 штук × 80 грамм
    Молоко: 200 мл (100 мл = 105 грамм)
    Мороженое: 2 брикета × 100 грамм
    Яйца: 4 штуки × 70 грамм */
    public static void main(String[] args) {

        int Bananas = 5,
                iceCreamBriquettes = 2,
                Eggs = 4;
        double bananasGram = 80,
                milk100MlGram = 105,
                iceCreamBriquetteGram = 100,
                EggGram = 70;

        double bananasAllGrams = Bananas * bananasGram;
        double milkAllGrams = milk100MlGram * 2;
        double iceCreamAllGrams = iceCreamBriquetteGram * iceCreamBriquettes;
        double  EggAllGrams = Eggs * EggGram;

        System.out.println("Общая пищевая ценность в граммах: ");

        double[] beer = {bananasAllGrams, milkAllGrams, iceCreamAllGrams, EggAllGrams};
        for (double x : beer) {
            System.out.println(x + " грамм.");
        }

        double bananasInKg =  bananasAllGrams / 1000;
        double milkInKg = milkAllGrams / 1000;
        double iceCreamInKg = iceCreamAllGrams / 1000;
        double EggInKg = EggAllGrams / 1000;

        System.out.println("Общая пищевая ценность в килограммах:");

        double[] wine = {bananasInKg, milkInKg, iceCreamInKg, EggInKg};
        for (double x : wine) {
            System.out.println(x + " кг.");
        }
    }
}