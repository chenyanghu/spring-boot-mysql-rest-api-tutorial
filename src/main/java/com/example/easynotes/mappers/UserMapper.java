package com.example.easynotes.mappers;

import com.example.easynotes.model.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("select * from users")
    public List<User> getUserList();
    @Delete("delete from users where id = #{id, jdbcType=BIGINT}")
    public int deleteByPrimaryKey(Long id);
}
