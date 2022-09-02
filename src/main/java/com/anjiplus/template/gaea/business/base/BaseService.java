package com.anjiplus.template.gaea.business.base;

import com.anji.plus.gaea.curd.entity.BaseEntity;
import com.anji.plus.gaea.curd.params.PageParam;
import com.anji.plus.gaea.curd.service.GaeaBaseService;


public interface BaseService<P extends PageParam, T extends BaseEntity> extends GaeaBaseService<P, T> {

}
