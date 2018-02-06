package com.jhon.rain.service.impl;

import com.jhon.rain.dao.RainNewsInfoMapper;
import com.jhon.rain.domain.RainNewsInfo;
import com.jhon.rain.service.RainNewsInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * <p>功能描述</br>资讯信息业务逻辑实现类</p>
 *
 * @author jiangy19
 * @version v1.0
 * @projectName zrainbow-api
 * @date 2018/1/30 20:17
 */
@Service
@Transactional
public class RainNewsInfoServiceImpl implements RainNewsInfoService {

  @Autowired
  private RainNewsInfoMapper rainNewsInfoMapper;

  @Override
  public List<RainNewsInfo> queryAll() {
    return rainNewsInfoMapper.queryAll();
  }

  @Override
  public RainNewsInfo queryById(Integer id) {
    return rainNewsInfoMapper.selectByPrimaryKey(id);
  }
}
