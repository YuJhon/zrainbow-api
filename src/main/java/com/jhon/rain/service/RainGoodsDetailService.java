package com.jhon.rain.service;

import com.jhon.rain.common.dto.RainGoodsDetailDTO;
import com.jhon.rain.domain.RainGoodsDetail;

/**
 * <p>功能描述</br></p>
 *
 * @author jiangy19
 * @version v1.0
 * @projectName zrainbow-api
 * @date 2018/1/30 19:45
 */
public interface RainGoodsDetailService {
  /**
   * <pre>通过商品id查询商品的详情</pre>
   *
   * @param goodsId 商品ID
   * @return
   */
  RainGoodsDetailDTO queryByGoodsInfo(Integer goodsId);
}
