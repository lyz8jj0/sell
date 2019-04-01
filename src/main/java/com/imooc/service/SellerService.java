package com.imooc.service;

import com.imooc.entity.SellerInfo;

/**
 * Created by 李新宇
 * 2019-04-01 15:17
 */
public interface SellerService {

    /**
     * 通过openid查询卖家端信息
     *
     * @param openid
     * @return
     */
    SellerInfo findSellerInfoByOpenid(String openid);
}
