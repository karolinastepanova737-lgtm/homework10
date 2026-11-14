import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        // Задача 1
        printLeapYearStatus(2021);
        printLeapYearStatus(2024);

        // Задача 2
        suggestAppVersion(0, 2015);
        suggestAppVersion(1, 2026);

        // Задача 3
        int deliveryDistance = 95;
        int deliveryDays = calculateDeliveryDays(deliveryDistance);
        if (deliveryDays != -1) {
            System.out.println("Потребуется дней: " + deliveryDays);
        } else {
            System.out.println("Доставка не осуществляется");
        }
    }

    // Метод для Задачи 1
    public static void printLeapYearStatus(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }

    // Метод для Задачи 2
    public static void suggestAppVersion(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();

        if (clientOS == 0 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Неизвестная операционная система");
        }
    }

    // Метод для Задачи 3
    public static int calculateDeliveryDays(int distance) {
        if (distance > 100) {
            return -1; // Маркер того, что доставки нет
        }
        int days = 1;
        if (distance > 20) {
            days++;
        }
        if (distance > 60) {
            days++;
        }
        return days;
    }
}
