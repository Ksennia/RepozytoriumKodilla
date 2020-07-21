package stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int identityNumerOfUser;
    private final String username;
    private final char sex;
    private final LocalDate dateOfBirsday;
    private final int quantityOfPost;

    public ForumUser(final int identityNumerOfUser, final String username, final char sex, final int yearOfBirth, final int monthOfBirth, final int dayOfBirth, final int quantityOfPost) {
        this.identityNumerOfUser = identityNumerOfUser;
        this.username = username;
        this.sex = sex;
        this.dateOfBirsday = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.quantityOfPost = quantityOfPost;
    }

    public int getIdentityNumerOfUser() {
        return identityNumerOfUser;
    }

    public String getUsername() {
        return username;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirsday() {
        return dateOfBirsday;
    }

    public int getQuantityOfPost() {
        return quantityOfPost;
    }


    @Override
    public String toString() {
        return "ForumUser{" +
                "identityNumerOfUser=" + identityNumerOfUser +
                ", username='" + username + '\'' +
                ", sex=" + sex +
                ", dateOfBirsday=" + dateOfBirsday +
                ", quantityOfPost=" + quantityOfPost +
                '}';
    }
}
