package com.jhon.rain.dao;

import com.jhon.rain.domain.RainPictureCategory;

import java.util.List;

/**
 * <p>功能描述</br>图片类目DAO</p>
 *
 * @author jiangy19
 * @version v1.0
 * @projectName zrainbow-api
 * @date 2018/1/30 19:47
 */
public interface RainPictureCategoryMapper {

  int deleteByPrimaryKey(Integer id);

  int insert(RainPictureCategory record);

  int insertSelective(RainPictureCategory record);

  RainPictureCategory selectByPrimaryKey(Integer id);

  int updateByPrimaryKeySelective(RainPictureCategory record);

  int updateByPrimaryKey(RainPictureCategory record);

  List<RainPictureCategory> queryAll();
}