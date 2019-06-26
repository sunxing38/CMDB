package com.cmdb.cmdb.dao;

import com.cmdb.cmdb.entity.CmdbUser;
import com.cmdb.cmdb.entity.CmdbUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CmdbUserMapper {
    long countByExample(CmdbUserExample example);

    int deleteByExample(CmdbUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CmdbUser record);

    int insertSelective(CmdbUser record);

    List<CmdbUser> selectByExample(int example);

    CmdbUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CmdbUser record, @Param("example") CmdbUserExample example);

    int updateByExample(@Param("record") CmdbUser record, @Param("example") CmdbUserExample example);

    int updateByPrimaryKeySelective(CmdbUser record);

    int updateByPrimaryKey(CmdbUser record);

    List<CmdbUser> selectAll();
}