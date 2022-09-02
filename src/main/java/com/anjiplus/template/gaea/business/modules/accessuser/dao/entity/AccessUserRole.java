
package com.anjiplus.template.gaea.business.modules.accessuser.dao.entity;

import com.anji.plus.gaea.curd.entity.GaeaBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;


@TableName(keepGlobalPrefix=true, value="access_user_role")
@Data
public class AccessUserRole extends GaeaBaseEntity {

    /**登录名 */
    private String loginName;

    /** 角色编码 */
    private String roleCode;

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
