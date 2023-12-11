package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

// class VacationServiceTest {
//  @Test
//   public void testCalculateCondition1 () {
//       VacationService service = new VacationService();
//       int actual = service.calculate (10_000, 3000, 20_000);
// int expected = 3;

//       Assertions.assertEquals (expected, actual);
//   }
//   @Test
//    public void testCalculateCondition2 () {
//       VacationService service = new VacationService();
//       int actual = service.calculate(100_000, 60_000, 150_000);
//      int expected = 2;
//       Assertions.assertEquals(expected, actual);
//   }

class VacationServiceTest {
    @ParameterizedTest
    @CsvSource({
            "100000, 60000, 150000, 2",
            "10000, 3000, 20000, 3"
    })
    public void testCalculateCondition(int income, int expenses, int threshold, int expected) {
        VacationService service = new VacationService();

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }

}

