package com.nuts.sample.network;

import com.nuts.lib.network.ApiInvokeHandler;

import java.lang.reflect.Proxy;

public interface Api {
    AccountApi ACCOUNT_API = (AccountApi) Proxy.newProxyInstance(Api.class.getClassLoader(),
            new Class<?>[]{AccountApi.class}, new ApiInvokeHandler(new NetImpl()));
}
