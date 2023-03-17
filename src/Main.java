public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
     int clientOS = 0;

     if(clientOS == 0) {
         System.out.println("Установите версию приложения для iOS по ссылке");
     } else if(clientOS == 1){
         System.out.println("Установите версию приложения для Android по ссылке");
     }
    }

    public static void task2() {

        int clientDeviceYear = 2015;
        int clientOS = 0;

        if(clientDeviceYear < 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientDeviceYear < 2015 && clientOS == 1) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientDeviceYear >= 2015 && clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if(clientDeviceYear >= 2015 && clientOS == 1){
                System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task3() {
        int year = 2023;
        int leapYear1 = year % 4;
        int leapYear2 = year % 400;
        int noLeapYear = year % 100;

        if(leapYear1 == 0 || leapYear2 == 0 && noLeapYear != 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void task4() {
        int deliveryDistance = 95;
        int timeDelivery = 1;

        if(deliveryDistance >= 20) {
            timeDelivery++;
        }
        if(deliveryDistance >= 60) {
            timeDelivery++;
        }
        if(deliveryDistance >= 100) {
            System.out.println("Свыше 100 км доставки нет");
        } else System.out.println("Потребуется дней: " + timeDelivery);
    }

    public static void task5() {
        int monthNumber = 12;

            switch (monthNumber) {
                case 12, 1, 2:
                    System.out.println("Зима");
                    break;
                case 3, 4, 5:
                    System.out.println("Весна");
                    break;
                case 6, 7, 8:
                    System.out.println("Лето");
                    break;
                case 9, 10, 11:
                    System.out.println("Осень");
                    break;
                default: System.out.println("Введен некорректный месяц");
            }

    }
}