package forum.statistic;

import java.util.ArrayList;
import java.util.List;

public class StatisticCounter {
    int quantityOfUsers;
    int quantityOfPosts;
    int quantityOfComments;
    int averageAmountPostsOnUser;
    int averageAmountCommentsOnUser;
    int averageAmountCommentsOnPost;
    private ArrayList<String> usersNames;

    public List<String> userNamesCounter() {
        List<String> usersNames = new ArrayList<String>();
        usersNames.add("tom");
        usersNames.add("Mark");
        usersNames.add("Bill");
        usersNames.add("Steve");
        usersNames.add("Aleks");
        return usersNames;
    }
    public void calculateAdvStatistics() {
        //List<String> usersNames = new ArrayList<String>();
        // usersNames.add("tom");
        // usersNames.add("Mark");
        // usersNames.add("Bill");
        //usersNames.add("Steve");
        //usersNames.add("Aleks");
        quantityOfUsers = usersNames.size();
        quantityOfPosts = 0;
        quantityOfComments = 0;
        averageAmountCommentsOnPost = quantityOfComments/quantityOfPosts;
        averageAmountCommentsOnUser = quantityOfComments/quantityOfUsers;
        averageAmountPostsOnUser = quantityOfPosts/quantityOfUsers;
    }
    public void showStatistic() {
        System.out.println("Users" + quantityOfUsers + ", posts : " + quantityOfPosts + ", comments : " + quantityOfComments);
    }


}