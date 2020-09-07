package com.gome.service;

import com.gome.pojo.GomeQaRule;

public interface GomeQaRuleService {

    /**
     * 根据环节号查询流程规则
     */
    GomeQaRule findGomeQaRuleByLinks(int this_Links);
}
