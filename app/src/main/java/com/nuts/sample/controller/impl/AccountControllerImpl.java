package com.nuts.sample.controller.impl;

import com.nuts.lib.controller.Return;
import com.nuts.sample.controller.AccountController;
import com.nuts.sample.model.AccountInfo;
import com.nuts.sample.network.AccountApi;
import com.nuts.sample.network.Api;

public class AccountControllerImpl implements AccountController {

    private AccountApi accountApi = Api.ACCOUNT_API;

    @Override
    public Return<Void> register(AccountInfo accountInfo) {
        // call http api
        // save account info to shared preference
        accountApi.register("", "");
        return null;
    }

    @Override
    public Return<Void> login(AccountInfo accountInfo) {
        return null;
    }

    @Override
    public Return<Void> logout() {
        return null;
    }
}
