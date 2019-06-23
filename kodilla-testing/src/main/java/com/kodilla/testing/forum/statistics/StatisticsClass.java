package com.kodilla.testing.forum.statistics;

public class StatisticsClass {

    int usersCount;
    int postsCount;
    int commentsCount;
    double averagePostsQuantity;
    double averageCommentsQuantity;
    double averageComPerPostQuantity;

    public StatisticsClass(int usersCount, int postsCount, int commentsCount) {
//        this.usersCount = usersQuantity;
//        this.postsCount = postsQuantity;
//        this.commentsCount = commentsQuantity;
        }

    public int getUsersCount() {
        return usersCount;
    }

    public int getPostsCount() {
        return postsCount;
    }

    public int getCommentsCount() {
        return commentsCount;
    }

    public void calculateAdvStatistics(Statistics statistics) {


        if (getUsersCount() > 0) {
            averagePostsQuantity = getPostsCount() / getUsersCount();
        }

        if (getUsersCount() > 0) {
            averageCommentsQuantity = getCommentsCount() / getUsersCount();
        }

        if(getPostsCount() >0)
            averageComPerPostQuantity = getCommentsCount() / getPostsCount();
        }
    }
