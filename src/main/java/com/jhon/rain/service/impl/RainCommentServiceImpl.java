package com.jhon.rain.service.impl;

import com.github.pagehelper.PageHelper;
import com.jhon.rain.common.dto.RainCommentDTO;
import com.jhon.rain.common.enums.CommentTypeEnum;
import com.jhon.rain.common.vo.RainCommentVO;
import com.jhon.rain.dao.RainCommentMapper;
import com.jhon.rain.domain.RainComment;
import com.jhon.rain.service.RainCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.xml.stream.events.Comment;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * <p>功能描述</br>评论的业务逻辑实现类</p>
 *
 * @author jiangy19
 * @version v1.0
 * @projectName zrainbow-api
 * @date 2018/1/30 20:15
 */
@Service
@Transactional
public class RainCommentServiceImpl implements RainCommentService {

  @Autowired
  private RainCommentMapper rainCommentMapper;

  @Override
  public int postComment(RainCommentVO rainCommentVO) {
    RainComment rainComment = new RainComment();
    rainComment.setContent(rainCommentVO.getContent());
    /** 获取枚举 **/
    CommentTypeEnum contentTypeEnum = CommentTypeEnum.getTypeByValue(rainCommentVO.getCategory());
    if (contentTypeEnum != null) {
      rainComment.setType(contentTypeEnum.getValue());
      if (CommentTypeEnum.NEWS.equals(contentTypeEnum)) {
        rainComment.setNewsInfo(rainCommentVO.getCategoryId());
      } else if (CommentTypeEnum.GOODS.equals(contentTypeEnum)) {
        rainComment.setGoodsInfo(rainCommentVO.getCategoryId());
      } else if (CommentTypeEnum.PICTURE.equals(contentTypeEnum)) {
        rainComment.setPictureInfo(rainCommentVO.getCategoryId());
      }
    }
    rainComment.setCreatedTime(new Date());
    rainComment.setSort(BigDecimal.ONE);
    return rainCommentMapper.insert(rainComment);
  }

  @Override
  public List<RainCommentDTO> getCommentList(Integer pageNum,Integer categoryId, String category) {
    //使用分页插件,核心代码就这一行
    PageHelper.startPage(pageNum,5);
    CommentTypeEnum contentTypeEnum = CommentTypeEnum.getTypeByValue(category);
    if (contentTypeEnum != null){
      Integer type = contentTypeEnum.getValue();
      if (CommentTypeEnum.NEWS.equals(contentTypeEnum)){
        return rainCommentMapper.queryRecordByTypeAndNewsInfo(categoryId,type);
      }else if (CommentTypeEnum.GOODS.equals(contentTypeEnum)){
        return rainCommentMapper.queryRecordByTypeAndGoodsInfo(categoryId,type);
      }else if (CommentTypeEnum.PICTURE.equals(contentTypeEnum)){
        return rainCommentMapper.queryRecordByTypeAndPhotoInfo(categoryId,type);
      }
    }
    return null;
  }
}
