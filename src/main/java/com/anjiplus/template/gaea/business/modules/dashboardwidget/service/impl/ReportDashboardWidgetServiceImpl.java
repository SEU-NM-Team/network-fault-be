
package com.anjiplus.template.gaea.business.modules.dashboardwidget.service.impl;

import com.anji.plus.gaea.curd.mapper.GaeaBaseMapper;

import com.anjiplus.template.gaea.business.modules.dashboardwidget.dao.entity.ReportDashboardWidget;
import com.anjiplus.template.gaea.business.modules.dashboardwidget.service.ReportDashboardWidgetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anjiplus.template.gaea.business.modules.dashboardwidget.dao.ReportDashboardWidgetMapper;

@Service
//@RequiredArgsConstructor
public class ReportDashboardWidgetServiceImpl implements ReportDashboardWidgetService {

    @Autowired
    private ReportDashboardWidgetMapper reportDashboardWidgetMapper;

    @Override
    public GaeaBaseMapper<ReportDashboardWidget> getMapper() {
      return reportDashboardWidgetMapper;
    }

    @Override
    public ReportDashboardWidget getDetail(Long id) {
        ReportDashboardWidget reportDashboardWidget = this.selectOne(id);
        return reportDashboardWidget;
    }
}
