package com.jhon.rain.service;

import com.jhon.rain.domain.RainPictureInfo;

/**
 * <p>功能描述</br></p>
 *
 * @author jiangy19
 * @version v1.0
 * @projectName zrainbow-api
 * @date 2018/1/30 19:46
 */
public interface RainPictureInfoService {
  /**
   * <pre>通过Id查询对应的记录</pre>
   *
   * @param id
   * @return
   */
  RainPictureInfo queryRecordById(Integer id);
}
