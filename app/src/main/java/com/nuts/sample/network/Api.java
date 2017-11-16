package com.nuts.sample.network;

import com.nuts.lib.network.ApiInvokeHandler;

import java.lang.reflect.Proxy;

public interface Api {

    NetImpl NET_IMPL = new NetImpl();

    AccountApi ACCOUNT_API = (AccountApi) Proxy.newProxyInstance(Api.class.getClassLoader(),
            new Class<?>[]{AccountApi.class}, new ApiInvokeHandler(NET_IMPL));

    AppApi APP_API = (AppApi) Proxy.newProxyInstance(Api.class.getClassLoader(),
            new Class<?>[]{AppApi.class}, new ApiInvokeHandler(NET_IMPL));
}
