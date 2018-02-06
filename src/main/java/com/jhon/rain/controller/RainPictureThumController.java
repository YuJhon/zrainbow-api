package com.jhon.rain.controller;

import com.jhon.rain.common.RainResp;
import com.jhon.rain.common.RespUtil;
import com.jhon.rain.domain.RainPictureThum;
import com.jhon.rain.service.RainPictureThumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>功能描述</br></p>
 *
 * @author jiangy19
 * @version v1.0
 * @projectName zrainbow-api
 * @date 2018/1/30 21:09
 */
@RestController
@RequestMapping("pictureThum")
public class RainPictureThumController {

  @Autowired
  private RainPictureThumService rainPictureThumService;

  @GetMapping("/list/{pictureInfo}")
  public RainResp getPicThumsByPictureInfo(@PathVariable(name = "pictureInfo") Integer pictureInfo){
    List<RainPictureThum> list = rainPictureThumService.queryRecordByPictureInfo(pictureInfo);
    return RespUtil.ok(list);
  }
}
