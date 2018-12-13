package com.wut.model;

import java.util.Date;

/**
 * Created by liufukai on 2018/12/12.
 */
public class t_news {
    private int id;
    private int state;
    private int channel_id;
    private String title;
    private String t_from;
    private String author;
    private Date time_add;
    private String t_local;
    private int click_counter;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getChannel_id() {
        return channel_id;
    }

    public void setChannel_id(int channel_id) {
        this.channel_id = channel_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getT_from() {
        return t_from;
    }

    public void setT_from(String t_from) {
        this.t_from = t_from;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getTime_add() {
        return time_add;
    }

    public void setTime_add(Date time_add) {
        this.time_add = time_add;
    }

    public String getT_local() {
        return t_local;
    }

    public void setT_local(String t_local) {
        this.t_local = t_local;
    }

    public int getClick_counter() {
        return click_counter;
    }

    public void setClick_counter(int click_counter) {
        this.click_counter = click_counter;
    }
}
