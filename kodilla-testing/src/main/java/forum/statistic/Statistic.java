package forum.statistic;

import java.util.List;

public interface Statistic {
    List<String> usersNames();
    int postsCount();
    int commentsCount();
}
