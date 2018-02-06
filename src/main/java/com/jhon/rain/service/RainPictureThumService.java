package com.jhon.rain.service;

import com.jhon.rain.domain.RainPictureThum;

import java.util.List;

/**
 * <p>功能描述</br></p>
 *
 * @author jiangy19
 * @version v1.0
 * @projectName zrainbow-api
 * @date 2018/1/30 19:46
 */
public interface RainPictureThumService {
  /**
   * <pre>通过图片id查询缩略图列表</pre>
   * @param pictureInfo
   * @return
   */
  List<RainPictureThum> queryRecordByPictureInfo(Integer pictureInfo);
}
