package com.jhon.rain.domain;

import java.math.BigDecimal;
/**
 * <p>功能描述</br>图片类目表</p>
 *
 * @author jiangy19
 * @version v1.0
 * @projectName zrainbow-api
 * @date 2018/1/30 19:47
 */
public class RainPictureCategory {
  private Integer id;

  private String name;

  private BigDecimal sort;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name == null ? null : name.trim();
  }

  public BigDecimal getSort() {
    return sort;
  }

  public void setSort(BigDecimal sort) {
    this.sort = sort;
  }
}