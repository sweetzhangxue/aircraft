package com.nuts.lib.network;

public interface ProgressListener {
    void transferred(long num, long total);
}
