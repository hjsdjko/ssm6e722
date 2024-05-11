package com.entity.view;

import com.entity.DiscussguangchangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 广场评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-15 10:59:31
 */
@TableName("discussguangchang")
public class DiscussguangchangView  extends DiscussguangchangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussguangchangView(){
	}
 
 	public DiscussguangchangView(DiscussguangchangEntity discussguangchangEntity){
 	try {
			BeanUtils.copyProperties(this, discussguangchangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
