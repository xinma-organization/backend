package com.xinma.backend.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.xinma.backend.domain.User;

@Mapper
public interface UserMapper {

	@Select("SELECT * FROM user WHERE id = #{id}")
	User findById(@Param("id") Integer id);
}
