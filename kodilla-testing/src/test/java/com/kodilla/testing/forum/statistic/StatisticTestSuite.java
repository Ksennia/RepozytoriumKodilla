package com.kodilla.testing.forum.statistic;


import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticTestSuite {
    //gdy liczba postów = 0
    @Test
    public void test1StatisticMock() {
        //Given
        Statistic statisticMock = mock(Statistic.class);
        List<String> statisticList = new ArrayList<>();
        for ( int i = 0; i < 100; i++){
            statisticList.add("User");
        }
        int postsCountMock = 0;
        int commentsCountMock = 5000;
        when(statisticMock.usersNames()).thenReturn(statisticList);
        when(statisticMock.postsCount()).thenReturn(postsCountMock);
        when(statisticMock.commentsCount()).thenReturn(commentsCountMock);

        StatisticCounter statisticCounter = new StatisticCounter();
        statisticCounter.calculateAdvStatistics(statisticMock);
        //When

        double averageAmountPostsOnUserRes = statisticCounter.averageAmountPostsOnUser;
        double averageAmountCommentsOnPostRes = statisticCounter.averageAmountCommentsOnPost;
        double averageAmountCommentsOnUserRes = statisticCounter.averageAmountCommentsOnUser;
        //Then
        Assert.assertEquals(100, statisticCounter.quantityOfUsers);
        Assert.assertEquals(0, statisticCounter.quantityOfPosts);
        Assert.assertEquals(0, statisticCounter.quantityOfComments);
        Assert.assertEquals(0, averageAmountPostsOnUserRes, 0);
        Assert.assertEquals(0, averageAmountCommentsOnPostRes, 0);
        Assert.assertEquals(0, averageAmountCommentsOnUserRes, 0);
    }

    //gdy liczba postów = 1000,
    @Test
    public void test2StatisticMock() {
        //Given
        Statistic statisticMock = mock(Statistic.class);
        List<String> statisticList = new ArrayList<>();
        for ( int i = 0; i < 100; i++){
            statisticList.add("User");
        }
        int postsCountMock = 1000;
        int commentsCountMock = 1000;
        when(statisticMock.usersNames()).thenReturn(statisticList);
        when(statisticMock.postsCount()).thenReturn(postsCountMock);
        when(statisticMock.commentsCount()).thenReturn(commentsCountMock);

        StatisticCounter statisticCounter = new StatisticCounter();
        statisticCounter.calculateAdvStatistics(statisticMock);
        //When

        double averageAmountPostsOnUserRes = statisticCounter.averageAmountPostsOnUser;
        double averageAmountCommentsOnPostRes = statisticCounter.averageAmountCommentsOnPost;
        double averageAmountCommentsOnUserRes = statisticCounter.averageAmountCommentsOnUser;
        //Then
        Assert.assertEquals(100, statisticCounter.quantityOfUsers);
        Assert.assertEquals(1000, statisticCounter.quantityOfPosts);
        Assert.assertEquals(1000, statisticCounter.quantityOfComments);
        Assert.assertEquals(10, averageAmountPostsOnUserRes, 0);
        Assert.assertEquals(1, averageAmountCommentsOnPostRes, 0);
        Assert.assertEquals(10, averageAmountCommentsOnUserRes, 0);
    }

    //gdy liczba komentarzy = 0
    @Test
    public void test3StatisticMock() {
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

        double averageAmountPostsOnUserRes = statisticCounter.averageAmountPostsOnUser;
        double averageAmountCommentsOnPostRes = statisticCounter.averageAmountCommentsOnPost;
        double averageAmountCommentsOnUserRes = statisticCounter.averageAmountCommentsOnUser;
        //Then
        Assert.assertEquals(100, statisticCounter.quantityOfUsers);
        Assert.assertEquals(1000, statisticCounter.quantityOfPosts);
        Assert.assertEquals(0, statisticCounter.quantityOfComments);
        Assert.assertEquals(10, averageAmountPostsOnUserRes, 0);
        Assert.assertEquals(0, averageAmountCommentsOnPostRes, 0);
        Assert.assertEquals(0, averageAmountCommentsOnUserRes, 0);
    }

    //gdy liczba komentarzy < liczba postów
    @Test
    public void test4StatisticMock() {
        //Given
        Statistic statisticMock = mock(Statistic.class);
        List<String> statisticList = new ArrayList<>();
        for ( int i = 0; i < 100; i++){
            statisticList.add("User");
        }
        int postsCountMock = 1000;
        int commentsCountMock = 50;
        when(statisticMock.usersNames()).thenReturn(statisticList);
        when(statisticMock.postsCount()).thenReturn(postsCountMock);
        when(statisticMock.commentsCount()).thenReturn(commentsCountMock);

        StatisticCounter statisticCounter = new StatisticCounter();
        statisticCounter.calculateAdvStatistics(statisticMock);
        //When

        double averageAmountPostsOnUserRes = statisticCounter.averageAmountPostsOnUser;
        double averageAmountCommentsOnPostRes = statisticCounter.averageAmountCommentsOnPost;
        double averageAmountCommentsOnUserRes = statisticCounter.averageAmountCommentsOnUser;
        //Then
        Assert.assertEquals(100, statisticCounter.quantityOfUsers);
        Assert.assertEquals(1000, statisticCounter.quantityOfPosts);
        Assert.assertEquals(50, statisticCounter.quantityOfComments);
        Assert.assertEquals(10, averageAmountPostsOnUserRes, 0);
        Assert.assertEquals(0.05, averageAmountCommentsOnPostRes, 0);
        Assert.assertEquals(0.5, averageAmountCommentsOnUserRes, 0);
    }

    //gdy liczba komentarzy > liczba postów,
    @Test
    public void test5StatisticMock() {
        //Given
        Statistic statisticMock = mock(Statistic.class);
        List<String> statisticList = new ArrayList<>();
        for ( int i = 0; i < 100; i++){
            statisticList.add("User");
        }
        int postsCountMock = 50;
        int commentsCountMock = 1000;
        when(statisticMock.usersNames()).thenReturn(statisticList);
        when(statisticMock.postsCount()).thenReturn(postsCountMock);
        when(statisticMock.commentsCount()).thenReturn(commentsCountMock);

        StatisticCounter statisticCounter = new StatisticCounter();
        statisticCounter.calculateAdvStatistics(statisticMock);
        //When

        double averageAmountPostsOnUserRes = statisticCounter.averageAmountPostsOnUser;
        double averageAmountCommentsOnPostRes = statisticCounter.averageAmountCommentsOnPost;
        double averageAmountCommentsOnUserRes = statisticCounter.averageAmountCommentsOnUser;
        //Then
        Assert.assertEquals(100, statisticCounter.quantityOfUsers);
        Assert.assertEquals(50, statisticCounter.quantityOfPosts);
        Assert.assertEquals(1000, statisticCounter.quantityOfComments);
        Assert.assertEquals(0.5, averageAmountPostsOnUserRes, 0);
        Assert.assertEquals(20, averageAmountCommentsOnPostRes, 0);
        Assert.assertEquals(10, averageAmountCommentsOnUserRes, 0);
    }

    //gdy liczba użytkowników = 0
    @Test
    public void test6StatisticMock() {
        //Given
        Statistic statisticMock = mock(Statistic.class);
        List<String> statisticList = new ArrayList<>();
        for ( int i = 0; i < 100; i++){
           // statisticList.add("User");
        }
        int postsCountMock = 50;
        int commentsCountMock = 1000;
        when(statisticMock.usersNames()).thenReturn(statisticList);
        when(statisticMock.postsCount()).thenReturn(postsCountMock);
        when(statisticMock.commentsCount()).thenReturn(commentsCountMock);

        StatisticCounter statisticCounter = new StatisticCounter();
        statisticCounter.calculateAdvStatistics(statisticMock);
        //When

        double averageAmountPostsOnUserRes = statisticCounter.averageAmountPostsOnUser;
        double averageAmountCommentsOnPostRes = statisticCounter.averageAmountCommentsOnPost;
        double averageAmountCommentsOnUserRes = statisticCounter.averageAmountCommentsOnUser;
        //Then
        Assert.assertEquals(0, statisticCounter.quantityOfUsers);
        Assert.assertEquals(0, statisticCounter.quantityOfPosts);
        Assert.assertEquals(0, statisticCounter.quantityOfComments);
        Assert.assertEquals(0, averageAmountPostsOnUserRes, 0);
        Assert.assertEquals(0, averageAmountCommentsOnPostRes, 0);
        Assert.assertEquals(0, averageAmountCommentsOnUserRes, 0);
    }

    //gdy liczba użytkowników = 100.
    @Test
    public void test7StatisticMock() {
        //Given
        Statistic statisticMock = mock(Statistic.class);
        List<String> statisticList = new ArrayList<>();
        for ( int i = 0; i < 100; i++){
            statisticList.add("User");
        }
        int postsCountMock = 200;
        int commentsCountMock = 30;
        when(statisticMock.usersNames()).thenReturn(statisticList);
        when(statisticMock.postsCount()).thenReturn(postsCountMock);
        when(statisticMock.commentsCount()).thenReturn(commentsCountMock);

        StatisticCounter statisticCounter = new StatisticCounter();
        statisticCounter.calculateAdvStatistics(statisticMock);
        //When

        double averageAmountPostsOnUserRes = statisticCounter.averageAmountPostsOnUser;
        double averageAmountCommentsOnPostRes = statisticCounter.averageAmountCommentsOnPost;
        double averageAmountCommentsOnUserRes = statisticCounter.averageAmountCommentsOnUser;
        //Then
        Assert.assertEquals(100, statisticCounter.quantityOfUsers);
        Assert.assertEquals(200, statisticCounter.quantityOfPosts);
        Assert.assertEquals(30, statisticCounter.quantityOfComments);
        Assert.assertEquals(2, averageAmountPostsOnUserRes, 0);
        Assert.assertEquals(0.15, averageAmountCommentsOnPostRes, 0);
        Assert.assertEquals(0.3, averageAmountCommentsOnUserRes, 0);
    }


}
