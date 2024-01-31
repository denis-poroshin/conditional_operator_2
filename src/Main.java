public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1, 2");
        int clientOS = 1;
        int yearOfIssue = 2015;
        int myYearOfIssue = 2014;
        if (clientOS == 1){
            System.out.println("Установите версию приложения для Android по ссылке.");
            if (myYearOfIssue <= yearOfIssue){
                System.out.println("Установите облегченную версию приложения для Android по ссылке.");
            }
        }else if (clientOS == 0){
            System.out.println("Установите версию приложения для iOS по ссылке");
            if (myYearOfIssue <= yearOfIssue){
                System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
            }

            }
        System.out.println("Задание 3");
        int year = 2021;
        if (year % 4 == 0 || year % 400 == 0){
            System.out.println(year + " год является високосным");

        }else if (year % 100 == 0){
            System.out.println(year + " год не является високосным");

        }else{
            System.out.println(year + " год не является високосным");

        }
        System.out.println("Задание 4");
        int deliveryDistance = 95;
        int days;
        if (deliveryDistance <= 20){
            days = 1;
            System.out.println("Потребуется дней: " + days);
        }else if (deliveryDistance > 20 && deliveryDistance <= 60){
            days = 2;
            System.out.println("Потребуется дней: " + days);
        }else if (deliveryDistance > 60 && deliveryDistance <= 100){
            days = 3;
            System.out.println("Потребуется дней: " + days);
        }else{
            System.out.println("Доставки нет.");

        }
        System.out.println("Задание 4");
        int monthNumber = 5;
        switch (monthNumber){
            case 1:
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Зима");
                break;
            case 3:
                System.out.println("Весна");
                break;
            case 4:
                System.out.println("Весна");
                break;
            case 5:
                System.out.println("Весна");
                break;
            case 6:
                System.out.println("Лето");
                break;
            case 7:
                System.out.println("Лето");
                break;
            case 8:
                System.out.println("Лето");
                break;
            case 9:
                System.out.println("Осень");
                break;
            case 10:
                System.out.println("Осень");
                break;
            case 11:
                System.out.println("Осень");
                break;
            case 12:
                System.out.println("Зима");
                break;
            default:
                System.out.println("Нет такого времени года");
        }
        }

    }
