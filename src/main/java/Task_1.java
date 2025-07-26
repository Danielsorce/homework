public class Task_1 {
    /*Объявите переменные всех примитивных типов Java:
    Выведите значения этих переменных в консоль */

    public static void main(String[] args) {
        int numberInteger = 23; // от -2 147 483 648 до 2 147 483 647
        byte numberByte = -128; // от -128 до 127
        short numberShort = 32767; // от -32 768 до 32 767
        long numberLong = 3443454434421L; // от -9 223 372 036 854 775 808 до 9 223 372 036 854 807
        float numberFloat = 37.21F; // от -3.4E+38 до 3.4E+38
        double numberDouble = 344.43; // от -1.7E+308 до -1.7E+308
        char numberChar = 'A'; // 16-разрядные символы Unicode
        boolean numberBoolean = true; // true или false вот в чем вопрос

        System.out.println("Значение переменной с типом данных int равно " + numberInteger);
        System.out.println("Значение переменной с типом данных byte равно " + numberByte);
        System.out.println("Значение переменной с типом данных short равно " + numberShort);
        System.out.println("Значение переменной с типом данных long равно " + numberLong);
        System.out.println("Значение переменной с типом данных float равно " + numberFloat);
        System.out.println("Значение переменной с типом данных double равно " + numberDouble);
        System.out.println("Значение переменной с типом данных char равно " + numberChar);
        System.out.println("Значение переменной с типом данных boolean равно " + numberBoolean);
    }
}
