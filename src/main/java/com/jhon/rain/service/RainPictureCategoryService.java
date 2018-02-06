package com.jhon.rain.service;

import com.jhon.rain.domain.RainPictureCategory;

import java.util.List;

/**
 * <p>功能描述</br></p>
 *
 * @author jiangy19
 * @version v1.0
 * @projectName zrainbow-api
 * @date 2018/1/30 19:46
 */
public interface RainPictureCategoryService {
  /**
   * <pre>查询所有的记录</pre>
   *
   * @return
   */
  List<RainPictureCategory> queryAll();
}
