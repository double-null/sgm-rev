package com.vungle.ads.internal.util;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.t;
import wc.g0;

/* JADX INFO: compiled from: ThreadUtil.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class ThreadUtil {
    public static final ThreadUtil INSTANCE = new ThreadUtil();
    private static final Handler UI_HANDLER = new Handler(Looper.getMainLooper());
    private static Executor uiExecutor;

    private ThreadUtil() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: runOnUiThread$lambda-0, reason: not valid java name */
    public static final void m320runOnUiThread$lambda0(id.a tmp0) {
        t.f(tmp0, "$tmp0");
        tmp0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: runOnUiThread$lambda-1, reason: not valid java name */
    public static final void m321runOnUiThread$lambda1(id.a tmp0) {
        t.f(tmp0, "$tmp0");
        tmp0.invoke();
    }

    public final Executor getUiExecutor$vungle_ads_release() {
        return uiExecutor;
    }

    public final boolean isMainThread() {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper == null) {
            return false;
        }
        return mainLooper.isCurrentThread();
    }

    public final void runOnUiThread(final id.a<g0> block) {
        t.f(block, "block");
        if (isMainThread()) {
            block.invoke();
            return;
        }
        Executor executor = uiExecutor;
        if (executor == null) {
            UI_HANDLER.post(new Runnable() { // from class: com.vungle.ads.internal.util.g
                @Override // java.lang.Runnable
                public final void run() {
                    ThreadUtil.m321runOnUiThread$lambda1(block);
                }
            });
        } else if (executor != null) {
            executor.execute(new Runnable() { // from class: com.vungle.ads.internal.util.f
                @Override // java.lang.Runnable
                public final void run() {
                    ThreadUtil.m320runOnUiThread$lambda0(block);
                }
            });
        }
    }

    public final void setUiExecutor$vungle_ads_release(Executor executor) {
        uiExecutor = executor;
    }

    public static /* synthetic */ void getUiExecutor$vungle_ads_release$annotations() {
    }
}
