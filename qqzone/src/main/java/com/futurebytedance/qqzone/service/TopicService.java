package com.futurebytedance.qqzone.service;

import com.futurebytedance.qqzone.pojo.Topic;
import com.futurebytedance.qqzone.pojo.UserBasic;

import java.util.List;

public interface TopicService {
    //查询特定用户的日志列表
    List<Topic> getTopicList(UserBasic userBasic) ;
}
