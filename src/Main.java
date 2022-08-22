import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task01();
        task02();
        task03();
        task04();
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

    public static void task04() {
        System.out.println("Средняя сумма трат за месяц составила " + calcAverageAmount() + " рублей.");
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {

            arr[i] = random.nextInt(40_000) + 10_000;

        }
        return arr;
    }

    public static String calcAverageAmount() {
        int[] arr = generateRandomArray();
        int total = 0;

        for (int sum : arr) {
            total += sum;
        }

        return String.valueOf((float) total / arr.length);
    }
}