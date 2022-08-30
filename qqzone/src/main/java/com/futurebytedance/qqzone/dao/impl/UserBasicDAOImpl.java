package com.futurebytedance.qqzone.dao.impl;

import com.futurebytedance.myssm.basedao.BaseDAO;
import com.futurebytedance.qqzone.dao.UserBasicDAO;
import com.futurebytedance.qqzone.pojo.UserBasic;

import java.util.List;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2022/8/31 - 0:50
 * @Description
 */
public class UserBasicDAOImpl extends BaseDAO<UserBasic> implements UserBasicDAO {
    @Override
    public UserBasic getUserBasic(String loginId, String pwd) {
        return super.load("select * from t_user_basic where loginId = ? and pwd = ? ", loginId, pwd);
    }

    @Override
    public List<UserBasic> getUserBasicList(UserBasic userBasic) {
        String sql = "SELECT fid as 'id' FROM t_friend WHERE uid = ?";
        return super.executeQuery(sql, userBasic.getId());
    }

    @Override
    public UserBasic getUserBasicById(Integer id) {
        return load("select * from t_user_basic where id = ? ", id);
    }
}
