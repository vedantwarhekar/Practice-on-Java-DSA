package CollectionProblem;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

// Question
//Convert List<Trade> to Map<tradeId, Trade>.
public class ListQ6 {
    public static void main(String[] args) {
        List<Trade> trades = Arrays.asList(
                new Trade(1_000_000, LocalDate.of(2024, 1, 10)),
                new Trade(5_000_000, LocalDate.of(2024, 1, 5)),
                new Trade(5_000_000, LocalDate.of(2024, 1, 1)),
                new Trade(2_000_000, LocalDate.of(2024, 1, 3))
        );

        HashMap<Integer,Trade> map = new HashMap<>();
        for(int i =0; i < trades.size(); i++){
            map.put(i,trades.get(i));
        }
        System.out.println(trades);
    }
}
