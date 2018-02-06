package com.jhon.rain.domain;

import java.math.BigDecimal;

/**
 * <p>功能描述</br>图片缩略图表</p>
 *
 * @author jiangy19
 * @version v1.0
 * @projectName zrainbow-api
 * @date 2018/1/30 19:47
 */
public class RainPictureThum {
  private Integer id;

  private String srcUrl;

  private Integer pictureInfo;

  private BigDecimal sort;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getSrcUrl() {
    return srcUrl;
  }

  public void setSrcUrl(String srcUrl) {
    this.srcUrl = srcUrl == null ? null : srcUrl.trim();
  }

  public Integer getPictureInfo() {
    return pictureInfo;
  }

  public void setPictureInfo(Integer pictureInfo) {
    this.pictureInfo = pictureInfo;
  }

  public BigDecimal getSort() {
    return sort;
  }

  public void setSort(BigDecimal sort) {
    this.sort = sort;
  }
}