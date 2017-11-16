package com.nuts.sample.controller;

import com.nuts.lib.controller.Return;

public interface AppController {

    String getVersion();

    Return<Void> checkVersion();

    Return<Void> upgrade();
}
