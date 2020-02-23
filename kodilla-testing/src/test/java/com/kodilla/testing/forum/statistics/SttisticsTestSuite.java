package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SttisticsTestSuite {
    @Test
    public void testStatisticMock() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
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
