// Copyright (c) 2014-2017 Bytter. All rights reserved.
// ============================================================================
// CURRENT VERSION
// ============================================================================
// CHANGE LOG
// V2.0 : 2017年4月19日, liuwl, creation
// ============================================================================
package com.betterjr.modules.contract;

/**
 * @author liuwl
 *
 */
public interface IContractTypeService {
    /**
     * 业务类型列表
     * @return
     */
    String webQueryTypeList();

    /**
     * 业务类型列表 simple
     * @return
     */
    String webQuerySimpleTypeList();
}
