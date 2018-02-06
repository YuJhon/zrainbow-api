package com.jhon.rain.domain;

import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>功能描述</br>资讯信息表</p>
 *
 * @author jiangy19
 * @version v1.0
 * @projectName zrainbow-api
 * @date 2018/1/30 19:47
 */
public class RainNewsInfo {
  private Integer id;

  private String title;

  private String summary;

  private Integer scan;

  private String coverImg;

  private String author;

  private Date publishTime;

  private BigDecimal sort;

  private String content;

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

  public String getSummary() {
    return summary;
  }

  public void setSummary(String summary) {
    this.summary = summary == null ? null : summary.trim();
  }

  public Integer getScan() {
    return scan;
  }

  public void setScan(Integer scan) {
    this.scan = scan;
  }

  public String getCoverImg() {
    return coverImg;
  }

  public void setCoverImg(String coverImg) {
    this.coverImg = coverImg == null ? null : coverImg.trim();
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author == null ? null : author.trim();
  }

  public Date getPublishTime() {
    return publishTime;
  }

  public void setPublishTime(Date publishTime) {
    this.publishTime = publishTime;
  }

  public BigDecimal getSort() {
    return sort;
  }

  public void setSort(BigDecimal sort) {
    this.sort = sort;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content == null ? null : content.trim();
  }
}