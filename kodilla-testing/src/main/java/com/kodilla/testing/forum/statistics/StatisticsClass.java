package com.kodilla.testing.forum.statistics;

public class StatisticsClass {

    double usersQuantity;
    double postsQuantity;
    double commentsQuantity;
    double averagePostsPerUserQuantity;
    double averageCommentsPerUserQuantity;
    double averageCommentsPerPostQuantity;

    public void calculateAdvStatistics(Statistics statistics) {
            usersQuantity = statistics.usersNames().size();
            postsQuantity = statistics.postsCount();
            commentsQuantity = statistics.commentsCount();

        if (postsQuantity <= 0) {
            averageCommentsPerPostQuantity = 0;
        } else {
            averageCommentsPerPostQuantity = commentsQuantity / postsQuantity;
        }
        if (usersQuantity <= 0) {
            averagePostsPerUserQuantity = 0;
            averageCommentsPerUserQuantity = 0;
        } else {
            averagePostsPerUserQuantity = postsQuantity / usersQuantity;
            averageCommentsPerUserQuantity = commentsQuantity / usersQuantity;
        }
    }

    public double getUsersQuantity() {
        return usersQuantity;
    }

    public double getPostsQuantity() {
        return postsQuantity;
    }

    public double getCommentsQuantity() {
        return commentsQuantity;
    }

    public double getAveragePostsPerUserQuantity() {
        return averagePostsPerUserQuantity;
    }

    public double getAverageCommentsPerUserQuantity() {
        return averageCommentsPerUserQuantity;
    }

    public double getAverageCommentsPerPostQuantity() {
        return averageCommentsPerPostQuantity;
    }
}