// Copyright (c) 2014-2017 Bytter. All rights reserved.
// ============================================================================
// CURRENT VERSION
// ============================================================================
// CHANGE LOG
// V2.0 : 2017年4月19日, liuwl, creation
// ============================================================================
package com.betterjr.modules.contract;

import java.util.List;
import java.util.Map;

/**
 * @author liuwl
 *
 */
public interface IContractTemplateService {
    /**
     * 查询公司拥有标准合同
     * @param anCustNo
     * @param anPageSize
     * @param anPageNum
     * @param anFlag
     * @param anTypeId
     * @return
     */
    String webQueryStandardType(Long anCustNo, String anBusinStatus, int anFlag, int anPageNum, int anPageSize);

    /**
     * 查询公司未拥有标准合同
     * @param anCustNo
     * @param anTypeId
     * @return
     */
    String webQueryUnusedStandardType(Long anCustNo, Long anTypeId);

    /**
     * 启用标准合同
     * @param anCustNo
     * @param anStandardTypeIds
     * @return
     */
    String webSaveEnableStandardType(Long anCustNo, String anStandardTypeIds);

    /**
     * 移除未使用标准合同
     * @param anCustNo
     * @param anStandardTypeIds
     * @return
     */
    String webSaveRemoveStandardType(Long anCustNo, Long anStandardTypeId);

    /**
     * 获取未使用的合同模板列表
     * @param anCustNo
     * @param anTypeId
     * @param anFlag
     * @param anPageNum
     * @param anPageSize
     * @return
     */
    String webQueryUnusedConstractTemplate(Long anCustNo, Long anTypeId, int anFlag, int anPageNum, int anPageSize);

    /**
     * 查询电子合同文本
     * @param anCustNo
     * @param anBusinStatus
     * @param anStartDate
     * @param anEndDate
     * @param anFlag
     * @param anPageNum
     * @param anPageSize
     * @return
     */
    String webQueryText(Map<String, Object> anParam, int anFlag, int anPageNum, int anPageSize);

    /**
     * 查询电子合同文本
     * @param anParam
     * @param anFlag
     * @param anPageNum
     * @param anPageSize
     * @return
     */
    String webQueryAuditText(Map<String, Object> anParam, int anFlag, int anPageNum, int anPageSize);

    /**
     * 审核电子合同文本
     * @param anTemplateId
     * @param anAuditStatus
     * @param anAuditRemark
     * @return
     */
    String webSaveAuditText(Long anTemplateId, String anAuditStatus, String anAuditRemark);

    /**
     * 上传电子合同 模板，示例文件
     * @param anParam
     * @return
     */
    String webSaveUploadText(final Map<String, Object> anParam);

    /**
     *
     * @param anCustNo
     * @param anFlag
     * @param anPageNum
     * @param anPageSize
     * @return
     */
    String webQueryUnusedText(Long anCustNo, int anFlag, int anPageNum, int anPageSize);

    /**
     * 查看详情
     * @param anId
     * @return
     */
    String webFindTemplateDetail(final Long anId);

    /**
     * 查询电子合同模板
     * @param anCustNo
     * @param anBusinStatus
     * @param anStartDate
     * @param anEndDate
     * @param anFlag
     * @param anPageNum
     * @param anPageSize
     * @return
     */
    String webQueryTemplate(Map<String, Object> anParam, int anFlag, int anPageNum, int anPageSize);

    /**
     * 查询电子合同模板
     * @param anCustNo
     * @param anBusinStatus
     * @param anStartDate
     * @param anEndDate
     * @param anFlag
     * @param anPageNum
     * @param anPageSize
     * @return
     */
    String webQueryAuditTemplate(Map<String, Object> anParam, int anFlag, int anPageNum, int anPageSize);

    /**
     * 上传电子合同 模板，示例文件
     * @param anTemplateId
     * @param anOriginTemplateId
     * @param anOrginSimpleId
     * @param anOriginSingerCount
     * @param anOriginNoPattern
     * @return
     */
    String webSaveUploadTemplate(Long anTemplateId, String anTemplateFileId, String anCommon);

    /**
     * @param anTemplateId
     * @param anStampPlaces
     * @return
     */
    String webSaveStampPlace(Long anTemplateId, List<Map<String, Object>> anStampPlaces);

    /**
     * @param anTemplateId
     * @param anAuditStatus
     * @param anAuditRemark
     * @return
     */
    String webSaveAuditTemplate(Long anCustNo, Long anTemplateId, String anAuditStatus, String anAuditRemark);

    /**
     *
     * @param anTemplateId
     * @return
     */
    String webQueryTemplateLog(Long anTemplateId);
}
