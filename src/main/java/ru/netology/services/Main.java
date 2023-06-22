package ru.netology.services;


public class Main {
    public static void main(String[] args) {

        // Сумма всех продаж в месяц
        int[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int sum = service.calculateSumSales(month);
        System.out.println("Сумма - " + sum);

        // Средняя сумма продаж в месяц

        int averageMonth = service.calculateAverageSales(month);
        System.out.println("Среднее значение - " + averageMonth);

        // Номер месяца, в котором был пик продаж

        int maxMonth = service.calculateMaxSales(month);
        System.out.println("Пик продаж - " + maxMonth);

        // Номер месяца, в котором был минимум продаж

        int minMonth = service.calculateMinSales(month);
        System.out.println("Минимум продаж - " + minMonth);

        // Количество месяцев больше среднего
        int maxAverage = service.calculateCountAboveAverage(month);
        System.out.println("Количество месяцев, в которых продажи были больше среднего - " + maxAverage);

        // Количество месяцев ниже среднего
        int minAverage = service.calculateCountBelowAverage(month);
        System.out.println("Количество месяцев, в которых продажи были ниже среднего - " + minAverage);


    }
}


// System.out.println("Месяца, когда были максимальные продажи");


