package ru.netology.javaqa;

import ru.netology.stats.*;

public class Main {
    public static void main(String[] args) {
        int[] month = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        StatsService service = new StatsService();

        int sumSaleMonth = service.sum(month);
        int mediumSaleMonth = service.medium(month);
        int maxSaleMonth = service.max(month);
        int minSaleMonth = service.min(month);
        int underMediumSaleMonth = service.underMedium(month);
        int overMediumSaleMonth = service.overMedium(month);
        System.out.println("Сумма всех продаж " + sumSaleMonth);
        System.out.println("Средняя сумма продаж в месяц " + mediumSaleMonth);
        System.out.println("Месяц, в котором были максимальные продажи " + maxSaleMonth);
        System.out.println("Месяц, в котором были минимальные продажи " + minSaleMonth);
        System.out.println("Количество месяцев, в которых продажи были меньше среднего " + underMediumSaleMonth);
        System.out.println("Количество месяцев, в которые продажи были выше среднего " + overMediumSaleMonth);

    }
}