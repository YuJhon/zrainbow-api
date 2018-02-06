package com.jhon.rain.domain;

import java.math.BigDecimal;

/**
 * <p>功能描述</br>轮播图片</p>
 *
 * @author jiangy19
 * @version v1.0
 * @projectName zrainbow-api
 * @date 2018/1/30 19:47
 */
public class RainCoverPicture {
  private Integer id;

  private String image;

  private BigDecimal sort;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image == null ? null : image.trim();
  }

  public BigDecimal getSort() {
    return sort;
  }

  public void setSort(BigDecimal sort) {
    this.sort = sort;
  }
}