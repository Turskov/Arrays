package ru.netology.services;

// Сумма всех продаж в месяц
public class StatsService {
    public int calculateSumSales(int[] month) {
        int sumSales = 0;
        for (int i = 0; i < month.length; i++) {
            sumSales = sumSales + month[i];
        }
        return sumSales;

    }

    // Средняя сумма продаж в месяц
    public int calculateAverageSales(int[] month) {
        int sumSales = 0;
        for (int i = 0; i < month.length; i++) {
            sumSales = sumSales + month[i];
        }
        int averageSales = sumSales / month.length;
        return averageSales;

    }

    // Номер месяца, в котором был пик продаж
    public int calculateMaxSales(int[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    // Номер месяца, в котором был минимум продаж
    public int calculateMinSales(int[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    // Количество месяцев в котором продажи выше среднего
    public int calculateMaxAverage(int[] month) {
        int sumSales = 0;
        int maxAverage = 0;

        for (int i = 0; i < month.length; i++) {
            sumSales = sumSales + month[i];
        }
        double averageSales = (double) sumSales / month.length;

        for (int numberMaxAverage : month) {
            if (numberMaxAverage > averageSales) {
                maxAverage++;

            }
        }
        return maxAverage;
    }

    // Количество месяцев в котором продажи выше среднего
    public int calculateMinAverage(int[] month) {
        int sumSales = 0;
        int minAverage = 0;

        for (int i = 0; i < month.length; i++) {
            sumSales = sumSales + month[i];
        }
        double averageSales = (double) sumSales / month.length;

        for (int numberMinAverage : month) {
            if (numberMinAverage < averageSales) {
                minAverage++;

            }
        }
        return minAverage;
    }
}


