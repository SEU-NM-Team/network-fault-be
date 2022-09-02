
package com.anjiplus.template.gaea.business.modules.datasource.controller;

import com.anji.plus.gaea.annotation.Permission;
import com.anji.plus.gaea.bean.ResponseBean;
import com.anji.plus.gaea.curd.controller.GaeaBaseController;
import com.anji.plus.gaea.curd.service.GaeaBaseService;
import com.anjiplus.template.gaea.business.modules.datasource.controller.dto.DataSourceDto;
import com.anjiplus.template.gaea.business.modules.datasource.controller.param.ConnectionParam;
import com.anjiplus.template.gaea.business.modules.datasource.controller.param.DataSourceParam;
import com.anjiplus.template.gaea.business.modules.datasource.dao.entity.DataSource;
import com.anjiplus.template.gaea.business.modules.datasource.service.DataSourceService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


@RestController
@Api(tags = "数据源管理")
@Permission(code = "datasourceManage", name = "数据源管理")
@RequestMapping("/dataSource")
public class DataSourceController extends GaeaBaseController<DataSourceParam, DataSource, DataSourceDto> {

    @Autowired
    private DataSourceService dataSourceService;

    @Override
    public GaeaBaseService<DataSourceParam, DataSource> getService() {
        return dataSourceService;
    }

    @Override
    public DataSource getEntity() {
        return new DataSource();
    }

    @Override
    public DataSourceDto getDTO() {
        return new DataSourceDto();
    }

    /**
     * 获取所有数据源
     * @return
     */
    @GetMapping("/queryAllDataSource")
    public ResponseBean queryAllDataSource() {
        return responseSuccessWithData(dataSourceService.queryAllDataSource());
    }

    /**
     * 测试 连接
     * @param connectionParam
     * @return
     */
    @Permission( code = "query", name = "测试数据源")
    @PostMapping("/testConnection")
    public ResponseBean testConnection(@Validated @RequestBody ConnectionParam connectionParam) {
        return responseSuccessWithData(dataSourceService.testConnection(connectionParam));
    }

}
