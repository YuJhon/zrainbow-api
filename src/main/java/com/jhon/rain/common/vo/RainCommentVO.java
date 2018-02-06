package com.jhon.rain.common.vo;

import lombok.Data;

/**
 * <p>功能描述</br></p>
 *
 * @author jiangy19
 * @version v1.0
 * @projectName zrainbow-api
 * @date 2018/2/5 15:02
 */
@Data
public class RainCommentVO {
  public Integer categoryId;
  /**
   * 评论的类目
   */
  public String category;
  /**
   * 评论的内容
   */
  public String content;
}
