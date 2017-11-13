package com.nuts.lib;

import android.os.Handler;
import android.os.Looper;

import com.google.gson.Gson;
import com.rits.cloning.Cloner;

public interface Globals {
    Handler UI_HANDLER = new Handler(Looper.getMainLooper());

    Gson GSON = BaseApplication.getGlobalContext().getGson();

    Cloner CLONER = new Cloner();
}
