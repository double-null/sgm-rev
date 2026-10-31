package io.bidmachine;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class BuildInfo {
    private static volatile BuildInfo instance;
    private final qc.a<Boolean> isDebuggable;
    private volatile String sha1Signature = null;
    private volatile String sha256Signature = null;

    private BuildInfo(final Context context) {
        this.isDebuggable = new qc.a<>(new qc.b() { // from class: io.bidmachine.n2
            @Override // qc.b
            public final Object get() {
                return BuildInfo.lambda$new$0(context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean lambda$new$0(Context context) {
        return Boolean.valueOf((context.getApplicationInfo().flags & 2) != 0);
    }

    public static BuildInfo obtain(Context context) {
        BuildInfo buildInfo = instance;
        if (buildInfo == null) {
            synchronized (BuildInfo.class) {
                buildInfo = instance;
                if (buildInfo == null) {
                    buildInfo = new BuildInfo(context.getApplicationContext());
                    instance = buildInfo;
                }
            }
        }
        return buildInfo;
    }

    public String getSha1Signature(Context context) {
        String str = this.sha1Signature;
        if (str != null) {
            return str;
        }
        String strM = oc.d.m(context);
        this.sha1Signature = strM;
        return strM;
    }

    public String getSha256Signature(Context context) {
        String str = this.sha256Signature;
        if (str != null) {
            return str;
        }
        String strN = oc.d.n(context);
        this.sha256Signature = strN;
        return strN;
    }

    public boolean isDebuggable() {
        return this.isDebuggable.get().booleanValue();
    }
}
