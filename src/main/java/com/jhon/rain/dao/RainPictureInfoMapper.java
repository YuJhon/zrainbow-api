package com.jhon.rain.dao;

import com.jhon.rain.domain.RainPictureInfo;

import java.util.List;
/**
 * <p>功能描述</br>图片信息DAO</p>
 *
 * @author jiangy19
 * @version v1.0
 * @projectName zrainbow-api
 * @date 2018/1/30 19:47
 */
public interface RainPictureInfoMapper {

  int deleteByPrimaryKey(Integer id);

  int insert(RainPictureInfo record);

  int insertSelective(RainPictureInfo record);

  RainPictureInfo selectByPrimaryKey(Integer id);

  int updateByPrimaryKeySelective(RainPictureInfo record);

  int updateByPrimaryKey(RainPictureInfo record);
}