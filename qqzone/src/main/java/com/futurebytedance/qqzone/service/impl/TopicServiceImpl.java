package com.futurebytedance.qqzone.service.impl;

import com.futurebytedance.qqzone.dao.TopicDAO;
import com.futurebytedance.qqzone.pojo.Topic;
import com.futurebytedance.qqzone.pojo.UserBasic;
import com.futurebytedance.qqzone.service.TopicService;

import java.util.List;

public class TopicServiceImpl implements TopicService {

    private TopicDAO topicDAO = null;

    @Override
    public List<Topic> getTopicList(UserBasic userBasic) {
        return topicDAO.getTopicList(userBasic);
    }
}
