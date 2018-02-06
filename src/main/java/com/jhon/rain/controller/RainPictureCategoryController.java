package com.jhon.rain.controller;

import com.jhon.rain.common.RainResp;
import com.jhon.rain.common.RespUtil;
import com.jhon.rain.domain.RainPictureCategory;
import com.jhon.rain.service.RainPictureCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>功能描述</br>图片类目控制器</p>
 *
 * @author jiangy19
 * @version v1.0
 * @projectName zrainbow-api
 * @date 2018/1/30 21:09
 */
@RestController
@RequestMapping("/category")
public class RainPictureCategoryController {

  @Autowired
  private RainPictureCategoryService rainPictureCategoryService;

  /**
   * <pre>获取列表</pre>
   * @return
   */
  @GetMapping("/list")
  public RainResp getList(){
    List<RainPictureCategory> list = rainPictureCategoryService.queryAll();
    return RespUtil.ok(list);
  }
}
