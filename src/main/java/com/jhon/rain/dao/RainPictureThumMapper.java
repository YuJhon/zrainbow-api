package com.jhon.rain.dao;

import com.jhon.rain.domain.RainPictureThum;

import java.util.List;
/**
 * <p>功能描述</br>图片缩略图DAO</p>
 *
 * @author jiangy19
 * @version v1.0
 * @projectName zrainbow-api
 * @date 2018/1/30 19:47
 */
public interface RainPictureThumMapper {

  int deleteByPrimaryKey(Integer id);

  int insert(RainPictureThum record);

  int insertSelective(RainPictureThum record);

  RainPictureThum selectByPrimaryKey(Integer id);

  int updateByPrimaryKeySelective(RainPictureThum record);

  int updateByPrimaryKey(RainPictureThum record);

  List<RainPictureThum> queryRecordByPictureInfo(Integer pictureInfo);
}