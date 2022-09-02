package com.anjiplus.template.gaea.business.modules.accessrole.dao;

import org.apache.ibatis.annotations.Mapper;
import com.anji.plus.gaea.curd.mapper.GaeaBaseMapper;
import com.anjiplus.template.gaea.business.modules.accessrole.dao.entity.AccessRole;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface AccessRoleMapper extends GaeaBaseMapper<AccessRole> {

    List<String> checkedAuthoritys(@Param("roleCode")String roleCode);
}