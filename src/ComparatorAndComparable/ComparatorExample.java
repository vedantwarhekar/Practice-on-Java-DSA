package ComparatorAndComparable;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Trade {
    private double notional;
    private LocalDate tradeDate;

    public Trade(double notional, LocalDate tradeDate) {
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
}

public class ComparatorExample {
    public static void main(String[] args) {
        List<Trade> trades = Arrays.asList(
                new Trade(1_000_000, LocalDate.of(2024, 1, 10)),
                new Trade(5_000_000, LocalDate.of(2024, 1, 5)),
                new Trade(5_000_000, LocalDate.of(2024, 1, 1)),
                new Trade(2_000_000, LocalDate.of(2024, 1, 3))
        );

        Comparator<Trade> com = new Comparator<Trade>() {
            @Override
            public int compare(Trade t1, Trade t2){
                int notionalCompare = Double.compare(t2.getNotional(),t1.getNotional());
                if(notionalCompare!=0){
                    return notionalCompare;
                }
                //else sort through date
                return t1.getTradeDate().compareTo(t2.getTradeDate());
            }
        };
        Collections.sort(trades,com);
        System.out.println(trades);
    }
}
