package org.spring.springboot.service;

import org.spring.springboot.domain.Area;
import com.github.pagehelper.PageInfo;
import java.util.List;

/**
 * 城市业务逻辑接口类
 *
 * Created by bysocket on 07/02/2017.
 */
public interface AreaService {

    /**
     * 获取城市信息列表
     *
     * @return
     */
    PageInfo<Area> findAllArea();

    /**
     * 根据城市 ID,查询城市信息
     *
     * @param id
     * @return
     */
    Area findAreaById(int id);

    /**
     * 新增城市信息
     *
     * @param area
     * @return
     */
    int saveArea(Area area);

    /**
     * 更新城市信息
     *
     * @param area
     * @return
     */
    int updateArea(Area area);

    /**
     * 根据城市 ID,删除城市信息
     *
     * @param id
     * @return
     */
    int deleteArea(int id);
}
