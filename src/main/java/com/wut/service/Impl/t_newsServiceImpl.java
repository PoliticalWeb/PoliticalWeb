package com.wut.service.Impl;

import com.wut.dao.t_newsDao;
import com.wut.model.*;
import com.wut.service.t_newsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by liufukai on 2018/12/12.
 */
@Service("t_newsService")
public class t_newsServiceImpl implements t_newsService {
    @Resource
    private t_newsDao t_newsDao;

    @Override
    public List<reFromMain> requestFromMain(int channel_id,int num){
        return t_newsDao.getFromMain(channel_id,num);
    }

    @Override
    public List<reFromMore> requestFromMore(int paper,int channel_id,int num){
        return t_newsDao.getFromMore((paper-1)*4,channel_id,num);
    }

    @Override
    public List<reFromOne> requestFromOne(int id){
        //首先先增加点击量，再返回
        t_newsDao.addClick(id);
        return t_newsDao.getFromOne(id);
    }

    @Override
    public int getChannelAllNum(int channel_id){
        return t_newsDao.getChannelAllNum(channel_id);
    }
}
