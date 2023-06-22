package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldFindSumSales() {
        StatsService service = new StatsService();

        int[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSum = 180;
        int actualSum = service.calculateSumSales(month);


        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void shouldFindAverageMonth() {
        StatsService service = new StatsService();
        int[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAverage = 15;
        int actualAverage = service.calculateAverageSales(month);
        Assertions.assertEquals(expectedAverage, actualAverage);
    }

    @Test
    public void shouldFindMaxSales() {
        StatsService service = new StatsService();
        int[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMaxSales = 8;
        int actualMaxSales = service.calculateMaxSales(month);
        Assertions.assertEquals(expectedMaxSales, actualMaxSales);
    }

    @Test
    public void shouldFindMinSales() {
        StatsService service = new StatsService();
        int[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMinSales = 9;
        int actualMinSales = service.calculateMinSales(month);
        Assertions.assertEquals(expectedMinSales, actualMinSales);
    }

    @Test
    public void shouldFindMaxAverage() {
        StatsService service = new StatsService();
        int[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMaxAverage = 5;
        int actualMaxAverage = service.calculateMaxAverage(month);
        Assertions.assertEquals(expectedMaxAverage, actualMaxAverage);
    }

    @Test
    public void shouldFindMinAverage() {
        StatsService service = new StatsService();
        int[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMinAverage = 5;
        int actualMinAverage = service.calculateMinAverage(month);
        Assertions.assertEquals(expectedMinAverage, actualMinAverage);
    }
}

