import com.kodilla.testing.forum.statistic.Statistic;
import com.kodilla.testing.forum.statistic.StatisticCounter;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main( String[] agrs) {
        Statistic statistic = new Statistic() {
            @Override
            public List<String> usersNames() {
                ArrayList<String> list = new ArrayList<>();
                list.add("boo");
                return list;
            }

            @Override
            public int postsCount() {
                return 3;
            }

            @Override
            public int commentsCount() {
                return 1;
            }
        };
        StatisticCounter statisticCounter = new StatisticCounter();
        statisticCounter.calculateAdvStatistics(statistic);
        System.out.println(statisticCounter.showStatistic());
    }
}
