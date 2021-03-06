/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.zh.star.dao;

import com.thinkgem.jeesite.common.persistence.CrudDao;
import com.thinkgem.jeesite.common.persistence.annotation.MyBatisDao;
import com.thinkgem.jeesite.modules.zh.star.entity.StarAlbum;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 相册DAO接口
 * @author 王子鹏
 * @version 2018-11-06
 */
@MyBatisDao
public interface StarAlbumDao extends CrudDao<StarAlbum> {

//    String getPhotoUrls(String id);
    List getPhotoUrls(@Param("id") String id);
}