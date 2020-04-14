package com.kodilla.testing.forum.statistic;

import java.util.ArrayList;
import java.util.List;

public class StatisticCounter {

    int quantityOfUsers;
    int quantityOfPosts;
    int quantityOfComments;
    int averageAmountPostsOnUser;
    int averageAmountCommentsOnUser;
    int averageAmountCommentsOnPost;



    public void calculateAdvStatistics(Statistic statistic) {

        this.quantityOfUsers = statistic.usersNames().size();
        this.quantityOfPosts = statistic.postsCount();
        this.quantityOfComments = statistic.commentsCount();
        this.averageAmountPostsOnUser = quantityOfPosts / quantityOfUsers;
        averageAmountCommentsOnPost = quantityOfComments / quantityOfPosts;
        averageAmountCommentsOnUser = quantityOfComments / quantityOfUsers;
    }


    public String showStatistic() {
        return "StatisticCounter{" +
                "quantityOfUsers=" + quantityOfUsers +
                ", quantityOfPosts=" + quantityOfPosts +
                ", quantityOfComments=" + quantityOfComments +
                ", averageAmountPostsOnUser=" + averageAmountPostsOnUser +
                ", averageAmountCommentsOnUser=" + averageAmountCommentsOnUser +
                ", averageAmountCommentsOnPost=" + averageAmountCommentsOnPost +
                '}';
    }
}