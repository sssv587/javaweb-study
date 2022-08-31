package com.futurebytedance.qqzone.service.impl;

import com.futurebytedance.qqzone.dao.HostReplyDAO;
import com.futurebytedance.qqzone.pojo.HostReply;
import com.futurebytedance.qqzone.service.HostReplyService;

public class HostReplyServiceImpl implements HostReplyService {

    private HostReplyDAO hostReplyDAO ;

    @Override
    public HostReply getHostReplyByReplyId(Integer replyId) {
        return hostReplyDAO.getHostReplyByReplyId(replyId);
    }

    @Override
    public void delHostReply(Integer id) {
        hostReplyDAO.delHostReply(id);
    }
}
