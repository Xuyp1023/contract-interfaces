package com.betterjr.modules.contract;

import com.betterjr.modules.contract.data.ContractStubData;

public interface IEsignSingerService {
    /**
     * 发送手机验证码
     * 
     * @param anAccountId
     *            在电子合同服务提供方的账户
     * @return
     */
    public boolean sendSMS(final Long anCustNo, final Boolean anPerson);

    /**
     * 签署电子合同
     * 
     * @param anAccountId
     *            在电子合同服务提供方的账户
     * @param anStamperData
     *            印章图片信息，使用了BASE64编码
     * @param anStub
     *            签署方信息
     * @param anSourceFileName
     *            电子合同文件
     * @param anDestFileName
     *            签署后的电子合同文件
     * @return
     */
    public ContractStubData signData(final Long anCustNo, final ContractStubData anStub, final byte[] anData,
            final String anVcode, final Boolean anPerson);
}
