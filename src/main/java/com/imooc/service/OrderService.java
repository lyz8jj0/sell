package com.imooc.service;

import com.imooc.dto.OrderDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface OrderService {

    // TODO: 2019/3/5  创建订单
    OrderDTO create(OrderDTO orderDTO);

    // TODO: 2019/3/5  查询单个订单
    OrderDTO findOne(String orderId);

    // TODO: 2019/3/5  查询订单列表
    Page<OrderDTO> findList(String buyerOpenid, Pageable pageable);

    // TODO: 2019/3/5  取消订单
    OrderDTO cancel(OrderDTO orderDTO);

    // TODO: 2019/3/5  完结订单
    OrderDTO finish(OrderDTO orderDTO);

    // TODO: 2019/3/5  支付订单
    OrderDTO paid(OrderDTO orderDTO);
}
