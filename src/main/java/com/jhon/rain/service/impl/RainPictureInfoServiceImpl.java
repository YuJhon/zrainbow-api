package com.jhon.rain.service.impl;

import com.jhon.rain.dao.RainPictureInfoMapper;
import com.jhon.rain.domain.RainPictureInfo;
import com.jhon.rain.service.RainPictureInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>功能描述</br>图片信息业务逻辑实现类</p>
 *
 * @author jiangy19
 * @version v1.0
 * @projectName zrainbow-api
 * @date 2018/1/30 20:17
 */
@Service
@Transactional
public class RainPictureInfoServiceImpl implements RainPictureInfoService {

  @Autowired
  private RainPictureInfoMapper rainPictureInfoMapper;

  @Override
  public RainPictureInfo queryRecordById(Integer id) {
    return rainPictureInfoMapper.selectByPrimaryKey(id);
  }
}
