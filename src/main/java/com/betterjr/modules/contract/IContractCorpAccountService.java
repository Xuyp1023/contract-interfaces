// Copyright (c) 2014-2017 Bytter. All rights reserved.
// ============================================================================
// CURRENT VERSION
// ============================================================================
// CHANGE LOG
// V2.0 : 2017年4月19日, liuwl, creation
// ============================================================================
package com.betterjr.modules.contract;

import java.util.Map;

/**
 * @author liuwl
 *
 */
public interface IContractCorpAccountService {
    /**
     *注册企业帐号
     * @param anParam
     * @return
     */
    String webSaveRegistCorpAccount(Map<String, Object> anParam);

    /**
     * 检查企业帐号
     * @param anCustNo
     * @return
     */
    String webCheckCorpAccount(Long anCustNo);

    /**
     * 获取企业信息
     * @param anCustNo
     * @return
     */
    String webFindCorpInfo(Long anId);

    /**
     * 设置企业帐号签署人
     * @param anCorpAccountId
     * @param anSignerAccountId
     * @return
     */
    String webSaveCorpSigner(Long anCorpAccountId, Long anSignerAccountId);

    /**
     * @param anCustNo
     * @return
     */
    String webQueryCorpAccountInfo(Long anCustNo, int anFlag, int anPageNum, int anPageSize);
}
