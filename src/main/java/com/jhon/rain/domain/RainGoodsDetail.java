package com.jhon.rain.domain;

/**
 * <p>功能描述</br>商品详情</p>
 *
 * @author jiangy19
 * @version v1.0
 * @projectName zrainbow-api
 * @date 2018/1/30 19:47
 */
public class RainGoodsDetail {
    private Integer id;

    private Integer goodsInfo;

    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGoodsInfo() {
        return goodsInfo;
    }

    public void setGoodsInfo(Integer goodsInfo) {
        this.goodsInfo = goodsInfo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}