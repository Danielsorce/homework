public class Task_1 {
    /*Объявите переменные всех примитивных типов Java:
    Выведите значения этих переменных в консоль */

    public static void main(String[] args) {

        int numberInteger; // от -2 147 483 648 до 2 147 483 647
        byte numberByte; // от -128 до 127
        short numberShort; // от -32 768 до 32 767
        long numberLong; // от -9 223 372 036 854 775 808 до 9 223 372 036 854 807
        float numberFloat; // от -3.4E+38 до 3.4E+38
        double numberDouble; // от -1.7E+308 до -1.7E+308
        char numberChar; // 16-разрядные символы Unicode
        boolean numberBoolean; // true или false вот в чем вопрос

        System.out.println("Значение переменной numberInteger с типом данных int равно " + 23);
        System.out.println("Значение переменной numberByte с типом данных byte равно " + -128);
        System.out.println("Значение переменной numberShort с типом данных short равно " + 32767);
        System.out.println("Значение переменной numberLong с типом данных long равно " + 3443L);
        System.out.println("Значение переменной numberFloat с типом данных float равно " + 37.21F);
        System.out.println("Значение переменной numberDouble с типом данных double равно " + 344.43);
        System.out.println("Значение переменной numberChar с типом данных char равно " + 'A');
        System.out.println("Значение переменной numberBoolean с типом данных boolean равно " + false);
    }
}
