package com.jhon.rain.service;

import com.jhon.rain.common.dto.RainCommentDTO;
import com.jhon.rain.common.vo.RainCommentVO;

import java.util.List;

/**
 * <p>功能描述</br></p>
 *
 * @author jiangy19
 * @version v1.0
 * @projectName zrainbow-api
 * @date 2018/1/30 19:44
 */
public interface RainCommentService {
  /**
   * <pre>发表请评论</pre>
   * @param rainComment
   * @return
   */
  int postComment(RainCommentVO rainComment);

  /**
   * <pre>获取评论列表</pre>
   * @param pageNum 第几页
   * @param categoryId 类目对应的Id
   * @param category 类别
   * @return 评论列表
   */
  List<RainCommentDTO> getCommentList(Integer pageNum,Integer categoryId, String category);
}
