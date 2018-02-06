package com.jhon.rain.controller;

import com.jhon.rain.common.RainResp;
import com.jhon.rain.common.RespUtil;
import com.jhon.rain.domain.RainNewsInfo;
import com.jhon.rain.service.RainNewsInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>功能描述</br>资讯消息控制器</p>
 *
 * @author jiangy19
 * @version v1.0
 * @projectName zrainbow-api
 * @date 2018/1/30 21:08
 */
@RestController
@RequestMapping("/news")
@Slf4j
public class RainNewsInfoController {

  @Autowired
  private RainNewsInfoService rainNewsInfoService;

  @GetMapping("/list")
  public RainResp getNewsInfoList() {
    List<RainNewsInfo> list = rainNewsInfoService.queryAll();
    return RespUtil.ok(list);
  }

  @GetMapping("/detail/{id}")
  public RainResp getCoverDetails(@PathVariable(name = "id") Integer id){
    RainNewsInfo info = rainNewsInfoService.queryById(id);
    return RespUtil.ok(info);
  }
}
