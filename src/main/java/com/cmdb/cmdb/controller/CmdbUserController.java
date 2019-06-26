package com.cmdb.cmdb.controller;

import com.cmdb.cmdb.entity.CmdbUser;
import com.cmdb.cmdb.service.CmdbUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Title:
 * @Description:
 * @Author: 凌晨
 * @Date: 2019/6/26 11:29
 */

@RestController
public class CmdbUserController {

    @Autowired
    private CmdbUserService cmdbUserService;

    @ResponseBody
    @RequestMapping("/getUser")
    public List<CmdbUser> getUser(){
        return  cmdbUserService.selectAll();
    }
}
