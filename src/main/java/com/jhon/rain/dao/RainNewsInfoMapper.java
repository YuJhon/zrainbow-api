package com.jhon.rain.dao;

import com.jhon.rain.domain.RainNewsInfo;

import java.util.List;

/**
 * <p>功能描述</br>资讯信息DAO</p>
 *
 * @author jiangy19
 * @version v1.0
 * @projectName zrainbow-api
 * @date 2018/1/30 19:47
 */
public interface RainNewsInfoMapper {

  int deleteByPrimaryKey(Integer id);

  int insert(RainNewsInfo record);

  int insertSelective(RainNewsInfo record);

  RainNewsInfo selectByPrimaryKey(Integer id);

  int updateByPrimaryKeySelective(RainNewsInfo record);

  int updateByPrimaryKeyWithBLOBs(RainNewsInfo record);

  int updateByPrimaryKey(RainNewsInfo record);

  List<RainNewsInfo> queryAll();
}