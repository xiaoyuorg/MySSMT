package com.xiaoyu.dao;

import com.xiaoyu.pojo.UserT;
import com.xiaoyu.pojo.UserTExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserTMapper {
    int countByExample(UserTExample example);

    int deleteByExample(UserTExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserT record);

    int insertSelective(UserT record);

    List<UserT> selectByExample(UserTExample example);

    UserT selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserT record, @Param("example") UserTExample example);

    int updateByExample(@Param("record") UserT record, @Param("example") UserTExample example);

    int updateByPrimaryKeySelective(UserT record);

    int updateByPrimaryKey(UserT record);
}