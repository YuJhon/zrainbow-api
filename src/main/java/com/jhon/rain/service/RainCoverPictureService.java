package com.jhon.rain.service;

import com.jhon.rain.domain.RainCoverPicture;

import java.util.List;

/**
 * <p>功能描述</br>封面图片的业务逻辑实现类</p>
 *
 * @author jiangy19
 * @version v1.0
 * @projectName zrainbow-api
 * @date 2018/1/31 19:25
 */
public interface RainCoverPictureService {
  /**
   * <pre>查询所有的记录</pre>
   * @return
   */
  List<RainCoverPicture> queryAll();
}
