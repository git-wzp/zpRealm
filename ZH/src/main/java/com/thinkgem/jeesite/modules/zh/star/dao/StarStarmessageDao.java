/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.zh.star.dao;

import com.thinkgem.jeesite.common.persistence.CrudDao;
import com.thinkgem.jeesite.common.persistence.annotation.MyBatisDao;
import com.thinkgem.jeesite.modules.zh.star.entity.StarStarmessage;

/**
 * 明星资料DAO接口
 * @author 王子鹏
 * @version 2018-10-31
 */
@MyBatisDao
public interface StarStarmessageDao extends CrudDao<StarStarmessage> {
	
}