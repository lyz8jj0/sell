package com.imooc.service;

import com.imooc.dto.OrderDTO;

/**
 * 推送消息
 * Created by 李新宇
 * 2019-04-01 19:45
 */
public interface PushMessageService {

    void orderStatus(OrderDTO orderDTO);
}
