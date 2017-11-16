package com.nuts.sample.activity;

import android.os.Bundle;
import android.view.View;

import com.nuts.lib.controller.ControllerCallback;
import com.nuts.sample.R;
import com.nuts.sample.config.Const;
import com.nuts.sample.controller.AccountController;
import com.nuts.sample.controller.OrderController;
import com.nuts.sample.model.AccountInfo;
import com.nuts.sample.model.OrderInfo;

import java.util.List;

public class MainActivity extends BaseActivity {

    private final AccountController accountController = Const.ACCOUNT_CONTROLLER;

    private final OrderController orderController = Const.ORDER_CONTROLLER;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        AccountInfo accountInfo = new AccountInfo();
        accountController.register(accountInfo).asyncUI(new ControllerCallback<Void>() {
            @Override
            public void onResult(Void aVoid) {
                // to do
            }
        });

        orderController.getHistoryOrders().asyncUI(new ControllerCallback<List<OrderInfo>>() {
            @Override
            public void onResult(List<OrderInfo> orderInfos) {

            }
        });
    }
}
