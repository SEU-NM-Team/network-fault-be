package com.anjiplus.template.gaea.business.modules.accessuser.dao;

import org.apache.ibatis.annotations.Mapper;
import com.anji.plus.gaea.curd.mapper.GaeaBaseMapper;
import com.anjiplus.template.gaea.business.modules.accessuser.dao.entity.AccessUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface AccessUserMapper extends GaeaBaseMapper<AccessUser> {

    /** 查询用户所拥有的所有角色下的权限
     * @param loginName
     * @return
     */
    List<String> queryAuthoritiesByLoginName(@Param("loginName")String loginName);
}