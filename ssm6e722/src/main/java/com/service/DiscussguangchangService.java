package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussguangchangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussguangchangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussguangchangView;


/**
 * 广场评论表
 *
 * @author 
 * @email 
 * @date 2021-05-15 10:59:31
 */
public interface DiscussguangchangService extends IService<DiscussguangchangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussguangchangVO> selectListVO(Wrapper<DiscussguangchangEntity> wrapper);
   	
   	DiscussguangchangVO selectVO(@Param("ew") Wrapper<DiscussguangchangEntity> wrapper);
   	
   	List<DiscussguangchangView> selectListView(Wrapper<DiscussguangchangEntity> wrapper);
   	
   	DiscussguangchangView selectView(@Param("ew") Wrapper<DiscussguangchangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussguangchangEntity> wrapper);
   	
}

