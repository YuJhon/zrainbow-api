package com.jhon.rain.service.impl;

import com.jhon.rain.common.dto.RainGoodsInfoDTO;
import com.jhon.rain.dao.RainGoodsInfoMapper;
import com.jhon.rain.domain.RainGoodsInfo;
import com.jhon.rain.service.RainGoodsInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>功能描述</br>商品信息业务逻辑实现类</p>
 *
 * @author jiangy19
 * @version v1.0
 * @projectName zrainbow-api
 * @date 2018/1/30 20:16
 */
@Service
@Transactional
public class RainGoodsInfoServiceImpl implements RainGoodsInfoService {

  @Autowired
  private RainGoodsInfoMapper rainGoodsInfoMapper;

  @Override
  public List<RainGoodsInfoDTO> queryRecordByIds(String ids) {
    String[] idsArr = ids.split(",");
    List<String> idsList = new ArrayList<String>(idsArr.length);
    for (int i=0;i<idsArr.length;i++){
      idsList.add(idsArr[i]);
    }
    return rainGoodsInfoMapper.queryRecordByIds(idsList);
  }

  @Override
  public List<RainGoodsInfo> queryAll() {
    return rainGoodsInfoMapper.queryAll();
  }

  @Override
  public RainGoodsInfo queryByGoodsInfo(Integer id) {
    return rainGoodsInfoMapper.selectByPrimaryKey(id);
  }
}
