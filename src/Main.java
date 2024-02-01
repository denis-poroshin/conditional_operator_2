public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        int clientOS = 1;
        if (clientOS == 1){
            System.out.println("Установите версию приложения для Android по ссылке.");

        }else if (clientOS == 0){
            System.out.println("Установите версию приложения для iOS по ссылке");

            }
        System.out.println("Задание 2"); // Поначалу думал, что нужно объеденить задание 1 и 2 =)
        int yearOfIssue = 2015;
        int myYearOfIssue = 2014;
        if (clientOS == 1 && myYearOfIssue <= yearOfIssue) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");

        }else if (clientOS == 1 && myYearOfIssue > yearOfIssue) {
            System.out.println("Установите версию приложения для Android по ссылке.");

        }else if (clientOS == 0 && myYearOfIssue <= yearOfIssue) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");

        }else if (clientOS == 0 && myYearOfIssue > yearOfIssue) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        System.out.println("Задание 3");

        int year = 1700;
        if ((year % 4 == 0 && year % 100 != 0 && year > 1584) || (year % 400 == 0 && year > 1584)){
            System.out.println(year + " год является високосным");

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
        System.out.println("Задание 5"); // Не знал, что в кейсы можно записывать несколько значений =)
        int monthNumber = 3;
        switch (monthNumber){
            case 1, 2, 12:
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
            default:
                System.out.println("Нет такого времени года");
        }
        }

    }
