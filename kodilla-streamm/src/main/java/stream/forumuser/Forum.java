package stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> theUserList = new ArrayList<>();

    public Forum() {
        theUserList.add(new ForumUser(100,"John Smith",'M', 2000,2,25,5));
        theUserList.add(new ForumUser(200, "lexus",'M', 1980,11,30,20));
        theUserList.add(new ForumUser(300, "amanda", 'F', 1998,5, 18,1));
        theUserList.add(new ForumUser(400,"kleopatra", 'F', 1998,5,9,15));
        theUserList.add(new ForumUser(500, "dionis", 'M',1990,1,19,0));
        //theUserList.add();
        //theUserList.add();
        //theUserList.add();
        //theUserList.add();
    }
    public List<ForumUser> getList() {return new ArrayList<>(theUserList);}
}
