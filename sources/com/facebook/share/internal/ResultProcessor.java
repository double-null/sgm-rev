package com.facebook.share.internal;

import android.os.Bundle;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.internal.AppCall;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: ResultProcessor.kt */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ResultProcessor {
    private final FacebookCallback<?> appCallback;

    public ResultProcessor(FacebookCallback<?> facebookCallback) {
        this.appCallback = facebookCallback;
    }

    public void onCancel(AppCall appCall) {
        t.f(appCall, "appCall");
        FacebookCallback<?> facebookCallback = this.appCallback;
        if (facebookCallback != null) {
            facebookCallback.onCancel();
        }
    }

    public void onError(AppCall appCall, FacebookException error) {
        t.f(appCall, "appCall");
        t.f(error, "error");
        FacebookCallback<?> facebookCallback = this.appCallback;
        if (facebookCallback != null) {
            facebookCallback.onError(error);
        }
    }

    public abstract void onSuccess(AppCall appCall, Bundle bundle);
}
