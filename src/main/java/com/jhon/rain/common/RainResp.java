package com.jhon.rain.common;

import lombok.Data;

/**
 * <p>功能描述</br>返回统一对象格式定义</p>
 *
 * @author jiangy19
 * @version v1.0
 * @projectName zrainbow-api
 * @date 2018/2/5 9:28
 */
@Data
public class RainResp {

  /**
   * 返回码
   */
  public String code;
  /**
   * 错误消息
   */
  public String msg;
  /**
   * 返回数据载体
   */
  public Object data;
}
