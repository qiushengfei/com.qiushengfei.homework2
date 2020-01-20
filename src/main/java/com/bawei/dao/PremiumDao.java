package com.bawei.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bawei.entity.Premium;

public interface PremiumDao {

	List<Premium> list(@Param("id") Integer id);

	Premium selectById(@Param("id") Integer id);

	List<Premium> option();

	boolean update(Premium p);
	

}
