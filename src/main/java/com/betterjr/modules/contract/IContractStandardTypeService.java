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
public interface IContractStandardTypeService {

    /**
     * @return
     */
    String webQueryTypeList(Long anTypeId);

    /**
     * @return
     */
    String webQuerySimpleTypeList(Long anTypeId);
    
    /**
     * 新增标准合同
     */
	String webContractStandards(Map<String, Object> anMap);
		
    /**
     * 分页查询标准合同类型
     */
    String webQueryContractStandardType(int anPageNum, int anPageSize, String anFlag);
    
    /**
     * 编辑标准合同类型
     */
    String webSaveModifyContractType(Map<String,  Object> anMap, Long id);
    
    /**
     * 删除标准合同类型
     */
    String webSaveDeleteContractStandardType(Long id);
    
    /**
     * 查询未启用标准合同类型
     */
    String webQueryUnEnableContractStandardType(int anPageNum, int anPageSize, String anFlag);
    
    /**
     * 启用标准合同类型
     */
    String webSaveEnableContractStandardTyp(Long id);
    
    /**
     * 查询未启用标准合同类型
     */
    String webQueryAllContractStandardType(Map<String, Object> anMap,int anPageNum, int anPageSize, String anFlag);
    /**
     * 启用标准合同类型
     */
    String webSaveStopContractStandardTyp(Long id);
}
