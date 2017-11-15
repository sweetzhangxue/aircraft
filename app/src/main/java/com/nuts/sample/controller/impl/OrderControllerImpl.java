package com.nuts.sample.controller.impl;

import com.nuts.lib.controller.Return;
import com.nuts.sample.controller.OrderController;
import com.nuts.sample.model.OrderInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class OrderControllerImpl implements OrderController {

    private List<OrderInfo> orderInfos;

    private ExecutorService poolOrderExecutor = Executors.newSingleThreadExecutor();

    public OrderControllerImpl() {
        poolOrderExecutor.submit(new Runnable() {
            @Override
            public void run() {

            }
        });
    }

    @Override
    public Return<Void> placeOrder(OrderInfo orderInfo) {
        return null;
    }

    @Override
    public Return<Void> cancelOrder(OrderInfo orderInfo) {
        return null;
    }

    @Override
    public Return<List<OrderInfo>> getHistoryOrders() {
        List<OrderInfo> orderInfos = new ArrayList<>();
        orderInfos.add(new OrderInfo());
        return new Return<List<OrderInfo>>(orderInfos);
    }

    @Override
    public Return<List<OrderInfo>> getCurrentOrders() {
        return null;
    }
}
