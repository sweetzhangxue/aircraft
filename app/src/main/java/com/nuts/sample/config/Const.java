package com.nuts.sample.config;

import com.google.gson.Gson;
import com.nuts.lib.controller.ProxyInvokeHandler;
import com.nuts.sample.controller.AccountController;
import com.nuts.sample.controller.OrderController;
import com.nuts.sample.controller.PaymentController;
import com.nuts.sample.controller.impl.AccountControllerImpl;
import com.nuts.sample.controller.impl.OrderControllerImpl;
import com.nuts.sample.controller.impl.PaymentControllerImpl;

public interface Const {
    Gson GSON = new Gson();

    AccountController ACCOUNT_CONTROLLER = new ProxyInvokeHandler<AccountController>(
            new AccountControllerImpl()
    ).createProxy();

    OrderController ORDER_CONTROLLER = new ProxyInvokeHandler<OrderController>(
            new OrderControllerImpl()
    ).createProxy();

    PaymentController PAYMENT_CONTROLLER = new ProxyInvokeHandler<PaymentController>(
            new PaymentControllerImpl()
    ).createProxy();
}
