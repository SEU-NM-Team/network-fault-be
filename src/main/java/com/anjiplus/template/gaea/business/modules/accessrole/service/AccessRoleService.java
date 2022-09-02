
package com.anjiplus.template.gaea.business.modules.accessrole.service;

import com.anjiplus.template.gaea.business.modules.accessrole.controller.dto.AccessRoleDto;
import com.anjiplus.template.gaea.business.modules.accessrole.dao.entity.AccessRole;
import com.anjiplus.template.gaea.business.modules.accessrole.controller.param.AccessRoleParam;
import com.anji.plus.gaea.curd.service.GaeaBaseService;

import java.util.Map;


public interface AccessRoleService extends GaeaBaseService<AccessRoleParam, AccessRole> {

    /** 查询某角色的权限树
     * @param roleCode 被操作的对象
     * @param operator 当前登录者
     * @return
     */
    Map getAuthorityTree(String roleCode, String operator);


    /** 保存角色的权限
     * @param accessRoleDto
     * @return
     */
    Boolean saveAuthorityTree(AccessRoleDto accessRoleDto);
}