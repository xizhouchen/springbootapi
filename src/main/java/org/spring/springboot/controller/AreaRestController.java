package org.spring.springboot.controller;

import org.spring.springboot.domain.Area;
import org.spring.springboot.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import com.github.pagehelper.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import java.util.List;

/**
 * 城市 Controller 实现 Restful HTTP 服务
 *
 * Created by bysocket on 07/02/2017.
 */
@Api("地区相关接口")
@RestController
public class AreaRestController {

    @Autowired
    private AreaService areaService;

    @ApiOperation(value = "根据id查询区域信息", notes = "查询数据库中某个区域信息")
    @RequestMapping(value = "/api/area/{id}", method = RequestMethod.GET)
    public Area findOneArea(@PathVariable("id") int id) {
        return areaService.findAreaById(id);
    }

    @RequestMapping(value = "/api/area", method = RequestMethod.GET)
    public PageInfo<Area> findAllArea() {
        return areaService.findAllArea();
    }

    @RequestMapping(value = "/api/area", method = RequestMethod.POST)
    public void createArea(@RequestBody Area area) {
        areaService.saveArea(area);
    }

    @RequestMapping(value = "/api/area", method = RequestMethod.PUT)
    public void modifyArea(@RequestBody Area area) {
        areaService.updateArea(area);
    }

    @RequestMapping(value = "/api/area/{id}", method = RequestMethod.DELETE)
    public void modifyArea(@PathVariable("id") int id) {
        areaService.deleteArea(id);
    }
}
