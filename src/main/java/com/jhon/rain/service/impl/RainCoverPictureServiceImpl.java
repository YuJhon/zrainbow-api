package com.jhon.rain.service.impl;

import com.jhon.rain.dao.RainCoverPictureMapper;
import com.jhon.rain.domain.RainCoverPicture;
import com.jhon.rain.service.RainCoverPictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * <p>功能描述</br>业务逻辑实现类</p>
 *
 * @author jiangy19
 * @version v1.0
 * @projectName zrainbow-api
 * @date 2018/1/31 19:25
 */
@Service
@Transactional
public class RainCoverPictureServiceImpl implements RainCoverPictureService {

  @Autowired
  private RainCoverPictureMapper coverPictureMapper;

  @Override
  public List<RainCoverPicture> queryAll() {
    return coverPictureMapper.queryAll();
  }
}
