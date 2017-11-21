package com.nuts.sample;

import com.google.gson.Gson;
import com.nuts.lib.BaseApplication;
import com.nuts.sample.config.Const;
import com.umeng.commonsdk.UMConfigure;

// TODO: zhangxue，youmeng 打点统计
public class GlobalApplication extends BaseApplication {

    @Override
    public Gson getGson() {
        return Const.GSON;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        //设置LOG开关，默认为false
        UMConfigure.setLogEnabled(true);
        /**
         * 设置日志加密
         * 参数：boolean 默认为false（不加密）
         */
        UMConfigure.setEncryptEnabled(true);
        /**
         * 初始化common库
         * 参数1:上下文，不能为空
         * 参数2:设备类型，UMConfigure.DEVICE_TYPE_PHONE为手机、UMConfigure.DEVICE_TYPE_BOX为盒子，默认为手机
         * 参数3:Push推送业务的secret
         *如果您的应用使用了混淆， 请添加 -keep class com.umeng.commonsdk.** {*;}
         */
        UMConfigure.init(this, UMConfigure.DEVICE_TYPE_PHONE, "");

    }
}
