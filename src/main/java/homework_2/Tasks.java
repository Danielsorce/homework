package homework_2;

import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Задача 1. Проверка совершеннолетия
        int ageHuman = 22;

        int humanAdultery = 18;

        if  (ageHuman >= humanAdultery) {
            System.out.println("Вы совершеннолетний");
        } else {
            System.out.println("Вы не достигли совершеннолетия, нужно немного подождать");
        }

        // Задача 2. Рекомендация по одежде
        int temperatureHat = 23;

        int temperatureDown = 5;

        if (temperatureHat <= temperatureDown) {
            System.out.println("На улице "+ temperatureHat + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperatureHat + " градусов, можно идти без шапки");
        }

        //Задача 3. Проверка скорости
        int currentSpeed = 80;

        int maxSpeed = 60;

        if (currentSpeed <= maxSpeed) {
            System.out.println("Скорость " + currentSpeed + " можно ездить спокойно");
        } else if (currentSpeed > maxSpeed) {
            System.out.println("Скорость " + currentSpeed + " придется заплатить штраф");
        }

        //Задача 4. Определение учебного заведения
        int ageHumanWalk = 22;

        int humanKid = 6;
        int humanTeenager = 17;
        int humanAdult = 24;
        int humanOldAdult = 25;

        if (ageHumanWalk <= humanKid) {
            System.out.println("Ваш возраст " + ageHumanWalk + " вам нужно ходить в детский сад");
        } else if (ageHumanWalk > humanKid && ageHumanWalk <= humanTeenager) {
            System.out.println("Ваш возраст " + ageHumanWalk + " вам нужно ходить в школу");
        } else if (ageHumanWalk > humanTeenager && ageHumanWalk <= humanAdult) {
            System.out.println("Ваш возраст " + ageHumanWalk + " вам нужно ходить в университет");
        } else if (ageHumanWalk > humanOldAdult) {
            System.out.println("Ваш возраст " + ageHumanWalk + " вам нужно ходить на работу");
        }

        //Задача 5. Ограничения на аттракционе
        int childAge = 12;

        if  (childAge < 5) {
            System.out.println("Возраст ребёнка " + childAge + " ему нельзя кататься");
        } else if (childAge >= 5 & childAge < 14) {
            System.out.println("Возраст ребёнка " + childAge + " ему можно кататься но с сопровождением");
        } else {
            System.out.println("Возраст ребёнка " + childAge + " ему можно кататься без сопровождения");
        }

        //Задача 6. Места в вагоне
        int passengers = 52;

        int standingPlaces = 60;
        int sitingSeats = 42;

        if (passengers < sitingSeats) {
            System.out.println("Есть сидячие места");
        } else if (passengers > sitingSeats & passengers < sitingSeats + standingPlaces) {
            System.out.println("Нет сидячих мест, остались только стоячие места");
        } else if (passengers >= sitingSeats + standingPlaces) {
            System.out.println("Вагон полон");
        }

        //Задача 7. Нахождение максимального числа
        int one = 4;
        int two = 6;
        int three = 10;

        int max = one;

        if (two > max) {
            max = two;
        }

        if (three > max) {
            max = three;
        }

        System.out.println("Наибольшее число: " + max);

        //Задача 8. Рекомендация мобильного приложения +
        //Задача 9. Рекомендация мобильного приложения
        System.out.println("Введите вашу ОС (0-iOS, 1-Android)");
        int clientOS = input.nextInt();

        System.out.println("Введите год вашего устройства");
        int clientDeviceYear =  input.nextInt();

        if (clientDeviceYear < 2015) {
            switch (clientOS) {
                case 0:
                    System.out.println("Установите облегченную версию приложения для [IOS] по ссылке");
                    break;
                case 1:
                    System.out.println("Установите облегченную версию приложения для [Android] по ссылке");
                    break;
                default:
                    System.out.println("Приложение не поддерживается на вашей ОС");
            }
        } else if (clientDeviceYear >= 2015) {
            switch (clientOS) {
                case 0:
                    System.out.println("Установите версию приложения для [IOS] по ссылке");
                    break;
                case 1:
                    System.out.println("Установите версию приложения для [Android] по ссылке");
                    break;
                default:
                    System.out.println("Приложение не поддерживается на вашей ОС");
            }
        }

        //Задача 10. Определение високосного года
        int year = 2025;

        if (year % 400 == 0) {
            System.out.println(year + " год високосный");
        } else if (year % 100 == 0) {
            System.out.println(year + " год невисокосный");
        } else if (year % 4 == 0) {
            System.out.println(year + " год високосный");
        } else  {
            System.out.println(year + " год невисокосный");
        }

        // Дополнительное задание
        System.out.println("Введите месяц");
        int monthNumber = input.nextInt();

        input.close();

        String season;

        switch (monthNumber) {
            case 1, 2, 12:
                season = "Зима";
                System.out.println(monthNumber + " месяц принадлежит к сезону " +  season);
                break;
            case 3 , 4 , 5:
                season = "Весна";
                System.out.println(monthNumber + " месяц принадлежит к сезону " +  season);
                break;
            case 6, 7 ,8:
                season = "Лето";
                System.out.println(monthNumber + " месяц принадлежит к сезону " +  season);
                break;
            case 9, 10 , 11:
                season = "Осень";
                System.out.println(monthNumber + " месяц принадлежит к сезону " +  season);
                break;
            default:
                System.out.println("Нет такого месяца");
        }
    }
}
