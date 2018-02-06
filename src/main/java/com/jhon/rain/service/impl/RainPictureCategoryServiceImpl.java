package com.jhon.rain.service.impl;

import com.jhon.rain.dao.RainPictureCategoryMapper;
import com.jhon.rain.domain.RainPictureCategory;
import com.jhon.rain.service.RainPictureCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * <p>功能描述</br>图片类目业务逻辑实现类</p>
 *
 * @author jiangy19
 * @version v1.0
 * @projectName zrainbow-api
 * @date 2018/1/30 20:17
 */
@Service
@Transactional
public class RainPictureCategoryServiceImpl implements RainPictureCategoryService {

  @Autowired
  private RainPictureCategoryMapper rainPictureCategoryMapper;

  @Override
  public List<RainPictureCategory> queryAll() {
    return rainPictureCategoryMapper.queryAll();
  }
}
