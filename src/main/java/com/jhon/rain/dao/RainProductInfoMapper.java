package com.jhon.rain.dao;

import com.jhon.rain.domain.RainProductInfo;

import java.util.List;
/**
 * <p>功能描述</br>品牌信息DAO</p>
 *
 * @author jiangy19
 * @version v1.0
 * @projectName zrainbow-api
 * @date 2018/1/30 19:47
 */
public interface RainProductInfoMapper {

  int deleteByPrimaryKey(Integer id);

  int insert(RainProductInfo record);

  int insertSelective(RainProductInfo record);

  RainProductInfo selectByPrimaryKey(Integer id);

  int updateByPrimaryKeySelective(RainProductInfo record);

  int updateByPrimaryKey(RainProductInfo record);
}