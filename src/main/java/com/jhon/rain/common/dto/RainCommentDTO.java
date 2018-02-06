package com.jhon.rain.common.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>功能描述</br></p>
 *
 * @author jiangy19
 * @version v1.0
 * @projectName zrainbow-api
 * @date 2018/2/5 16:21
 */
@Data
public class RainCommentDTO {
  private Integer id;

  private Integer type;

  private Date createdTime;

  private String content;

  private BigDecimal sort;

  private String username;
}
