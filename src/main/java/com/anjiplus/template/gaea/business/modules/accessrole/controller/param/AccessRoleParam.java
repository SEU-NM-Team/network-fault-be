/**/
package com.anjiplus.template.gaea.business.modules.accessrole.controller.param;

import lombok.Data;
import java.io.Serializable;
import com.anji.plus.gaea.annotation.Query;
import com.anji.plus.gaea.constant.QueryEnum;
import com.anji.plus.gaea.curd.params.PageParam;


@Data
public class AccessRoleParam extends PageParam implements Serializable{

    /** 角色编码 */
    @Query(value = QueryEnum.LIKE)
    private String roleCode;

    // 角色名称
    @Query(value = QueryEnum.LIKE)
    private String roleName;

    // 0--已禁用 1--已启用  DIC_NAME=ENABLE_FLAG
    @Query
    private Integer enableFlag;

}