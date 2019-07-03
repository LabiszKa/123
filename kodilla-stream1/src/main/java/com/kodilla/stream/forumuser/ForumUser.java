package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {

    private final int signature;
    private final String userName;
    private final char sex;
    private final LocalDate birthDay;
    private final int postsCount;

    public ForumUser(int signature, String userName, char sex, int yearOfBirth, int monthOfBirth, int dayOfBirth, int postsCount) {
        this.signature = signature;
        this.userName = userName;
        this.sex = sex;
        this.birthDay = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.postsCount = postsCount;
    }

    public int getSignature() {
        return signature;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public  LocalDate getBirthDay() {
        return birthDay;
    }

    public int getPostsCount() {
        return postsCount;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "signature=" + signature +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", birthDay=" + birthDay +
                ", postsCount=" + postsCount +
                '}';
    }
}
