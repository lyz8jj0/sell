package com.imooc.service.impl;

import com.imooc.dto.OrderDTO;
import com.imooc.service.PayService;
import com.lly835.bestpay.service.impl.BestPayServiceImpl;
import org.springframework.stereotype.Service;

/**
 * Created by 李新宇
 * 2019-03-15 08:46
 */
@Service
public class PayServiceImp implements PayService {

    @Override
    public void create(OrderDTO orderDTO) {

        BestPayServiceImpl bestPayService = new BestPayServiceImpl();

        bestPayService.setWxPayH5Config();


    }
}
