package com.jhon.rain.domain;

import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>功能描述</br>商品信息表</p>
 *
 * @author jiangy19
 * @version v1.0
 * @projectName zrainbow-api
 * @date 2018/1/30 19:47
 */
public class RainGoodsInfo {
  private Integer id;

  private String name;

  private String description;

  private Integer productInfo;

  private Integer scan;

  private BigDecimal marketPrice;

  private BigDecimal sellPrice;

  private Date addTime;

  private String coverImg;

  private String serialNum;

  private Integer stockQuantity;

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

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description == null ? null : description.trim();
  }

  public Integer getProductInfo() {
    return productInfo;
  }

  public void setProductInfo(Integer productInfo) {
    this.productInfo = productInfo;
  }

  public Integer getScan() {
    return scan;
  }

  public void setScan(Integer scan) {
    this.scan = scan;
  }

  public BigDecimal getMarketPrice() {
    return marketPrice;
  }

  public void setMarketPrice(BigDecimal marketPrice) {
    this.marketPrice = marketPrice;
  }

  public BigDecimal getSellPrice() {
    return sellPrice;
  }

  public void setSellPrice(BigDecimal sellPrice) {
    this.sellPrice = sellPrice;
  }

  public Date getAddTime() {
    return addTime;
  }

  public void setAddTime(Date addTime) {
    this.addTime = addTime;
  }

  public String getCoverImg() {
    return coverImg;
  }

  public void setCoverImg(String coverImg) {
    this.coverImg = coverImg == null ? null : coverImg.trim();
  }

  public String getSerialNum() {
    return serialNum;
  }

  public void setSerialNum(String serialNum) {
    this.serialNum = serialNum == null ? null : serialNum.trim();
  }

  public Integer getStockQuantity() {
    return stockQuantity;
  }

  public void setStockQuantity(Integer stockQuantity) {
    this.stockQuantity = stockQuantity;
  }

  public BigDecimal getSort() {
    return sort;
  }

  public void setSort(BigDecimal sort) {
    this.sort = sort;
  }
}