package com.kodilla.testing.forum.statistic;


import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticTestSuite {
    @Test
    public void test1StatisticMock() {
        //Given
        Statistic statisticMock = mock(Statistic.class);
        List<String> statisticList = new ArrayList<>();
        for ( int i = 0; i < 100; i++){
            statisticList.add("User");
        }
        int postsCountMock = 1000;
        int commentsCountMock = 5000;
        when(statisticMock.usersNames()).thenReturn(statisticList);
        when(statisticMock.postsCount()).thenReturn(postsCountMock);
        when(statisticMock.commentsCount()).thenReturn(commentsCountMock);

        StatisticCounter statisticCounter = new StatisticCounter();
        statisticCounter.calculateAdvStatistics(statisticMock);
        //When

        int averageAmountPostsOnUserRes = statisticCounter.averageAmountPostsOnUser;
        int averageAmountCommentsOnPostRes = statisticCounter.averageAmountCommentsOnPost;
        int averageAmountCommentsOnUserRes = statisticCounter.averageAmountCommentsOnUser;
        //Then
        Assert.assertEquals(10, averageAmountPostsOnUserRes);
        Assert.assertEquals(5, averageAmountCommentsOnPostRes);
        Assert.assertEquals(50, averageAmountCommentsOnUserRes);
    }
    @Test
    public void test2StatisticMock() {
        //Given
        Statistic statisticMock = mock(Statistic.class);
        List<String> statisticList = new ArrayList<>();
        for ( int i = 0; i < 100; i++){
            statisticList.add("User");
        }
        int postsCountMock = 1000;
        int commentsCountMock = 100;
        when(statisticMock.usersNames()).thenReturn(statisticList);
        when(statisticMock.postsCount()).thenReturn(postsCountMock);
        when(statisticMock.commentsCount()).thenReturn(commentsCountMock);

        StatisticCounter statisticCounter = new StatisticCounter();
        statisticCounter.calculateAdvStatistics(statisticMock);
        //When

        int averageAmountPostsOnUserRes = statisticCounter.averageAmountPostsOnUser;
        int averageAmountCommentsOnPostRes = statisticCounter.averageAmountCommentsOnPost;
        int averageAmountCommentsOnUserRes = statisticCounter.averageAmountCommentsOnUser;
        //Then
        Assert.assertEquals(10, averageAmountPostsOnUserRes);
        Assert.assertEquals(0, averageAmountCommentsOnPostRes);
        Assert.assertEquals(1, averageAmountCommentsOnUserRes);
    }
    @Test
    public void test3StatisticMock() {
        //Given
        Statistic statisticMock = mock(Statistic.class);
        List<String> statisticList = new ArrayList<>();

        int postsCountMock = 0;
        int commentsCountMock = 0;
        when(statisticMock.usersNames()).thenReturn(statisticList);
        when(statisticMock.postsCount()).thenReturn(postsCountMock);
        when(statisticMock.commentsCount()).thenReturn(commentsCountMock);

        StatisticCounter statisticCounter = new StatisticCounter();
       // statisticCounter.calculateAdvStatistics(statisticMock);
        //When

        boolean averageAmountPostsOnUserRes;
        boolean averageAmountCommentsOnPostRes;
        boolean averageAmountCommentsOnUserRes;
        if ( statisticCounter.quantityOfUsers == 0) {
            averageAmountPostsOnUserRes = false;
            averageAmountCommentsOnUserRes = false;
        } else {
            averageAmountPostsOnUserRes = true;
            averageAmountCommentsOnUserRes = true;
        }
        if (statisticCounter.quantityOfPosts == 0) {
            averageAmountCommentsOnPostRes = false;
        } else {
            averageAmountCommentsOnPostRes = true;
        }

        //Then
        Assert.assertFalse(averageAmountPostsOnUserRes);
        Assert.assertFalse(averageAmountCommentsOnUserRes);
        Assert.assertFalse(averageAmountCommentsOnPostRes);
    }
    @Test
    public void test4StatisticMock() {
        //Given
        Statistic statisticMock = mock(Statistic.class);
        List<String> statisticList = new ArrayList<>();
        for ( int i = 0; i < 100; i++){
            statisticList.add("User");
        }
        int postsCountMock = 1000;
        int commentsCountMock = 0;
        when(statisticMock.usersNames()).thenReturn(statisticList);
        when(statisticMock.postsCount()).thenReturn(postsCountMock);
        when(statisticMock.commentsCount()).thenReturn(commentsCountMock);

        StatisticCounter statisticCounter = new StatisticCounter();
        statisticCounter.calculateAdvStatistics(statisticMock);
        //When

        int averageAmountPostsOnUserRes = statisticCounter.averageAmountPostsOnUser;
        int averageAmountCommentsOnPostRes = statisticCounter.averageAmountCommentsOnPost;
        int averageAmountCommentsOnUserRes = statisticCounter.averageAmountCommentsOnUser;
        //Then
        Assert.assertEquals(10, averageAmountPostsOnUserRes);
        Assert.assertEquals(0, averageAmountCommentsOnPostRes);
        Assert.assertEquals(0, averageAmountCommentsOnUserRes);
    }


}
