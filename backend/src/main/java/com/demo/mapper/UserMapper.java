package com.demo.mapper;

import com.demo.entity.User;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

@Mapper
public interface UserMapper {

    @Select("select * from user where username = #{username}")
    @Results({
        @Result(column = "id", property = "authorities",
            many = @Many(select = "com.demo.mapper.AuthorityMapper.findAuthoritiesByUserId",
                fetchType = FetchType.LAZY))
    })
    User findByUsername(@Param("username") String username);

}
