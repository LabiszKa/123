package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> usersList = new ArrayList<>();

    public Forum() {
        usersList.add(new ForumUser(001, "Albinos", 'K', 1999, 01, 19, 5000));
        usersList.add(new ForumUser(002, "Godzilla", 'M', 1998, 02, 20, 4999));
        usersList.add(new ForumUser(003, "Gara", 'M', 2001, 10, 10, 5001));
    }
    public List<ForumUser> getUserList() {
        return new ArrayList<>(usersList);
    }
}
