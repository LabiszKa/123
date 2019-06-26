package com.kodilla.testing.forum.statistics;
import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MockStatistics {

    @Test
    public void testCalculateAdvStatisticsIfPostsCountIsZero() {
        // given
        int postsMock = 0;
        int commentsMock = 10;
        ArrayList<String> usersMock = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {
            usersMock.add("UserName");
        }
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(postsMock);
        when(statisticsMock.usersNames()).thenReturn(usersMock);
        when(statisticsMock.commentsCount()).thenReturn(commentsMock);
        StatisticsClass statisticsClass = new StatisticsClass();
        //When
        statisticsClass.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0, statisticsClass.getPostsQuantity(), 0.01);
        Assert.assertEquals(100, statisticsClass.getUsersQuantity(), 0.01);
        Assert.assertEquals(10, statisticsClass.getCommentsQuantity(),0.01);
        Assert.assertEquals(0, statisticsClass.getAverageCommentsPerPostQuantity(), 0.01);
        Assert.assertEquals(0.1, statisticsClass.getAverageCommentsPerUserQuantity(), 0.01);
        Assert.assertEquals(0, statisticsClass.getAveragePostsPerUserQuantity(), 0.01);
    }

    @Test
    public void testCalculateAdvStatisticsIfPostsCountIsThousand() {
        // given
        int postsMock = 1000;
        int commentsMock = 10;
        ArrayList<String> usersMock = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {
            usersMock.add("UserName");
        }
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(postsMock);
        when(statisticsMock.usersNames()).thenReturn(usersMock);
        when(statisticsMock.commentsCount()).thenReturn(commentsMock);
        StatisticsClass statisticsClass = new StatisticsClass();
        //When
        statisticsClass.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(1000, statisticsClass.getPostsQuantity(), 0.01);
        Assert.assertEquals(100, statisticsClass.getUsersQuantity(), 0.01);
        Assert.assertEquals(10, statisticsClass.getCommentsQuantity(),0.01);
        Assert.assertEquals(0.01, statisticsClass.getAverageCommentsPerPostQuantity(), 0.01);
        Assert.assertEquals(0.1, statisticsClass.getAverageCommentsPerUserQuantity(), 0.01);
        Assert.assertEquals(10, statisticsClass.getAveragePostsPerUserQuantity(), 0.01);
    }

    @Test
    public void testCalculateAdvStatisticsIfCommentsCountIsZero() {
        // given
        int postsMock = 10;
        int commentsMock = 0;
        ArrayList<String> usersMock = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {
            usersMock.add("UserName");
        }
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(postsMock);
        when(statisticsMock.usersNames()).thenReturn(usersMock);
        when(statisticsMock.commentsCount()).thenReturn(commentsMock);
        StatisticsClass statisticsClass = new StatisticsClass();
        //When
        statisticsClass.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(10, statisticsClass.getPostsQuantity(), 0.01);
        Assert.assertEquals(100, statisticsClass.getUsersQuantity(), 0.01);
        Assert.assertEquals(0, statisticsClass.getCommentsQuantity(),0.01);
        Assert.assertEquals(0, statisticsClass.getAverageCommentsPerPostQuantity(), 0.01);
        Assert.assertEquals(0, statisticsClass.getAverageCommentsPerUserQuantity(), 0.01);
        Assert.assertEquals(0.1, statisticsClass.getAveragePostsPerUserQuantity(), 0.01);
    }

    @Test
    public void testCalculateAdvStatisticsIfThereIsMoreCommentsThanPosts() {
        // given
        int postsMock = 10;
        int commentsMock = 100;
        ArrayList<String> usersMock =new ArrayList<String>();
        for (int i = 0; i < 100; i++) {
            usersMock.add("UserName");
        }
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(postsMock);
        when(statisticsMock.usersNames()).thenReturn(usersMock);
        when(statisticsMock.commentsCount()).thenReturn(commentsMock);
        StatisticsClass statisticsClass = new StatisticsClass();
        //When
        statisticsClass.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(10, statisticsClass.getPostsQuantity(), 0.01);
        Assert.assertEquals(100, statisticsClass.getUsersQuantity(), 0.01);
        Assert.assertEquals(100, statisticsClass.getCommentsQuantity(),0.01);
        Assert.assertEquals(10, statisticsClass.getAverageCommentsPerPostQuantity(), 0.01);
        Assert.assertEquals(1, statisticsClass.getAverageCommentsPerUserQuantity(), 0.01);
        Assert.assertEquals(0.1, statisticsClass.getAveragePostsPerUserQuantity(), 0.01);
    }

    @Test
    public void testCalculateAdvStatisticsIfThereIsLessCommentsThanPosts() {
        // given
        int postsMock = 100;
        int commentsMock = 10;
        ArrayList<String> usersMock = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {
            usersMock.add("UserName");
        }
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(postsMock);
        when(statisticsMock.usersNames()).thenReturn(usersMock);
        when(statisticsMock.commentsCount()).thenReturn(commentsMock);
        StatisticsClass statisticsClass = new StatisticsClass();
        //When
        statisticsClass.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(100, statisticsClass.getPostsQuantity(), 0.01);
        Assert.assertEquals(100, statisticsClass.getUsersQuantity(), 0.01);
        Assert.assertEquals(10, statisticsClass.getCommentsQuantity(),0.01);
        Assert.assertEquals(0.1, statisticsClass.getAverageCommentsPerPostQuantity(), 0.01);
        Assert.assertEquals(0.1, statisticsClass.getAverageCommentsPerUserQuantity(), 0.01);
        Assert.assertEquals(1, statisticsClass.getAveragePostsPerUserQuantity(), 0.01);
    }

    @Test
    public void testCalculateAdvStatisticsIfThereAreNoUsers() {
        // given
        int postsMock = 0;
        int commentsMock = 0;
        ArrayList<String> usersMock = new ArrayList<String>();

        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(postsMock);
        when(statisticsMock.usersNames()).thenReturn(usersMock);
        when(statisticsMock.commentsCount()).thenReturn(commentsMock);
        StatisticsClass statisticsClass = new StatisticsClass();
        //When
        statisticsClass.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0, statisticsClass.getPostsQuantity(), 0.01);
        Assert.assertEquals(0, statisticsClass.getUsersQuantity(), 0.01);
        Assert.assertEquals(0, statisticsClass.getCommentsQuantity(),0.01);
        Assert.assertEquals(0, statisticsClass.getAverageCommentsPerPostQuantity(), 0.01);
        Assert.assertEquals(0, statisticsClass.getAverageCommentsPerUserQuantity(), 0.01);
        Assert.assertEquals(0, statisticsClass.getAveragePostsPerUserQuantity(), 0.01);
    }
    @Test
    public void testCalculateAdvStatisticsIfThereAreHundredUsers() {
        // given
        int postsMock = 100;
        int commentsMock = 100;
        ArrayList<String> usersMock = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {
            usersMock.add("UserName");
        }

        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(postsMock);
        when(statisticsMock.usersNames()).thenReturn(usersMock);
        when(statisticsMock.commentsCount()).thenReturn(commentsMock);
        StatisticsClass statisticsClass = new StatisticsClass();
        //When
        statisticsClass.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(100, statisticsClass.getPostsQuantity(), 0.01);
        Assert.assertEquals(100, statisticsClass.getUsersQuantity(), 0.01);
        Assert.assertEquals(100, statisticsClass.getCommentsQuantity(),0.01);
        Assert.assertEquals(1, statisticsClass.getAverageCommentsPerPostQuantity(), 0.01);
        Assert.assertEquals(1, statisticsClass.getAverageCommentsPerUserQuantity(), 0.01);
        Assert.assertEquals(1, statisticsClass.getAveragePostsPerUserQuantity(), 0.01);
    }
}
