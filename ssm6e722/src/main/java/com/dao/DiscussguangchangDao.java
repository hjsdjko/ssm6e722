package com.dao;

import com.entity.DiscussguangchangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussguangchangVO;
import com.entity.view.DiscussguangchangView;


/**
 * 广场评论表
 * 
 * @author 
 * @email 
 * @date 2021-05-15 10:59:31
 */
public interface DiscussguangchangDao extends BaseMapper<DiscussguangchangEntity> {
	
	List<DiscussguangchangVO> selectListVO(@Param("ew") Wrapper<DiscussguangchangEntity> wrapper);
	
	DiscussguangchangVO selectVO(@Param("ew") Wrapper<DiscussguangchangEntity> wrapper);
	
	List<DiscussguangchangView> selectListView(@Param("ew") Wrapper<DiscussguangchangEntity> wrapper);

	List<DiscussguangchangView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussguangchangEntity> wrapper);
	
	DiscussguangchangView selectView(@Param("ew") Wrapper<DiscussguangchangEntity> wrapper);
	
}
