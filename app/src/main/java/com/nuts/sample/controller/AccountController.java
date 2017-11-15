package com.nuts.sample.controller;

import com.nuts.lib.controller.Return;
import com.nuts.sample.model.AccountInfo;

public interface AccountController {

    Return<Void> register(AccountInfo accountInfo);

    Return<Void> login(AccountInfo accountInfo);

    Return<Void> logout();
}
