public class Main {
    public static void main(String[] args) {

        System.out.println("Задача №1");


        int clientOS = 0;
        if (clientOS == 1 ) {
            System.out.println("Вы пользуетесь IOS. Установите полную версию для IOS по ссылке: ... ");
        }else if (clientOS == 0 ) {
            System.out.println("Вы пользуетесь Android. Установите полную версию для Android по ссылке: ... ");
        }

        System.out.println("Задача №2");

        int clientOs = 0;
        int clientDeviceYear = 2015;
        if (clientOs == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для IOS по ссылке: ... ");
        }else if (clientOs == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке: ...");
        }else if (clientOs == 1 && clientDeviceYear > 2015) {
            System.out.println("Установите полную версию приложения для IOS по ссылке: ...");
        }else{
            System.out.println("Установите полную версию приложения для Android по ссылке: ...");
        }

        System.out.println("Задача №3");

        int year = 2008;
        if (year % 400 == 0 || year % 4 == 0 || year % 100 == 0) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }

        System.out.println("Задача №4");

        int deliveryDistance = 19;
        int deliveryDays = 1;
        if (deliveryDistance < 20) {
            System.out.println("Для доставки потребуется " + deliveryDays + " день.");
        } else if (deliveryDistance >= 20 && deliveryDistance <= 60) {
            System.out.println("Для доставки потребуется " + (deliveryDays + 1) + " дня.");
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Для доставки потребуется " + (deliveryDays + 2) + " дня.");
        } else {
            System.out.println("Доставки нет. ");
        }

        System.out.println("Задача №5");

        int monthNumber = 13;
        switch (monthNumber) {
            case 1: case 2: case 12:
                System.out.println("Зима");
                break;
            case 3: case 4 : case 5:
                System.out.println("Весна");
                break;
            case 6: case 7: case 8:
                System.out.println("Лето");
                break;
            case 9: case 10: case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует...");
        }



    }



}