package com.jhon.rain.common.dto;

import lombok.Data;

import java.math.BigDecimal;

/**
 * <p>功能描述</br>商品信息值转换对象</p>
 *
 * @author jiangy19
 * @version v1.0
 * @projectName zrainbow-api
 * @date 2018/2/6 9:07
 */
@Data
public class RainGoodsInfoDTO {

  /**
   * 主键ID
   */
  private Integer id;
  /**
   * 商品名称
   */
  private String name;
  /**
   * 浏览量
   */
  private Integer scan;
  /**
   * 封面图片
   */
  private String coverImg;
  /**
   * 销售价
   */
  private BigDecimal sellPrice;
}
