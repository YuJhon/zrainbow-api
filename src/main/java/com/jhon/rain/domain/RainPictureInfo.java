package com.jhon.rain.domain;

import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>功能描述</br>图片信息</p>
 *
 * @author jiangy19
 * @version v1.0
 * @projectName zrainbow-api
 * @date 2018/1/30 19:47
 */
public class RainPictureInfo {
  private Integer id;

  private String title;

  private String coverImg;

  private String summary;

  private Integer pictureCategory;

  private BigDecimal sort;

  private Integer scan;

  private Date addTime;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title == null ? null : title.trim();
  }

  public String getCoverImg() {
    return coverImg;
  }

  public void setCoverImg(String coverImg) {
    this.coverImg = coverImg == null ? null : coverImg.trim();
  }

  public String getSummary() {
    return summary;
  }

  public void setSummary(String summary) {
    this.summary = summary == null ? null : summary.trim();
  }

  public Integer getPictureCategory() {
    return pictureCategory;
  }

  public void setPictureCategory(Integer pictureCategory) {
    this.pictureCategory = pictureCategory;
  }

  public BigDecimal getSort() {
    return sort;
  }

  public void setSort(BigDecimal sort) {
    this.sort = sort;
  }

  public Integer getScan() {
    return scan;
  }

  public void setScan(Integer scan) {
    this.scan = scan;
  }

  public Date getAddTime() {
    return addTime;
  }

  public void setAddTime(Date addTime) {
    this.addTime = addTime;
  }
}