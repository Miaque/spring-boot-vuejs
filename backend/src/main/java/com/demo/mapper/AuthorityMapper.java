package com.demo.mapper;

import com.demo.entity.Authority;
import com.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface AuthorityMapper {

    @Select("select * from authority where id in ( select authority_id from user_authority where user_id = #{id})")
    List<Authority> findAuthoritiesByUser(User user);

    @Select("select * from authority where id in ( select authority_id from user_authority where user_id = #{id})")
    List<Authority> findAuthoritiesByUserId(@Param("id") Long id);

}
