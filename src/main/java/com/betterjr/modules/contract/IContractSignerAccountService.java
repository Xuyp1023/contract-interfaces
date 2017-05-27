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
public interface IContractSignerAccountService {
    /**
     * 签署人注册
     * @param anParam
     * @return
     */
    String webSaveRegistSignerAccount(Map<String, Object> anParam);

    /**
     * 获取操作员信息
     * @param anOperId
     * @return
     */
    String webFindOperInfo(Long anId);

    /**
     * 检查操作员
     * @param anOperId
     * @return
     */
    String webCheckSignerAccount(Long anOperId);

    /**
     * @param anCustNo
     * @return
     */
    String webQuerySignerAccountInfo(Long anCustNo, int anFlag, int anPageNum, int anPageSize);
}
