package com.dao;

import com.entity.GuangchangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GuangchangVO;
import com.entity.view.GuangchangView;


/**
 * 广场
 * 
 * @author 
 * @email 
 * @date 2021-05-15 10:59:31
 */
public interface GuangchangDao extends BaseMapper<GuangchangEntity> {
	
	List<GuangchangVO> selectListVO(@Param("ew") Wrapper<GuangchangEntity> wrapper);
	
	GuangchangVO selectVO(@Param("ew") Wrapper<GuangchangEntity> wrapper);
	
	List<GuangchangView> selectListView(@Param("ew") Wrapper<GuangchangEntity> wrapper);

	List<GuangchangView> selectListView(Pagination page,@Param("ew") Wrapper<GuangchangEntity> wrapper);
	
	GuangchangView selectView(@Param("ew") Wrapper<GuangchangEntity> wrapper);
	
}
