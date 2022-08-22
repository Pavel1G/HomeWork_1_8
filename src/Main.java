import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task01();
        task02();
        task03();
    }

    public static void task01() {
        int year = 2000;
        System.out.println(checkLeapYear(year));
    }

    public static String checkLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return year + " - высокосный год.";
        } else {
            return year + " - не высокосный год.";
        }
    }

    public static void task02() {
        int clientOS = 0;
        int clientDeviceYear = 2020;

        System.out.println(checkInstallOS(clientOS, clientDeviceYear));
    }

    public static String checkInstallOS(int clientOs, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();

        if (clientOs == 0 && clientDeviceYear == currentYear) {
            return "Установите версию приложения для iOS по ссылке";
        } else if (clientOs == 0 && clientDeviceYear < currentYear) {
            return "Установите облегченную версию приложения для iOS по ссылке";
        } else if (clientOs == 1 && clientDeviceYear == currentYear) {
            return "Установите версию приложения для Android по ссылке";
        } else if (clientOs == 1 && clientDeviceYear < currentYear) {
            return "Установите облегченную версию приложения для Android по ссылке";
        }
        return "Неверно введены данные";
    }

    public static void task03() {
        int distance = 88;
        System.out.println("На доставку потребуется - " + checkDeliveryPeriod(distance) + " дня(-ей).");
    }

    public static String checkDeliveryPeriod(int distance) {
        int deliveryDays = 0;

        if (distance <= 20) {
            deliveryDays++;
        } else if (distance > 20 && distance <= 60) {
            deliveryDays = deliveryDays + 2;
        } else if (distance > 60 && distance <= 100) {
            deliveryDays = deliveryDays + 3;
        }

        return String.valueOf(deliveryDays);
    }
}