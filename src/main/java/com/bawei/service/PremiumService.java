package com.bawei.service;

import java.util.List;

import com.bawei.entity.Premium;

public interface PremiumService {

	List<Premium> list(Integer id);

	Premium selectById(Integer id);

	List<Premium> option();

	boolean update(Premium p);

}
