package com.nuts.sample.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import com.umeng.analytics.MobclickAgent;
import com.umeng.analytics.MobclickAgent.EScenarioType;

public class BaseActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setUmengScenarioType();
    }



    @Override
    protected void onResume() {
        super.onResume();
        MobclickAgent.onResume(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        MobclickAgent.onPause(this);
    }

    private void setUmengScenarioType() {
        /**
         * 场景类型设置接口:
         * etype是官方场景，有如下场景:

         EScenarioType.E_UM_NORMAL 普通统计场景类型

         EScenarioType.E_UM_GAME 游戏场景类型
         */

        MobclickAgent.setScenarioType(this, EScenarioType.E_UM_NORMAL);
        MobclickAgent.setSessionContinueMillis(1000);
    }
}
