package com.wut.service;

import com.wut.model.reFromMain;
import com.wut.model.reFromMore;
import com.wut.model.reFromOne;

import java.util.List;

/**
 * Created by liufukai on 2018/12/12.
 */
public interface t_newsService {

    public List<reFromMain> requestFromMain(int channel_id,int num);

    public List<reFromMore> requestFromMore(int paper,int channel_id,int num);

    public List<reFromOne> requestFromOne(int id);

    public int getChannelAllNum(int channel_id);
}
