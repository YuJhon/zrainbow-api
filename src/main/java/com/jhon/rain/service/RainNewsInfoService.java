package com.jhon.rain.service;

import com.jhon.rain.domain.RainNewsInfo;

import java.util.List;

/**
 * <p>功能描述</br>新闻资讯业务逻辑接口定义</p>
 *
 * @author jiangy19
 * @version v1.0
 * @projectName zrainbow-api
 * @date 2018/1/30 19:45
 */
public interface RainNewsInfoService {
  /**
   * 查询所有的记录
   *
   * @return
   */
  List<RainNewsInfo> queryAll();

  /**
   * <pre>根据id查询记录</pre>
   * @param id
   * @return
   */
  RainNewsInfo queryById(Integer id);
}
