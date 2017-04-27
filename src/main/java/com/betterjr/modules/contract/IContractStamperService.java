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
public interface IContractStamperService {
    /**
     * 获取自己机构的印章
     * @return
     */
    String webQueryOwnStamper(Long anCustNo, int anFlag, int anPageNum, int anPageSize);

    /**
     * 上传自己印章
     * @param anParam
     * @param anOriginFileId
     * @return
     */
    String webSaveAddOwnStamper(Map<String, Object> anParam, String anOriginFileId);

    /**
     * 平台上传印章
     * @param anParam
     * @param anOriginFileId
     * @param anFileId
     * @return
     */
    String webSaveAddStamper(Map<String, Object> anParam, String anOriginFileId, String anFileId);

    /**
     * 平台制作印章
     * @param anId
     * @param anFileId
     * @return
     */
    String webSaveMakeStamper(Long anId, String anFileId);

    /**
     * 平台查询印章列表
     * @param anParam
     * @return
     */
    String webQueryAllStamper(Map<String, Object> anParam, int anFlag, int anPageNum, int anPageSize);

    /**
     * 查询印章详情
     * @param anId
     * @return
     */
    String webFindStamper(Long anId);

    /**
     * 检查公司是否已经制作电子印章
     * @param anCustNo
     * @return
     */
    String webFindCheckStamper(Long anCustNo);
}
