package com.imooc.dao;

import com.imooc.entity.SellerInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by 李新宇
 * 2019-04-01 15:15
 */
public interface SellerInfoDao extends JpaRepository<SellerInfo, String> {

    SellerInfo findByOpenid(String openid);

}
