package com.cmdb.cmdb.service;

import com.cmdb.cmdb.entity.CmdbUser;

import java.util.List;

/**
 * @Title:
 * @Description:
 * @Author: 凌晨
 * @Date: 2019/6/26 13:59
 */
public interface CmdbUserService {
    List<CmdbUser> selectAll();

    CmdbUser selectById(int id);

    void addUser(CmdbUser cmdbUser);

    int deleteUser(int id);

    int updateUser(CmdbUser cmdbUser);
}
