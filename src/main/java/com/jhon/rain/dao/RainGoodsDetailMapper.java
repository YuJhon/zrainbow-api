package com.jhon.rain.dao;

import com.jhon.rain.common.dto.RainGoodsDetailDTO;
import com.jhon.rain.domain.RainGoodsDetail;

import java.util.List;
/**
 * <p>功能描述</br>商品详细信息DAO</p>
 *
 * @author jiangy19
 * @version v1.0
 * @projectName zrainbow-api
 * @date 2018/1/30 19:47
 */
public interface RainGoodsDetailMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(RainGoodsDetail record);

    int insertSelective(RainGoodsDetail record);

    RainGoodsDetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RainGoodsDetail record);

    int updateByPrimaryKeyWithBLOBs(RainGoodsDetail record);

    int updateByPrimaryKey(RainGoodsDetail record);

    RainGoodsDetailDTO queryRecordByGoodsId(Integer goodsId);
}