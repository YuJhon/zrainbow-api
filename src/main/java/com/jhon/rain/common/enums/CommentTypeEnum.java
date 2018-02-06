package com.jhon.rain.common.enums;

/**
 * <p>功能描述</br></p>
 *
 * @author jiangy19
 * @version v1.0
 * @projectName zrainbow-api
 * @date 2018/2/5 15:13
 */
public enum CommentTypeEnum {
  NEWS(1, "NEWS"), GOODS(2, "GOODS"),PICTURE(3,"PICTURE");

  public Integer value;

  public String desc;

  CommentTypeEnum(Integer value, String desc) {
    this.value = value;
    this.desc = desc;
  }

  public Integer getValue() {
    return value;
  }

  public String getDesc() {
    return desc;
  }

  public static CommentTypeEnum getTypeByValue(String value) {
    for (CommentTypeEnum typeEnum : CommentTypeEnum.values()) {
      if (typeEnum.getDesc().equals(value)) {
        return typeEnum;
      }
    }
    return null;
  }
}
