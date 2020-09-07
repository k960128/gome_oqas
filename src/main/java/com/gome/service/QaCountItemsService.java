package com.gome.service;

import com.gome.pojo.QaCountItems;
import com.gome.util.ResultUtil;

import java.util.Date;
import java.util.List;

/**
 * @Description:
 * @Author: WangJinYue
 * @Date: 2020/8/5 17:09
 * @Modified By:
 */
public interface QaCountItemsService {
    // 查询所有为答的题
    List<QaCountItems> getCountList(String thisLinks);

    // 添加套题用户
    boolean updateThisNumber(Integer thisNumber, String userName,String thisLinks);

    // 查看当前用户是否有选中的题
    Integer selectThisNumber(String userName,String thisLinks);

    // 修改题的状态
    Boolean updateIsEnable(String userName,String thisLinks);

}
