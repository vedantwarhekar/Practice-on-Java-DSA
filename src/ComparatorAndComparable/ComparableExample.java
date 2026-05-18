package ComparatorAndComparable;


import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class TradeEx implements Comparable<TradeEx> {
    private double notional;
    private LocalDate tradeDate;

    public TradeEx(double notional, LocalDate tradeDate) {
        this.notional = notional;
        this.tradeDate = tradeDate;
    }

    public double getNotional() {
        return notional;
    }

    public LocalDate getTradeDate() {
        return tradeDate;
    }

    @Override
    public String toString() {
        return "Trade{" +
                "notional=" + notional +
                ", tradeDate=" + tradeDate +
                '}';
    }

    @Override
    public int compareTo(TradeEx other) {
        int notationalCompare = Double.compare(other.notional,this.notional);
        if(notationalCompare != 0){
            return notationalCompare;
        }
        return this.tradeDate.compareTo(other.tradeDate);
    }
}
public class ComparableExample {
    public static void main(String[] args) {
        List<TradeEx> trades = Arrays.asList(
                new TradeEx(1_000_000, LocalDate.of(2024, 1, 10)),
                new TradeEx(5_000_000, LocalDate.of(2024, 1, 5)),
                new TradeEx(5_000_000, LocalDate.of(2024, 1, 1)),
                new TradeEx(2_000_000, LocalDate.of(2024, 1, 3))
        );
        Collections.sort(trades);
        System.out.println(trades);
    }
}
