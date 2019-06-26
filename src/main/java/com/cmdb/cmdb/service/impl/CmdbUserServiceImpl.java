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
    public List<CmdbUser> selectAll() {
        return cmdbUserMapper.selectAll();
    }

    @Override
    public List<CmdbUser> selectById(int id) {
        return cmdbUserMapper.selectByExample(id);
    }
}
