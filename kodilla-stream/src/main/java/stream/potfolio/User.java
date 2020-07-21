package stream.potfolio;

import java.util.Objects;

public final class User {
    private final String username;
    private final String realName;

    public User(final String username, final String realName) {
        this.username = username;
        this.realName = realName;
    }

    public String getUsername() {
        return username;
    }

    public String getRealName() {
        return realName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return Objects.equals(getUsername(), user.getUsername()) &&
                Objects.equals(getRealName(), user.getRealName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUsername(), getRealName());
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                '}';
    }
}
