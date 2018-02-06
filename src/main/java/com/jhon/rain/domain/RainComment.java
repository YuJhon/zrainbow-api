package com.jhon.rain.domain;

import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>功能描述</br>评论表</p>
 *
 * @author jiangy19
 * @version v1.0
 * @projectName zrainbow-api
 * @date 2018/1/30 19:47
 */
public class RainComment {
  private Integer id;

  private Integer type;

  private Integer newsInfo;

  private Integer pictureInfo;

  private Integer goodsInfo;

  private Date createdTime;

  private String content;

  private BigDecimal sort;

  private String username;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getType() {
    return type;
  }

  public void setType(Integer type) {
    this.type = type;
  }

  public Integer getNewsInfo() {
    return newsInfo;
  }

  public void setNewsInfo(Integer newsInfo) {
    this.newsInfo = newsInfo;
  }

  public Integer getPictureInfo() {
    return pictureInfo;
  }

  public void setPictureInfo(Integer pictureInfo) {
    this.pictureInfo = pictureInfo;
  }

  public Integer getGoodsInfo() {
    return goodsInfo;
  }

  public void setGoodsInfo(Integer goodsInfo) {
    this.goodsInfo = goodsInfo;
  }

  public Date getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(Date createdTime) {
    this.createdTime = createdTime;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content == null ? null : content.trim();
  }

  public BigDecimal getSort() {
    return sort;
  }

  public void setSort(BigDecimal sort) {
    this.sort = sort;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }
}