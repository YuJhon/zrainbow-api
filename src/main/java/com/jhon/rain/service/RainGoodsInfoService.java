package com.jhon.rain.service;

import com.jhon.rain.common.dto.RainGoodsInfoDTO;
import com.jhon.rain.domain.RainGoodsInfo;

import java.util.List;

/**
 * <p>功能描述</br>商品信息业务逻辑接口定义</p>
 *
 * @author jiangy19
 * @version v1.0
 * @projectName zrainbow-api
 * @date 2018/1/30 19:45
 */
public interface RainGoodsInfoService {
  /**
   * <pre>通过id查询记录</pre>
   *
   * @param ids 以逗号分隔开的记录
   * @return 对应先商品部分信息列表
   */
  List<RainGoodsInfoDTO> queryRecordByIds(String ids);

  /**
   * <pre>查询所有的商品列表</pre>
   *
   * @return
   */
  List<RainGoodsInfo> queryAll();

  /**
   * <pre>获取商品信息</pre>
   * @param id 主键ID
   * @return 查询商品信息
   */
  RainGoodsInfo queryByGoodsInfo(Integer id);
}
