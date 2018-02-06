package com.jhon.rain.service.impl;

import com.jhon.rain.dao.RainPictureThumMapper;
import com.jhon.rain.domain.RainPictureThum;
import com.jhon.rain.service.RainPictureThumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * <p>功能描述</br>图片缩略图业务逻辑实现类</p>
 *
 * @author jiangy19
 * @version v1.0
 * @projectName zrainbow-api
 * @date 2018/1/30 20:18
 */
@Service
@Transactional
public class RainPictureThumServiceImpl implements RainPictureThumService {

  @Autowired
  private RainPictureThumMapper rainPictureThumMapper;

  @Override
  public List<RainPictureThum> queryRecordByPictureInfo(Integer pictureInfo) {
    return rainPictureThumMapper.queryRecordByPictureInfo(pictureInfo);
  }
}
