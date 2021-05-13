package tdd.bonus;

import java.util.ArrayList;

import static java.lang.Math.max;

public class SalesRecord {
    private final int quota;
    private final int commission;
    private final int tax;

    private int totalSale;
    private final ArrayList<Integer> sales = new ArrayList<>();

    public SalesRecord(int quota, int commission, int tax) {
        this.quota = quota;
        this.commission = commission;
        this.tax = tax;
    }

    public Integer calculateBonus() {
        int bonus = max(totalSale - quota, 0) * commission / 100;
        return bonus - (bonus * tax) / 100;
    }

    public void registerSale(int sale) {
        this.sales.add(sale);
        this.totalSale = this.totalSale + sale;
    }
}
