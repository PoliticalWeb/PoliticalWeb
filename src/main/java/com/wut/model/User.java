package com.wut.model;

/**
 * Created by liufukai on 2018/12/3.
 */
public class User {
    private int userId;
    private int user_TitleNum;
    private int user_Sex;
    private String user_Phone;
    private String user_Date;
    private String user_Email;
    private String user_LastLoginTime;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getUser_TitleNum() {
        return user_TitleNum;
    }

    public void setUser_TitleNum(int user_TitleNum) {
        this.user_TitleNum = user_TitleNum;
    }

    public int getUser_Sex() {
        return user_Sex;
    }

    public void setUser_Sex(int user_Sex) {
        this.user_Sex = user_Sex;
    }

    public String getUser_Phone() {
        return user_Phone;
    }

    public void setUser_Phone(String user_Phone) {
        this.user_Phone = user_Phone;
    }

    public String getUser_Date() {
        return user_Date;
    }

    public void setUser_Date(String user_Date) {
        this.user_Date = user_Date;
    }

    public String getUser_Email() {
        return user_Email;
    }

    public void setUser_Email(String user_Email) {
        this.user_Email = user_Email;
    }

    public String getUser_LastLoginTime() {
        return user_LastLoginTime;
    }

    public void setUser_LastLoginTime(String user_LastLoginTime) {
        this.user_LastLoginTime = user_LastLoginTime;
    }
}
