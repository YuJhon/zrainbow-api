package com.jhon.rain.dao;

import com.jhon.rain.common.dto.RainCommentDTO;
import com.jhon.rain.domain.RainComment;
import org.apache.ibatis.annotations.Param;

import java.util.List;
/**
 * <p>功能描述</br>评论DAO</p>
 *
 * @author jiangy19
 * @version v1.0
 * @projectName zrainbow-api
 * @date 2018/1/30 19:47
 */
public interface RainCommentMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(RainComment record);

    int insertSelective(RainComment record);

    RainComment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RainComment record);

    int updateByPrimaryKey(RainComment record);

    List<RainCommentDTO> queryRecordByTypeAndPhotoInfo(@Param("photoInfo") Integer categoryId, @Param("type") Integer type);

    List<RainCommentDTO> queryRecordByTypeAndNewsInfo(@Param("newsInfo") Integer categoryId, @Param("type") Integer type);

    List<RainCommentDTO> queryRecordByTypeAndGoodsInfo(@Param("goodsInfo") Integer categoryId, @Param("type") Integer type);
}