package io.bidmachine.analytics;

import ad.d;
import android.content.Context;
import android.util.Base64;
import id.p;
import io.bidmachine.analytics.internal.h.e;
import java.util.Map;
import java.util.concurrent.Executors;
import kotlin.collections.o;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.u;
import ud.o0;
import ud.p0;
import ud.t1;
import ud.t2;
import wc.g0;
import wc.k;
import wc.m;
import wc.r;
import wc.s;
import zc.f;

/* JADX INFO: loaded from: classes4.dex */
public final class BidMachineAnalytics {
    public static final BidMachineAnalytics INSTANCE = new BidMachineAnalytics();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final k f16736a = m.a(b.f16746a);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f16737b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static io.bidmachine.analytics.internal.p003b.a f16738c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static io.bidmachine.analytics.internal.p002a.a f16739d;

    static final class a extends l implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f16740a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f16741b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AnalyticsConfig f16742c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f16743d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Context f16744e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ ConfigureListener f16745f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AnalyticsConfig analyticsConfig, String str, Context context, ConfigureListener configureListener, f fVar) {
            super(2, fVar);
            this.f16742c = analyticsConfig;
            this.f16743d = str;
            this.f16744e = context;
            this.f16745f = configureListener;
        }

        @Override // id.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, f fVar) {
            return ((a) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final f create(Object obj, f fVar) {
            a aVar = new a(this.f16742c, this.f16743d, this.f16744e, this.f16745f, fVar);
            aVar.f16741b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objC;
            Object objC2;
            d.f();
            if (this.f16740a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            AnalyticsConfig analyticsConfig = this.f16742c;
            try {
                r.a aVar = r.f27774b;
                BidMachineAnalytics bidMachineAnalytics = BidMachineAnalytics.INSTANCE;
                bidMachineAnalytics.setEncryptionManager$bidmachine_android_sdk_j_3_6_1(bidMachineAnalytics.a(Base64.decode(analyticsConfig.getBpk(), 2)));
                objC = r.c(g0.f27756a);
            } catch (Throwable th) {
                r.a aVar2 = r.f27774b;
                objC = r.c(s.a(th));
            }
            if (r.n(objC)) {
            }
            r.g(objC);
            try {
                BidMachineAnalytics.INSTANCE.a(this.f16744e, this.f16742c, this.f16745f);
                objC2 = r.c(g0.f27756a);
            } catch (Throwable th2) {
                r.a aVar3 = r.f27774b;
                objC2 = r.c(s.a(th2));
            }
            if (r.n(objC2)) {
            }
            r.g(objC2);
            return g0.f27756a;
        }
    }

    static final class b extends u implements id.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f16746a = new b();

        b() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o0 invoke() {
            return p0.a(t2.b(null, 1, null).z(t1.b(Executors.newSingleThreadExecutor())));
        }
    }

    private BidMachineAnalytics() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final io.bidmachine.analytics.internal.p003b.a a(byte[] bArr) {
        io.bidmachine.analytics.internal.p004c.a aVar = new io.bidmachine.analytics.internal.p004c.a();
        return new io.bidmachine.analytics.internal.p003b.a(aVar, new io.bidmachine.analytics.internal.p005d.a(bArr, aVar.getName(), null, false, 12, null));
    }

    private final void b(Context context) {
        e.f16938a.d(a(context));
    }

    public static final void configure(Context context, AnalyticsConfig analyticsConfig) {
        configure(context, analyticsConfig, null);
    }

    public static final Map<String, Map<String, Object>> getImpData(int i10) {
        io.bidmachine.analytics.internal.g.a aVar = (io.bidmachine.analytics.internal.g.a) o.E(io.bidmachine.analytics.internal.g.a.values(), i10);
        return aVar == null ? kotlin.collections.o0.h() : e.f16938a.a(aVar);
    }

    public static final Object getProperty(String str) {
        return e.f16938a.a(str);
    }

    public static final void initialize(Context context) {
        e.f16938a.c(INSTANCE.a(context));
    }

    public final io.bidmachine.analytics.internal.p003b.a getEncryptionManager$bidmachine_android_sdk_j_3_6_1() {
        return f16738c;
    }

    public final o0 getScope$bidmachine_android_sdk_j_3_6_1() {
        return (o0) f16736a.getValue();
    }

    public final String getSessionId$bidmachine_android_sdk_j_3_6_1() {
        return f16737b;
    }

    public final void setEncryptionManager$bidmachine_android_sdk_j_3_6_1(io.bidmachine.analytics.internal.p003b.a aVar) {
        f16738c = aVar;
    }

    public static final void configure(Context context, AnalyticsConfig analyticsConfig, ConfigureListener configureListener) {
        String sessionId = analyticsConfig.getSessionId();
        f16737b = sessionId;
        initialize(context);
        BidMachineAnalytics bidMachineAnalytics = INSTANCE;
        bidMachineAnalytics.b(context);
        ud.k.d(bidMachineAnalytics.getScope$bidmachine_android_sdk_j_3_6_1(), null, null, new a(analyticsConfig, sessionId, context.getApplicationContext(), configureListener, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Context context, AnalyticsConfig analyticsConfig, ConfigureListener configureListener) {
        io.bidmachine.analytics.internal.p002a.a aVarA = a(context);
        io.bidmachine.analytics.internal.v.a.f17387a.a(aVarA, analyticsConfig);
        e.f16938a.a(aVarA, analyticsConfig);
        if (configureListener != null) {
            configureListener.onConfigured();
        }
    }

    private final synchronized io.bidmachine.analytics.internal.p002a.a a(Context context) {
        io.bidmachine.analytics.internal.p002a.a aVar;
        aVar = f16739d;
        if (aVar == null) {
            aVar = new io.bidmachine.analytics.internal.p002a.a(context);
            f16739d = aVar;
        }
        return aVar;
    }

    public static /* synthetic */ void getScope$bidmachine_android_sdk_j_3_6_1$annotations() {
    }
}
