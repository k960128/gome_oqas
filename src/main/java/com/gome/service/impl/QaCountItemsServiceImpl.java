package com.gome.service.impl;

import com.gome.mapper.QaCountItemsMapper;
import com.gome.pojo.QaCountItems;
import com.gome.pojo.QaCountItemsExample;
import com.gome.service.QaCountItemsService;
import com.gome.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

import static com.gome.enums.ResultEnums.*;

/**
 * @Description:
 * @Author: WangJinYue
 * @Date: 2020/8/5 17:10
 * @Modified By:
 */
@Service
public class QaCountItemsServiceImpl implements QaCountItemsService {
    @Autowired
    private QaCountItemsMapper qaCountItemsMapper;

    @Override
    @Transactional(rollbackFor = {RuntimeException.class, Error.class})
    public List<QaCountItems> getCountList(String thisLinks) {
        System.err.println(new Date());
        QaCountItemsExample example = new QaCountItemsExample();
        QaCountItemsExample.Criteria criteria = example.createCriteria();
        criteria.andRespondentIsNull();
        criteria.andThisLinksEqualTo(thisLinks);
        return qaCountItemsMapper.selectByExample(example);
    }

    /**
     * 修改n套题的 答题人
     *
     * @param thisNumber
     * @param userName
     * @return
     */
    @Override
    @Transactional(rollbackFor = {RuntimeException.class, Error.class})
    public boolean updateThisNumber(Integer thisNumber, String userName,String thisLinks) {
        QaCountItemsExample example = new QaCountItemsExample();
        QaCountItemsExample.Criteria criteria = example.createCriteria();
        criteria.andThisNumberEqualTo(thisNumber);
        criteria.andThisLinksEqualTo(thisLinks);
        List<QaCountItems> list = qaCountItemsMapper.selectByExample(example);
        if (!list.isEmpty()) {
            for (QaCountItems countItems : list) {
                if(thisLinks.equals("2")){
                    countItems.setRespondent(userName);

                }else{
                    countItems.setRespondent(userName);
                    countItems.setIsEnable("是");
                }

                int i = qaCountItemsMapper.updateByPrimaryKey(countItems);
                if (i == 1) {
                    System.out.println(i + "修改成功");
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 查询当前用户是否有选中的题
     *
     * @param userName
     * @return 返回选中的题号
     */
    @Override
    @Transactional(rollbackFor = {RuntimeException.class, Error.class})
    public Integer selectThisNumber(String userName,String thisLinks) {
        QaCountItemsExample example = new QaCountItemsExample();
        QaCountItemsExample.Criteria criteria = example.createCriteria();
        criteria.andRespondentEqualTo(userName);
        criteria.andThisLinksEqualTo(thisLinks);
        List<QaCountItems> list = qaCountItemsMapper.selectByExample(example);
        if (list.size() != 0) {
            for (QaCountItems qaCountItems : list) {
                return qaCountItems.getThisNumber();
            }
        }
        return null;
    }

    /**
     * 修改本套题的状态
     *
     * @param userName
     * @return
     */
    @Override
    @Transactional(rollbackFor = {RuntimeException.class, Error.class})
    public Boolean updateIsEnable(String userName,String thisLinks) {
        QaCountItemsExample example = new QaCountItemsExample();
        QaCountItemsExample.Criteria criteria = example.createCriteria();
        criteria.andRespondentEqualTo(userName);
        criteria.andThisLinksEqualTo(thisLinks);
        List<QaCountItems> list = qaCountItemsMapper.selectByExample(example);
        if (list.size() != 0) {
            for (QaCountItems qaCountItems : list) {
                qaCountItems.setIsEnable("是");
                int i = qaCountItemsMapper.updateByPrimaryKey(qaCountItems);
                if (i != 1) {
                    return false;
                }
            }
        }
        return true;
    }
}
