package com.jhon.rain.controller;

import com.jhon.rain.common.RainResp;
import com.jhon.rain.common.RespUtil;
import com.jhon.rain.common.dto.RainCommentDTO;
import com.jhon.rain.common.vo.RainCommentVO;
import com.jhon.rain.service.RainCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>功能描述</br>评论模块的控制器</p>
 *
 * @author jiangy19
 * @version v1.0
 * @projectName zrainbow-api
 * @date 2018/1/30 21:08
 */
@RestController
@RequestMapping("comment")
public class RainCommentController {

  @Autowired
  private RainCommentService rainCommentService;

  /**
   * <pre>提交评论</pre>
   *
   * @param id          入参
   * @param rainComment 评论的内容载体
   * @return 统一返回值
   */
  @PostMapping("postComment/{id}")
  public RainResp postComment(@PathVariable(name = "id") Integer id, @RequestBody RainCommentVO rainComment) {
    rainComment.setCategoryId(id);
    int influenceRecords = rainCommentService.postComment(rainComment);
    if (influenceRecords > 0) {
      return RespUtil.ok("提交评论成功！");
    } else {
      return RespUtil.systemExcp("评论失败！");
    }
  }

  /**
   * <pre>获取评论列表</pre>
   *
   * @param pageNum    当前页
   * @param categoryId 当前评论的对象
   * @param category   评论的类别
   * @return 统一返回值
   */
  @GetMapping("/list/{category}/{categoryId}/{pageNum}")
  public RainResp commentList(@PathVariable(name = "category") String category,
                              @PathVariable(name = "categoryId") Integer categoryId,
                              @PathVariable(name = "pageNum") Integer pageNum) {
    if (pageNum == null || pageNum <=0){
      pageNum = 1;
    }
    List<RainCommentDTO> list = rainCommentService.getCommentList(pageNum, categoryId, category);
    return RespUtil.ok(list);
  }
}
