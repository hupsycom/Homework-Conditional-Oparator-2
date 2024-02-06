public class Main {
    public static void main(String[] args) {

        System.out.println("Задача №1");


        int clientOS = 1;
        if (clientOS == 1 ) {
            System.out.println("Вы пользуетесь IOS. Установите полную версию для IOS по ссылке: ... ");
        }else if (clientOS == 0 ) {
            System.out.println("Вы пользуетесь Android. Установите полную версию для Android по ссылке: ... ");
        }

        System.out.println("Задача №2");

        int clientOs = 1;
        int clientDeviceYear = 2015;
        if (clientOs == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите облегченную версию приложения для IOS по ссылке: ... ");
        }else if (clientOs == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке: ...");
        }

        System.out.println("Задача №3");

        int year = 2024;
        if (year < 1584) {
            System.out.println("Год должен быть больше 1584.");
        } else if (year % 400 == 0) {
            System.out.println(year + " год является високосным.");
        } else if (year % 100 == 0) {
            System.out.println(year + " год не является високосным.");
        } else if (year % 4 == 0) {
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

        int monthNumber = 5;
        switch (monthNumber) {
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
            case 5:
                System.out.println("Май");
                break;
            case 6:
                System.out.println("Июнь");
                break;
            case 7:
                System.out.println("Июль");
                break;
            case 8:
                System.out.println("Август");
                break;
            case 9:
                System.out.println("Сентабрь");
                break;
            case 10:
                System.out.println("Октябрь");
                break;
            case 11:
                System.out.println("Ноябрь");
                break;
            case 12:
                System.out.println("Декабрь");
        }



    }



}