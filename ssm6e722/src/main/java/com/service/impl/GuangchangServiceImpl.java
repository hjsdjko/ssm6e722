package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.GuangchangDao;
import com.entity.GuangchangEntity;
import com.service.GuangchangService;
import com.entity.vo.GuangchangVO;
import com.entity.view.GuangchangView;

@Service("guangchangService")
public class GuangchangServiceImpl extends ServiceImpl<GuangchangDao, GuangchangEntity> implements GuangchangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GuangchangEntity> page = this.selectPage(
                new Query<GuangchangEntity>(params).getPage(),
                new EntityWrapper<GuangchangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GuangchangEntity> wrapper) {
		  Page<GuangchangView> page =new Query<GuangchangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GuangchangVO> selectListVO(Wrapper<GuangchangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GuangchangVO selectVO(Wrapper<GuangchangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GuangchangView> selectListView(Wrapper<GuangchangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GuangchangView selectView(Wrapper<GuangchangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
