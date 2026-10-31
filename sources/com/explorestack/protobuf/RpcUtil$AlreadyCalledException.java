package com.explorestack.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class RpcUtil$AlreadyCalledException extends RuntimeException {
    public RpcUtil$AlreadyCalledException() {
        super("This RpcCallback was already called and cannot be called multiple times.");
    }
}
