package com.jhon.rain.service.impl;

import com.jhon.rain.common.dto.RainGoodsDetailDTO;
import com.jhon.rain.dao.RainGoodsDetailMapper;
import com.jhon.rain.domain.RainGoodsDetail;
import com.jhon.rain.service.RainGoodsDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>功能描述</br>商品详情业务逻辑实现类</p>
 *
 * @author jiangy19
 * @version v1.0
 * @projectName zrainbow-api
 * @date 2018/1/30 20:16
 */
@Service
@Transactional
public class RainGoodsDetailServiceImpl implements RainGoodsDetailService {

  @Autowired
  private RainGoodsDetailMapper rainGoodsDetailMapper;

  @Override
  public RainGoodsDetailDTO queryByGoodsInfo(Integer goodsId) {
    return rainGoodsDetailMapper.queryRecordByGoodsId(goodsId);
  }
}
