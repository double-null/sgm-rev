package io.bidmachine;

import android.content.Context;
import io.bidmachine.protobuf.sdk.App;

/* JADX INFO: compiled from: AppParams.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class AppParams {
    private final t0 appReleaseParams;

    public AppParams(t0 appReleaseParams) {
        kotlin.jvm.internal.t.f(appReleaseParams, "appReleaseParams");
        this.appReleaseParams = appReleaseParams;
    }

    public final void build(Context context, com.explorestack.protobuf.adcom.Context.App.Builder contextAppBuilder) {
        kotlin.jvm.internal.t.f(context, "context");
        kotlin.jvm.internal.t.f(contextAppBuilder, "contextAppBuilder");
        String packageName = context.getPackageName();
        if (!(packageName == null || packageName.length() == 0)) {
            contextAppBuilder.setBundle(packageName);
        }
        String strR = io.bidmachine.core.h.r(context);
        if (!(strR == null || strR.length() == 0)) {
            contextAppBuilder.setVer(strR);
        }
        String strQ = io.bidmachine.core.h.q(context);
        if (!(strQ == null || strQ.length() == 0)) {
            contextAppBuilder.setName(strQ);
        }
        this.appReleaseParams.a(context, contextAppBuilder);
    }

    public final void build(Context context, App.Builder appBuilder) {
        kotlin.jvm.internal.t.f(context, "context");
        kotlin.jvm.internal.t.f(appBuilder, "appBuilder");
        b2 b2VarE = b2.e();
        kotlin.jvm.internal.t.e(b2VarE, "get()");
        String strR = io.bidmachine.core.h.r(context);
        if (!(strR == null || strR.length() == 0)) {
            appBuilder.setAppVer(strR);
        }
        String strQ = io.bidmachine.core.h.q(context);
        if (!(strQ == null || strQ.length() == 0)) {
            appBuilder.setAppName(strQ);
        }
        b2VarE.l().fill(appBuilder);
        long jL = b2VarE.L(context);
        if (jL > 0) {
            appBuilder.setFirstLaunchTime(oc.h.p(jL));
        }
        long jQ = b2VarE.q(context);
        if (jQ > 0) {
            appBuilder.setSdkInstallTime(oc.h.p(jQ));
        }
        this.appReleaseParams.b(context, appBuilder);
    }
}
