public class Task_6 {
    /* Рассчитайте общий вес завтрака спортсмена в граммах и килограммах по рецепту:
    Бананы: 5 штук × 80 грамм
    Молоко: 200 мл (100 мл = 105 грамм)
    Мороженое: 2 брикета × 100 грамм
    Яйца: 4 штуки × 70 грамм */
    public static void main(String[] args) {

        byte bananas = 5;
        byte bananasGram = 80;
        byte milk100MlGram = 105;
        byte iceCreamBriquettes = 2;
        byte iceCreamBriquetteGram = 100;
        byte eggs = 4;
        byte eggGram = 70;

        double bananasAllGrams = bananas * bananasGram;
        double milkAllGrams = milk100MlGram * 2;
        double iceCreamAllGrams = iceCreamBriquetteGram * iceCreamBriquettes;
        double eggAllGrams = eggs * eggGram;
        double totalGrams = bananasAllGrams + milkAllGrams + iceCreamAllGrams + eggAllGrams;

        System.out.println("Вес бананов в граммах: " + bananasAllGrams);
        System.out.println("Вес молока в граммах: " + milkAllGrams);
        System.out.println("Вес яиц в граммах: " + eggAllGrams);
        System.out.println("Вес мороженного в граммах: " + iceCreamAllGrams);
        System.out.println("Общий вес в граммах: " + totalGrams);

        double bananasInKg = bananasAllGrams / 1000;
        double milkInKg = milkAllGrams / 1000;
        double iceCreamInKg = iceCreamAllGrams / 1000;
        double eggInKg = eggAllGrams / 1000;
        double totalInKg = bananasInKg + milkInKg + iceCreamInKg + eggInKg;

        System.out.println("Вес бананов в килограммах: " + bananasInKg);
        System.out.println("Вес молока в килограммах: " + milkInKg);
        System.out.println("Вес яиц в килограммах: " + eggInKg);
        System.out.println("Вес мороженного в килограммах: " + iceCreamInKg);
        System.out.println("Общий вес в килограммах: " + totalInKg);
    }
}