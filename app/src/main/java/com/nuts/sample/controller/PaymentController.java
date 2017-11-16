package com.nuts.sample.controller;

import com.nuts.lib.controller.Return;
import com.nuts.sample.model.PayInfo;

// TODO: @zhangxue
public interface PaymentController {

    Return<Void> pay(PayInfo payInfo);
}
