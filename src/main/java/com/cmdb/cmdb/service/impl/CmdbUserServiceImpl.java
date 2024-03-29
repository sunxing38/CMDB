package com.cmdb.cmdb.service.impl;

import com.cmdb.cmdb.dao.CmdbUserMapper;
import com.cmdb.cmdb.entity.CmdbUser;
import com.cmdb.cmdb.service.CmdbUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Title:
 * @Description:
 * @Author: 凌晨
 * @Date: 2019/6/26 14:00
 */

@Service
public class CmdbUserServiceImpl implements CmdbUserService {

    @Autowired
    private CmdbUserMapper cmdbUserMapper;

    @Override
    //管理员查询用户
    public List<CmdbUser> selectAll() {
        return cmdbUserMapper.selectAll();
    }

    @Override
    public CmdbUser selectById(int id) {
        return cmdbUserMapper.selectByPrimaryKey(id);
    }

    @Override
    //管理员添加新用户
    public void addUser(CmdbUser cmdbUser) {
        cmdbUserMapper.insertSelective(cmdbUser);
    }

    //管理员删除用户(注销)

    @Override
    public int deleteUser(int id) {
        return cmdbUserMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateUser(CmdbUser cmdbUser) {
        return cmdbUserMapper.updateByPrimaryKeySelective(cmdbUser);
    }
}
