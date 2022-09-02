package com.anjiplus.template.gaea.business.modules.accessrole.dao.entity;

import com.anji.plus.gaea.curd.entity.GaeaBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;


@TableName(keepGlobalPrefix=true, value="access_role_authority")
@Data
public class AccessRoleAuthority extends GaeaBaseEntity {

    /** 角色编码 */
    private String roleCode;

    /** 菜单代码 */
    private String target;

    /** 按钮代码 */
    private String action;

    @TableField(exist = false)
    private String createBy;

    @TableField(exist = false)
    private Date createTime;

    @TableField(exist = false)
    private String updateBy;

    @TableField(exist = false)
    private Date updateTime;

    @TableField(exist = false)
    private Integer version;
}
