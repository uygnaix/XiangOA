/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.xiang.modules.crm.dao;

import com.thinkgem.jeesite.common.persistence.CrudDao;
import com.thinkgem.jeesite.common.persistence.annotation.MyBatisDao;
import com.xiang.modules.crm.entity.CrmModified;

/**
 * 修改记录管理DAO接口
 * @author Xiang
 * @version 2017-02-28
 */
@MyBatisDao
public interface CrmModifiedDao extends CrudDao<CrmModified> {
	
}