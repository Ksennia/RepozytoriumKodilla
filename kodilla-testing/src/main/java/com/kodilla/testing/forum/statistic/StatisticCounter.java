package com.kodilla.testing.forum.statistic;

import java.util.ArrayList;
import java.util.List;

public class StatisticCounter {

    int quantityOfUsers;
    int quantityOfPosts;
    int quantityOfComments;
    double averageAmountPostsOnUser;
    double averageAmountCommentsOnUser;
    double averageAmountCommentsOnPost;



    public void calculateAdvStatistics(Statistic statistic) {

        this.quantityOfUsers = statistic.usersNames().size();

        try {
            if (quantityOfUsers == 0) {
                this.quantityOfPosts = 0;
                this.averageAmountPostsOnUser = 0;
                this.averageAmountCommentsOnPost = 0;
                this.averageAmountCommentsOnUser = 0;
            } else {
                this.quantityOfPosts = statistic.postsCount();

                if (quantityOfPosts == 0) {
                    this.quantityOfComments = 0;
                    this.averageAmountCommentsOnPost = 0;
                } else {
                    this.quantityOfComments = statistic.commentsCount();
                    this.averageAmountCommentsOnPost = (quantityOfComments / (double) quantityOfPosts);
                }
                this.averageAmountPostsOnUser = (quantityOfPosts / (double) quantityOfUsers);
                this.averageAmountCommentsOnUser = quantityOfComments / (double) quantityOfUsers;
            }
        } catch (ArithmeticException e) {
            System.out.println("Coś poszło nie tak))");
        }


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