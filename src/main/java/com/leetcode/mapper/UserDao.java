package com.leetcode.mapper;

import com.leetcode.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * (User)表数据库访问层
 *
 * @author makejava
 * @since 2021-02-7 21:09:17
 */
@Repository
public interface UserDao {
    public User selectImageById(@Param("userId") Integer userId);
}
