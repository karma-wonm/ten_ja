import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {
    @Test
    void SumSaleMonth() {
        StatsService service = new StatsService();
        int[] month = {
                10, 19, 15, 10, 13, 17
        };
        int actual = 84;
        int expected = service.sum(month);
        assertEquals(expected, actual);
    }

    @Test
    void MediumSaleMonth() {
        StatsService service = new StatsService();
        int[] month = {
                10, 19, 15, 10, 13, 17
        };
        int actual = 14;
        int expected = service.medium(month);
        assertEquals(expected, actual);

    }

    @Test
    void MaxSaleMonth() {
        StatsService service = new StatsService();
        int[] month = {
                10, 19, 15, 10, 13, 17
        };
        int actual = 2;
        int expected = service.max(month);
        assertEquals(expected, actual);
    }

    @Test
    void MinSaleMonth() {
        StatsService service = new StatsService();
        int[] month = {
                10, 19, 15, 10, 13, 17
        };
        int actual = 4;
        int expected = service.min(month);
        assertEquals(expected, actual);
    }

    @Test
    void underMediumSaleMonth() {
        StatsService service = new StatsService();

        int[] month = {
                10, 19, 15, 10, 13, 17
        };
                int actual = 3;
        int expected = service.underMedium(month);
        assertEquals(expected, actual);
    }

    @Test
    void overMediumSaleMonth() {
        StatsService service = new StatsService();
        int[] month = {
                10, 19, 15, 10, 13, 17
        };
        int actual = 3;
        int expected = service.overMedium(month);
        assertEquals(expected, actual);
    }
}
