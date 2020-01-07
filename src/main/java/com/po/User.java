package com.po;

import org.springframework.stereotype.Repository;


public class User {
    String userId;
    String userPws;
    int userKind;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPws() {
        return userPws;
    }

    public void setUserPws(String userPws) {
        this.userPws = userPws;
    }

    public int getUserKind() {
        return userKind;
    }

    public void setUserKind(int userKind) {
        this.userKind = userKind;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", userPws='" + userPws + '\'' +
                ", userKind=" + userKind +
                '}';
    }
}
