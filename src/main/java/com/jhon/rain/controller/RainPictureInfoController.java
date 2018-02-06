package com.jhon.rain.controller;

import com.jhon.rain.common.RainResp;
import com.jhon.rain.common.RespUtil;
import com.jhon.rain.domain.RainPictureInfo;
import com.jhon.rain.service.RainPictureInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>功能描述</br></p>
 *
 * @author jiangy19
 * @version v1.0
 * @projectName zrainbow-api
 * @date 2018/1/30 21:09
 */
@RestController
@RequestMapping("/photoInfo")
public class RainPictureInfoController {

  @Autowired
  private RainPictureInfoService rainPictureInfoService;

  /**
   * <pre>获取图片的详细信息</pre>
   *
   * @param id 主键ID
   * @return
   */
  @GetMapping("/detail/{id}")
  public RainResp getPictureInfoDetail(@PathVariable(name = "id") Integer id) {
    RainPictureInfo rainPictureInfo = rainPictureInfoService.queryRecordById(id);
    return RespUtil.ok(rainPictureInfo);
  }
}
