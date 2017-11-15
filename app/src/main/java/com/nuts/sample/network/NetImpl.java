package com.nuts.sample.network;

import com.nuts.lib.network.INet;

import java.lang.reflect.Method;
import java.util.TreeMap;

public class NetImpl extends INet {

    private static final String HOST = "http://api.airplane.com";

    @Override
    protected String onCreateUrl(String url, Method method, Object[] args) {
        return HOST + url;
    }

    @Override
    protected void onCreateParams(TreeMap<String, String> params, TreeMap<String, String> headers, Method method, Object[] args) {
        params.put("app_version", "");
        params.put("os_type", "");
        params.put("device_type", "");
        params.put("imei", "");
    }
}
