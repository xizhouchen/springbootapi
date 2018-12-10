package org.spring.springboot.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.spring.springboot.domain.AreaExample;
import org.spring.springboot.mapper.AreaMapper;
import org.spring.springboot.domain.Area;
import org.spring.springboot.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 城市业务逻辑实现类
 *
 * Created by bysocket on 07/02/2017.
 */
@Service
public class AreaServiceImpl implements AreaService {

    @Autowired
    private AreaMapper areaMapper;

    public PageInfo<Area> findAllArea(){

        AreaExample exa = new AreaExample();
        AreaExample.Criteria cri = exa.createCriteria();

        cri.andNameEqualTo("jacky");
        PageHelper.startPage(1, 2);
        List<Area> list = areaMapper.selectByExample(exa);
        PageInfo<Area> appsPageInfo = new PageInfo<Area>(list);
        return appsPageInfo;
    }

    @Override
    public Area findAreaById(int id) {
        return areaMapper.selectByPrimaryKey(id);
    }



    @Override
    public int saveArea(Area area) {
        return areaMapper.insert(area);
    }

    @Override
    public int updateArea(Area area) {
        return areaMapper.updateByPrimaryKey(area);
    }


    @Override
    public int deleteArea(int id) {
        return areaMapper.deleteByPrimaryKey(id);
    }

}
