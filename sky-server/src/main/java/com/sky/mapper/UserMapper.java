package com.sky.mapper;

import com.sky.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.Map;

@Mapper
public interface UserMapper {
    @Select("SELECT * FROM user WHERE openid = #{openid}")
    User getByOpenid(String openid);

    void insert(User user);

    @Select("SELECT * FROM user WHERE id = #{id}")
    User getById(Long userId);

    /**
     * 统计用户数量
     * @param map
     * @return
     */
    Integer countByMap(Map map);
}
