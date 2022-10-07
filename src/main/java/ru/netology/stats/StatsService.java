package ru.netology.stats;

public class StatsService {
    public int sum(int[] month) {
        int monthSum = 0;
        for (int i = 0; i < month.length; i++) {
            monthSum = monthSum + month[i];
        }
        //System.out.println("Сумма всех продаж " + monthSum);
        return monthSum;
    }

    public int medium(int[] month) {
        int monthSum = 0;
        for (int i = 0; i < month.length; i++) {
            monthSum = monthSum + month[i];
        }
        int monthMedium = monthSum / month.length;
        //System.out.println("Средняя сумма продаж в месяц " + monthMedium);
        return monthMedium;
    }

    public int max(int[] month) {
        int monthMax = month[0];
        int numberMonthMax = 0;
        for (int i = 0; i < month.length; i++) {
            if (monthMax <= month[i]) {
                monthMax = month[i];
                numberMonthMax = i + 1;
            } else {
                continue;
            }
        }
        //System.out.println("Месяц, в котором были максимальные продажи " + numberMonthMax);
        return numberMonthMax;
    }

    public int min(int[] month) {
        int monthMin = month[0];
        int numberMonthMin = 0;
        for (int i = 0; i < month.length; i++) {
            if (monthMin >= month[i]) {
                monthMin = month[i];
                numberMonthMin = i + 1;
            } else {
                continue;
            }
        }
        //System.out.println("Месяц, в котором были минимальные продажи " + numberMonthMin);
        return numberMonthMin;
    }

    public int underMedium(int month[], int medium) {
        int quantityMonthUnderMedium = 0;
        for (int i = 0; i < month.length; i++) {
            if (month[i] < medium) {
                quantityMonthUnderMedium++;
            } else {
                continue;
            }
        }
        //System.out.println("Количество месяцев, в которых продажи были меньше среднего " + quantityMonthUnderMedium);
        return quantityMonthUnderMedium;
    }

    public int overMedium(int month[], int medium) {
        int quantityMonthOverMedium = 0;
        for (int i = 0; i < month.length; i++) {
            if (month[i] > medium) {
                quantityMonthOverMedium++;
            } else {
                continue;
            }
        }
        //System.out.println("Количество месяцев, в которые продажи были выше среднего " + quantityMonthOverMedium);
        return quantityMonthOverMedium;
    }
}
