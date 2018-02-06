package com.jhon.rain.controller;

import com.jhon.rain.common.RainResp;
import com.jhon.rain.common.RespUtil;
import com.jhon.rain.common.dto.RainGoodsDetailDTO;
import com.jhon.rain.common.dto.RainGoodsInfoDTO;
import com.jhon.rain.domain.RainGoodsInfo;
import com.jhon.rain.service.RainGoodsDetailService;
import com.jhon.rain.service.RainGoodsInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>功能描述</br>商品信息控制器</p>
 *
 * @author jiangy19
 * @version v1.0
 * @projectName zrainbow-api
 * @date 2018/1/30 21:08
 */
@RestController
@RequestMapping("goods")
public class RainGoodsInfoController {

  @Autowired
  private RainGoodsInfoService rainGoodsInfoService;

  @Autowired
  private RainGoodsDetailService rainGoodsDetailService;

  /**
   * <pre>获取商品列表</pre>
   *
   * @return
   */
  @GetMapping("/list")
  public RainResp getGoodsList() {
    List<RainGoodsInfo> list = rainGoodsInfoService.queryAll();
    return RespUtil.ok(list);
  }

  /**
   * <pre>获取图片信息</pre>
   *
   * @param ids
   * @return
   */
  @GetMapping("/getGoodsInfo/{ids}")
  public RainResp getGoodsInfoByIds(@PathVariable(name = "ids") String ids) {
    if (ids == null || ids.length() <= 0) {
      return RespUtil.error("500100", "ids不能为空！");
    }
    List<RainGoodsInfoDTO> list = rainGoodsInfoService.queryRecordByIds(ids);
    return RespUtil.ok(list);
  }

  /**
   * <pre>获取商品信息</pre>
   *
   * @param id
   * @return
   */
  @GetMapping("/goodsInfo/{id}")
  public RainResp getGoodsWholeInfo(@PathVariable(name = "id") Integer id) {
    RainGoodsInfo rainGoodsInfo = rainGoodsInfoService.queryByGoodsInfo(id);
    return RespUtil.ok(rainGoodsInfo);
  }

  /**
   * <pre>获取图片详情</pre>
   *
   * @param goodsId 商品Id
   * @return
   */
  @GetMapping("/goodsDesc/{goodsId}")
  public RainResp getGoodsDetail(@PathVariable(name = "goodsId") Integer goodsId) {
    RainGoodsDetailDTO rainGoodsDetail = rainGoodsDetailService.queryByGoodsInfo(goodsId);
    return RespUtil.ok(rainGoodsDetail);
  }
}
