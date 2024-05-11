package com.entity.view;

import com.entity.GuangchangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 广场
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-15 10:59:31
 */
@TableName("guangchang")
public class GuangchangView  extends GuangchangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public GuangchangView(){
	}
 
 	public GuangchangView(GuangchangEntity guangchangEntity){
 	try {
			BeanUtils.copyProperties(this, guangchangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
