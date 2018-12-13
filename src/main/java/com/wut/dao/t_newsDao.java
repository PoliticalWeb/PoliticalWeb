package com.wut.dao;

import com.wut.model.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by liufukai on 2018/12/12.
 */
@Mapper
public interface t_newsDao {

    List<reFromMain> getFromMain(@Param(value="channel_id") int channel_id,@Param(value="num") int num);

    List<reFromMore> getFromMore(@Param(value="paper") int paper,@Param(value="channel_id") int channel_id,@Param(value="num") int num);

    List<reFromOne> getFromOne(@Param(value="id") int id);

    void addClick(@Param(value="id") int id);

    int getChannelAllNum(@Param(value="channel_id") int channel_id);
}
