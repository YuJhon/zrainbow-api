package com.jhon.rain.dao;

import com.jhon.rain.domain.RainCoverPicture;

import java.util.List;

/**
 * <p>功能描述</br>轮播图片DAO</p>
 *
 * @author jiangy19
 * @version v1.0
 * @projectName zrainbow-api
 * @date 2018/1/30 19:47
 */
public interface RainCoverPictureMapper {

  int deleteByPrimaryKey(Integer id);

  int insert(RainCoverPicture record);

  int insertSelective(RainCoverPicture record);

  RainCoverPicture selectByPrimaryKey(Integer id);

  int updateByPrimaryKeySelective(RainCoverPicture record);

  int updateByPrimaryKey(RainCoverPicture record);

  List<RainCoverPicture> queryAll();
}