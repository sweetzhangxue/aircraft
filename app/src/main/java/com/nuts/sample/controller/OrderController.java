package com.nuts.sample.controller;

import com.nuts.lib.controller.Return;
import com.nuts.sample.model.OrderInfo;

import java.util.List;

public interface OrderController {

    Return<Void> placeOrder(OrderInfo orderInfo);

    Return<Void> cancelOrder(OrderInfo orderInfo);

    Return<List<OrderInfo>> getHistoryOrders();

    Return<List<OrderInfo>> getCurrentOrders();
}
