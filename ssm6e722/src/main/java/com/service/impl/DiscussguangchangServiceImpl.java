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


import com.dao.DiscussguangchangDao;
import com.entity.DiscussguangchangEntity;
import com.service.DiscussguangchangService;
import com.entity.vo.DiscussguangchangVO;
import com.entity.view.DiscussguangchangView;

@Service("discussguangchangService")
public class DiscussguangchangServiceImpl extends ServiceImpl<DiscussguangchangDao, DiscussguangchangEntity> implements DiscussguangchangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussguangchangEntity> page = this.selectPage(
                new Query<DiscussguangchangEntity>(params).getPage(),
                new EntityWrapper<DiscussguangchangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussguangchangEntity> wrapper) {
		  Page<DiscussguangchangView> page =new Query<DiscussguangchangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussguangchangVO> selectListVO(Wrapper<DiscussguangchangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussguangchangVO selectVO(Wrapper<DiscussguangchangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussguangchangView> selectListView(Wrapper<DiscussguangchangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussguangchangView selectView(Wrapper<DiscussguangchangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
