package forum.statistic;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;

public class StatisticTestSuite {
    @Test
    public void testStatisticMock() {
        //Given
        Statistic statisticsMock = mock(Statistic.class);
        List<String> usersListMock = new ArrayList<String>();
        usersListMock.add("tom");
        usersListMock.add("Mark");
        usersListMock.add("Bill");
        usersListMock.add("Steve");
        usersListMock.add("Aleks");
        StatisticCounter statisticCounter = new StatisticCounter();
        Mockito.when(statisticCounter.userNamesCounter()).thenReturn(usersListMock);
        // when(statisticsMock.commentsCount()).thenReturn(usersListMock);
        //statisticCounter = new StatisticCounter(statisticsMock);
        //when
        int quantityTestOfUsers = statisticCounter.quantityOfUsers;

        //then
        Assert.assertEquals(5, quantityTestOfUsers);

    }


}
