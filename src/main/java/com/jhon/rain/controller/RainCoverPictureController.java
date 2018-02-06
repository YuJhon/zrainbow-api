package com.jhon.rain.controller;

import com.jhon.rain.common.RainResp;
import com.jhon.rain.common.RespUtil;
import com.jhon.rain.domain.RainCoverPicture;
import com.jhon.rain.service.RainCoverPictureService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>功能描述</br>封面图片的控制器</p>
 *
 * @author jiangy19
 * @version v1.0
 * @projectName zrainbow-api
 * @date 2018/1/31 19:26
 */
@RestController
@RequestMapping("/coverPic")
@Slf4j
public class RainCoverPictureController {

  @Autowired
  private RainCoverPictureService rainCoverPictureService;

  @GetMapping("/list")
  public RainResp getCoverList() {
    List<RainCoverPicture> list = rainCoverPictureService.queryAll();
    return RespUtil.ok(list);
  }
}
