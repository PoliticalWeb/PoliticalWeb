package com.wut.controller;

import com.wut.model.reFromMain;
import com.wut.model.reFromMore;
import com.wut.model.reFromOne;
import com.wut.service.t_newsService;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by liufukai on 2018/12/12.
 */
@RestController
@EnableAutoConfiguration
@RequestMapping("/news")
public class t_newsController {
    @Autowired
    private t_newsService t_newsService;

    @RequestMapping("/fromMain")
    @ResponseBody
    public void fromMain(HttpServletRequest request, HttpServletResponse response, Model model){
        int channel_id=Integer.parseInt(request.getParameter("channel_id"));
        int num=Integer.parseInt(request.getParameter("num"));
        List<reFromMain> requestFromMain=t_newsService.requestFromMain(channel_id,num);
        JSONArray ja=JSONArray.fromObject(requestFromMain);
        try{
            response.setContentType("application/json;charset=utf-8");
            response.getWriter().write(ja.toString());
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    @RequestMapping("/fromMore")
    @ResponseBody
    public void fromMore(HttpServletRequest request, HttpServletResponse response, Model model){
        int channel_id=Integer.parseInt(request.getParameter("channel_id"));
        int num=Integer.parseInt(request.getParameter("num"));
        int paper=Integer.parseInt(request.getParameter("paper"));
        List<reFromMore> requestFromMore=t_newsService.requestFromMore(paper,channel_id,num);
        JSONArray ja=JSONArray.fromObject(requestFromMore);
        try{
            response.setContentType("application/json;charset=utf-8");
            response.getWriter().write(ja.toString());
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    @RequestMapping("/fromMoreAllNum")
    @ResponseBody
    public void fromMoreAllNum(HttpServletRequest request, HttpServletResponse response, Model model){
        int channel_id=Integer.parseInt(request.getParameter("channel_id"));
        int allNum=t_newsService.getChannelAllNum(channel_id);
        JSONArray ja=JSONArray.fromObject(allNum);
        try{
            response.setContentType("application/json;charset=utf-8");
            response.getWriter().write(ja.toString());
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    @RequestMapping("/fromOne")
    @ResponseBody
    public void fromOne(HttpServletRequest request, HttpServletResponse response, Model model){
        int id=Integer.parseInt(request.getParameter("id"));
        List<reFromOne> requestFromOne=t_newsService.requestFromOne(id);
        JSONArray ja=JSONArray.fromObject(requestFromOne);
        try{
            response.setContentType("application/json;charset=utf-8");
            response.getWriter().write(ja.toString());
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
