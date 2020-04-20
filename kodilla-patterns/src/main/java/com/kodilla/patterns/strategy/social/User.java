package com.kodilla.patterns.strategy.social;

public class User {
    final private String username;
    protected SocialPublisher socialPublisher;

    public String getUsername() {
        return username;
    }

    public User(String username) {
        this.username = username;
    }

    public String showSocial() {
        return socialPublisher.share();
    }
    public void sharePost(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }
}
