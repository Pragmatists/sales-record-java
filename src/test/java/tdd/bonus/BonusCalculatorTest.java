package tdd.bonus;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BonusCalculatorTest {

    @Test
    void no_bonus_when_sales_equal_quota() {
        SalesRecord salesRecord = aSalesRecord(10000);

        salesRecord.registerSale(10000);

        assertThat(salesRecord.calculateBonus()).isEqualTo(0);
    }
    @Test
    void bonus_when_sales_grater_that_quota() {
        SalesRecord salesRecord = aSalesRecord(10000);

        salesRecord.registerSale(12000);

        assertThat(salesRecord.calculateBonus()).isEqualTo(2000);
    }

    @Test
    void no_bonus_when_sales_less_then_quota() {
        SalesRecord salesRecord = aSalesRecord(10000);

        salesRecord.registerSale(6000);

        assertThat(salesRecord.calculateBonus()).isEqualTo(0);
    }

    @Test
    void bonus_value_depend_on_commission() {
        SalesRecord salesRecord = aSalesRecord(10000, 50);

        salesRecord.registerSale(12000);

        assertThat(salesRecord.calculateBonus()).isEqualTo(1000);
    }

    @Test
    void tax_is_applied_on_bonus_value() {
        SalesRecord salesRecord = aSalesRecord(10000, 50, 10);

        salesRecord.registerSale(12000);

        assertThat(salesRecord.calculateBonus()).isEqualTo(900);
    }

    @Test
    void bonus_is_calculated_on_sum_of_sales() {
        SalesRecord salesRecord = aSalesRecord(10000);

        salesRecord.registerSale(5000);
        salesRecord.registerSale(6000);

        assertThat(salesRecord.calculateBonus()).isEqualTo(1000);
    }

    private SalesRecord aSalesRecord(int quota, int commission, int tax) {
        return new SalesRecord(quota, commission, tax);
    }

    private SalesRecord aSalesRecord(int quota) {
        return aSalesRecord(quota, 100);
    }

    private SalesRecord aSalesRecord(int quota, int commission) {
        return new SalesRecord(quota, commission, 0);
    }



}



