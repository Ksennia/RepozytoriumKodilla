package com.kodilla.testing.forum.tdd;

import com.kodilla.testing.forum.ForumComment;
import com.kodilla.testing.forum.ForumPost;
import com.kodilla.testing.forum.ForumUser;
import org.junit.*;

public class ForumTestSuite1 {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTest() {
        System.out.println("This is the beginning of tests.");
    }
    @AfterClass
    public static void afterAllTest() {
        System.out.println("All tests are finished.");
    }
    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    //1test
    @Test
            public void testAddPost(){
                    //given
                    ForumUser forumUser = new ForumUser("mrsmith","John Smith");
                    //When
                    forumUser.addPost("mrsmith", "Hello everyone, this is my first contribution herer!");
                    //then
                    Assert.assertEquals(1,forumUser.getPostQuantity());
            }

     //2test
    @Test
    public void testAddComment() {
        //Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, " + "this is my first contribution here!", "mrsmith");

        //when
        forumUser.addComment(thePost, "mesmith", "Thank you for all good words!");

        //then
        Assert.assertEquals(1, forumUser.getCommentsQuantity());

    }

    //3test
    @Test
    public void testGetPost() {
        //given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, " + "this is my first contribution here!", "mrsmith");
        forumUser.addPost(thePost.getAuthor(), thePost.getPostBody());

        //when
        ForumPost retrievedPost;
        retrievedPost = forumUser.getPost(0);

        //then
        Assert.assertEquals(thePost, retrievedPost);
    }

    //4test
    @Test
    public void testGetComment() {
        //Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, " + "this is my first contribution here!", "mrsmith");
        ForumComment theComment = new ForumComment(thePost,"mrsmith", "Thank you for all good words!");
        forumUser.addComment(thePost, theComment.getAuthor(), theComment.getCommentBody());

        //when
        ForumComment retrievedComment  = forumUser.getComment(0);

        //then
        Assert.assertEquals(theComment, retrievedComment);
    }

    //5test
    @Test
    public void testRemovePostNotExisting() {
        //given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, " + "this is my first contribution here!", "mrsmith");

        //when
        boolean result = forumUser.removePost(thePost);

        //then
        Assert.assertFalse(result);
    }

    //6test
    @Test
    public void testRemoveCommentNotExisting() {
        //given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, " + "this is my first contribution here!", "mrsmith");
        ForumComment theComment = new ForumComment(thePost,"mrsmith", "Thank you for all good words!");

        //when
        boolean result = forumUser.removeComment(theComment);

        //then
        Assert.assertFalse(result);
    }

    //7test
    @Test
    public void testRemovePost() {
        //given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, " + "this is my first contribution here!", "mrsmith");
        forumUser.addPost(thePost.getAuthor(), thePost.getPostBody());

        //when
        boolean result = forumUser.removePost(thePost);

        //then
        Assert.assertTrue(result);
        Assert.assertEquals(0, forumUser.getCommentsQuantity());
    }

    //8test
    @Test
    public void testRemoveComment() {
        //given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, " + "this is my first contribution here!", "mrsmith");
        ForumComment theComment = new ForumComment(thePost,"mrsmith", "Thank you for all good words!");
        forumUser.addComment(thePost, theComment.getAuthor(), theComment.getCommentBody());

        //when
        boolean result = forumUser.removeComment(theComment);

        //then
        Assert.assertTrue(result);
        Assert.assertEquals(0, forumUser.getCommentsQuantity());
    }
}
