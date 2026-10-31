package io.bidmachine;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.explorestack.protobuf.Timestamp;
import io.bidmachine.protobuf.sdk.App;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: InstallInfoProvider.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class InstallInfoProvider {
    private o7.g installInfo;
    private final AtomicBoolean isInitializeExecuted = new AtomicBoolean(false);

    private final o7.g createBySharedPreferences(Context context) {
        return new o7.g(f2.p(context), f2.q(context), f2.n(context), f2.l(context), f2.o(context), f2.m(context), f2.A(context));
    }

    private final Timestamp getInstallBeginServerTimestamp() {
        Long lB;
        o7.g gVar = this.installInfo;
        if (gVar == null || (lB = gVar.b()) == null) {
            return null;
        }
        long jLongValue = lB.longValue();
        if (jLongValue > 0) {
            return oc.h.r(jLongValue);
        }
        return null;
    }

    private final Timestamp getInstallBeginTimestamp() {
        Long lA;
        o7.g gVar = this.installInfo;
        if (gVar == null || (lA = gVar.a()) == null) {
            return null;
        }
        long jLongValue = lA.longValue();
        if (jLongValue > 0) {
            return oc.h.r(jLongValue);
        }
        return null;
    }

    private final Timestamp getInstallReferrerClickServerTimestamp() {
        Long lD;
        o7.g gVar = this.installInfo;
        if (gVar == null || (lD = gVar.d()) == null) {
            return null;
        }
        long jLongValue = lD.longValue();
        if (jLongValue > 0) {
            return oc.h.r(jLongValue);
        }
        return null;
    }

    private final Timestamp getInstallReferrerClickTimestamp() {
        Long lC;
        o7.g gVar = this.installInfo;
        if (gVar == null || (lC = gVar.c()) == null) {
            return null;
        }
        long jLongValue = lC.longValue();
        if (jLongValue > 0) {
            return oc.h.r(jLongValue);
        }
        return null;
    }

    private final String getInstallReferrerUrl() {
        String strE;
        o7.g gVar = this.installInfo;
        if (gVar == null || (strE = gVar.e()) == null) {
            return null;
        }
        if (strE.length() > 0) {
            return strE;
        }
        return null;
    }

    private final String getInstallVersion() {
        String strF;
        o7.g gVar = this.installInfo;
        if (gVar == null || (strF = gVar.f()) == null) {
            return null;
        }
        if (strF.length() > 0) {
            return strF;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initialize$lambda$0(InstallInfoProvider this$0, Context context) {
        kotlin.jvm.internal.t.f(this$0, "this$0");
        kotlin.jvm.internal.t.f(context, "$context");
        new a(this$0, context).c();
    }

    private final Boolean isGooglePlayInstant() {
        o7.g gVar = this.installInfo;
        if (gVar != null) {
            return gVar.i();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final o7.g toInstallInfo(ReferrerDetails referrerDetails) {
        return new o7.g(referrerDetails.getInstallReferrer(), referrerDetails.getInstallVersion(), Long.valueOf(referrerDetails.getReferrerClickTimestampSeconds()), Long.valueOf(referrerDetails.getInstallBeginTimestampSeconds()), Long.valueOf(referrerDetails.getReferrerClickTimestampServerSeconds()), Long.valueOf(referrerDetails.getInstallBeginTimestampServerSeconds()), Boolean.valueOf(referrerDetails.getGooglePlayInstantParam()));
    }

    public final /* synthetic */ void fill(App.Builder appBuilder) {
        kotlin.jvm.internal.t.f(appBuilder, "appBuilder");
        String installReferrerUrl = getInstallReferrerUrl();
        if (installReferrerUrl != null) {
            appBuilder.setInstallReferrerUrl(installReferrerUrl);
        }
        String installVersion = getInstallVersion();
        if (installVersion != null) {
            appBuilder.setInstallVersion(installVersion);
        }
        Timestamp installReferrerClickTimestamp = getInstallReferrerClickTimestamp();
        if (installReferrerClickTimestamp != null) {
            appBuilder.setInstallReferrerClickTimestamp(installReferrerClickTimestamp);
        }
        Timestamp installBeginTimestamp = getInstallBeginTimestamp();
        if (installBeginTimestamp != null) {
            appBuilder.setInstallTime(installBeginTimestamp);
        }
        Timestamp installReferrerClickServerTimestamp = getInstallReferrerClickServerTimestamp();
        if (installReferrerClickServerTimestamp != null) {
            appBuilder.setInstallReferrerClickServerTimestamp(installReferrerClickServerTimestamp);
        }
        Timestamp installBeginServerTimestamp = getInstallBeginServerTimestamp();
        if (installBeginServerTimestamp != null) {
            appBuilder.setInstallBeginServerTimestamp(installBeginServerTimestamp);
        }
        Boolean boolIsGooglePlayInstant = isGooglePlayInstant();
        if (boolIsGooglePlayInstant != null) {
            appBuilder.setIsGooglePlayInstant(boolIsGooglePlayInstant.booleanValue());
        }
    }

    public final void initialize(final Context context) {
        kotlin.jvm.internal.t.f(context, "context");
        boolean z10 = false;
        if (this.isInitializeExecuted.compareAndSet(false, true)) {
            o7.g gVarCreateBySharedPreferences = createBySharedPreferences(context);
            this.installInfo = gVarCreateBySharedPreferences;
            if (gVarCreateBySharedPreferences != null && gVarCreateBySharedPreferences.h()) {
                z10 = true;
            }
            if (z10) {
                return;
            }
            new Thread(new q7.a() { // from class: io.bidmachine.d4
                @Override // oc.o
                public final void p() {
                    InstallInfoProvider.initialize$lambda$0(this.f17560a, context);
                }
            }).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: InstallInfoProvider.kt */
    final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f16464a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final InstallReferrerClient f16465b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ InstallInfoProvider f16466c;

        public a(InstallInfoProvider installInfoProvider, Context context) {
            kotlin.jvm.internal.t.f(context, "context");
            this.f16466c = installInfoProvider;
            Context applicationContext = context.getApplicationContext();
            kotlin.jvm.internal.t.e(applicationContext, "context.applicationContext");
            this.f16464a = applicationContext;
            InstallReferrerClient installReferrerClientBuild = InstallReferrerClient.newBuilder(applicationContext).build();
            kotlin.jvm.internal.t.e(installReferrerClientBuild, "newBuilder(applicationCo…\n                .build()");
            this.f16465b = installReferrerClientBuild;
        }

        public final void c() {
            try {
                this.f16465b.startConnection(new C0267a());
            } catch (Throwable th) {
                io.bidmachine.core.a.o(th);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: io.bidmachine.InstallInfoProvider$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: InstallInfoProvider.kt */
        final class C0267a implements InstallReferrerStateListener {
            public C0267a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void b(C0267a this$0, int i10) {
                kotlin.jvm.internal.t.f(this$0, "this$0");
                this$0.c(i10);
            }

            public final void c(int i10) {
                if (i10 == 0) {
                    try {
                        a aVar = a.this;
                        InstallInfoProvider installInfoProvider = aVar.f16466c;
                        ReferrerDetails installReferrer = aVar.f16465b.getInstallReferrer();
                        kotlin.jvm.internal.t.e(installReferrer, "installReferrerClient.installReferrer");
                        o7.g installInfo = installInfoProvider.toInstallInfo(installReferrer);
                        if (!installInfo.g()) {
                            a.this.f16466c.installInfo = installInfo;
                            f2.J(a.this.f16464a, installInfo);
                        }
                    } catch (Throwable th) {
                        io.bidmachine.core.a.o(th);
                    }
                }
                a.this.f16465b.endConnection();
            }

            @Override // com.android.installreferrer.api.InstallReferrerStateListener
            public void onInstallReferrerSetupFinished(final int i10) {
                new Thread(new q7.a() { // from class: io.bidmachine.e4
                    @Override // oc.o
                    public final void p() {
                        InstallInfoProvider.a.C0267a.b(this.f17567a, i10);
                    }
                }).start();
            }

            @Override // com.android.installreferrer.api.InstallReferrerStateListener
            public void onInstallReferrerServiceDisconnected() {
            }
        }
    }
}
