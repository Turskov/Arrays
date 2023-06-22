package ru.netology.services;


// Сумма всех продаж в месяц
public class StatsService {
    public int calculateSumSales(int[] month) {
        int sumSales = 0;
        for (int sale : month) {
            sumSales += sale;
        }
        return sumSales;
    }

    // Средняя сумма продаж в месяц
    public int calculateAverageSales(int[] month) {
        int sumSales = calculateSumSales(month);
        return sumSales / month.length;
    }

    // Номер месяца, в котором был пик продаж
    public int calculateMaxSales(int[] sales) {
        int maxMonth = 0;
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] > sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    // Номер месяца, в котором был минимум продаж
    public int calculateMinSales(int[] sales) {
        int minMonth = 0;
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] < sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    // Количество месяцев в котором продажи выше среднего
    public int calculateCountAboveAverage(int[] month) {
        int sumSales = calculateSumSales(month);
        int averageSales = sumSales / month.length;
        int countAboveAverage = 0;
        for (int sale : month) {
            if (sale > averageSales) {
                countAboveAverage++;
            }
        }
        return countAboveAverage;
    }

    // Количество месяцев в котором продажи ниже среднего
    public int calculateCountBelowAverage(int[] month) {
        int sumSales = calculateSumSales(month);
        int averageSales = sumSales / month.length;
        int countBelowAverage = 0;
        for (int sale : month) {
            if (sale < averageSales) {
                countBelowAverage++;
            }
        }
        return countBelowAverage;
    }
}
