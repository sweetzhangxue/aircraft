package com.nuts.sample.network;

import com.nuts.lib.network.Get;
import com.nuts.lib.network.Param;
import com.nuts.sample.model.AccountInfo;

public interface AccountApi {

    @Get("/user/register")
    AccountInfo register(@Param("userName") String userName, @Param("password") String password);
}
