package com.jhon.rain.dao;

import com.jhon.rain.common.dto.RainGoodsInfoDTO;
import com.jhon.rain.domain.RainGoodsInfo;

import java.util.List;
/**
 * <p>功能描述</br>商品信息DAO</p>
 *
 * @author jiangy19
 * @version v1.0
 * @projectName zrainbow-api
 * @date 2018/1/30 19:47
 */
public interface RainGoodsInfoMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(RainGoodsInfo record);

    int insertSelective(RainGoodsInfo record);

    RainGoodsInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RainGoodsInfo record);

    int updateByPrimaryKey(RainGoodsInfo record);

    List<RainGoodsInfoDTO> queryRecordByIds(List<String> ids);

    List<RainGoodsInfo> queryAll();

}