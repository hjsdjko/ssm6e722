package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GuangchangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GuangchangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GuangchangView;


/**
 * 广场
 *
 * @author 
 * @email 
 * @date 2021-05-15 10:59:31
 */
public interface GuangchangService extends IService<GuangchangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GuangchangVO> selectListVO(Wrapper<GuangchangEntity> wrapper);
   	
   	GuangchangVO selectVO(@Param("ew") Wrapper<GuangchangEntity> wrapper);
   	
   	List<GuangchangView> selectListView(Wrapper<GuangchangEntity> wrapper);
   	
   	GuangchangView selectView(@Param("ew") Wrapper<GuangchangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GuangchangEntity> wrapper);
   	
}

